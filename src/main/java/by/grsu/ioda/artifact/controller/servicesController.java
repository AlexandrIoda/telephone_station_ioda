package by.grsu.ioda.artifact.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/services")
public class servicesController {
    @GetMapping
    public String servicesController(){
        return "services";
    }
}
