package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.serviсe.CarServise;

import java.util.List;

@Controller
public class CarController {
    private final CarServise carServise;

    @Autowired
    public CarController(CarServise carServise) {
        this.carServise = carServise;
    }

    @GetMapping("/cars")
    public String getCars(@RequestParam(value = "count", required = false, defaultValue = "5") int count, Model model) {
        List<Car> cars;
        if (count >= 5) {
            cars = carServise.index();
        } else {
            cars = carServise.getCars(count);
        }
        model.addAttribute("cars", cars);
        return "cars";
    }


}
