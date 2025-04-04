package web.serviсe;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiseImpl implements CarServise {
    private final List<Car> carList = Arrays.asList(
            new Car(1, "TESLA", "red"),
            new Car(2, "BMW", "black"),
            new Car(3, "TOYOTA", "white"),
            new Car(4, "LADA", "baklagane"),
            new Car(5, "KIA", "silver")
    );

    public List<Car> index() {
        return carList;
    }

    @Override
    public List<Car> getCars(int count) {
        return carList.stream().limit(count).collect(Collectors.toList());
    }
}



