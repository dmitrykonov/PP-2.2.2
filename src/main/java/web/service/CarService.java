package web.service;

import web.models.Car;

import java.util.List;

public interface CarService {
    public List<Car> getAllCars();
    public List<Car> getCarsByCount(Integer count);
}
