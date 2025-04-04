package web.serviсe;

import web.model.Car;

import java.util.List;

public interface CarServise {
    List<Car> getCars(int count);

    List<Car> index();
}

