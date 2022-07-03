package web.service;

import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.models.Car;

import java.util.List;

@Service
public class CarServiceImp implements CarService {

    CarDao carDao;

    public CarServiceImp(CarDao carDao) {
        this.carDao = carDao;
    }

    @Override
    public List<Car> getAllCars() {
        return carDao.getAllCars();
    }

    @Override
    public List<Car> getCarsByCount(Integer count) {
        return carDao.getCarsByCount(count);
    }
}
