package web.dao;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarDao {
    private List<Car> cars;

    public List<Car> getCars(Integer count) {
        cars = new ArrayList<>();
        cars.add(new Car("VAZ", 1980, 1));
        cars.add(new Car("Ford", 1998, 2));
        cars.add(new Car("VW", 1996, 3));
        cars.add(new Car("Lada", 2015, 4));
        cars.add(new Car("Nissan", 2010, 5));

        if (count == null) {
            return cars;
        }
        return cars = cars.stream().limit(count).collect(Collectors.toList());
    }
}
