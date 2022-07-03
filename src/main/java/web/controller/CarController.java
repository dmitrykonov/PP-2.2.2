package web.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDaoImp;
import web.service.CarServiceImp;

@Controller
public class CarController {
    private CarServiceImp carServiceImp;

    @Autowired
    public CarController(CarServiceImp carServiceImp) {
        this.carServiceImp = carServiceImp;
    }

    @GetMapping(value = "/cars")
    public String getCars(@RequestParam(value = "count", required = false) Integer count, ModelMap model) {
        if (count == null || count >= 5) {
            model.addAttribute("cars", carServiceImp.getAllCars());
        } else {
            model.addAttribute("cars", carServiceImp.getCarsByCount(count));
        }
        return "cars";
    }
}
