package web.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiceImpl;

@Controller
@RequestMapping("/cars")
public class CarController {
    private CarServiceImpl carServiceImpl;

    @Autowired
    public CarController(CarServiceImpl carServiceImpl) {
        this.carServiceImpl = carServiceImpl;
    }

    @GetMapping
    public String getCars(@RequestParam(value = "count", required = false) Integer count, ModelMap model) {
        if (count == null || count >= 5) {
            model.addAttribute("cars", carServiceImpl.getAllCars());
        } else {
            model.addAttribute("cars", carServiceImpl.getCarsByCount(count));
        }
        return "cars";
    }
}
