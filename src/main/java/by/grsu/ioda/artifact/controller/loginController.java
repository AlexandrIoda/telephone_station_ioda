package by.grsu.ioda.artifact.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/login")
public class loginController {

    @RequestMapping(method = RequestMethod.GET)
    public String login(Model model) {
        return "login";
    }
}