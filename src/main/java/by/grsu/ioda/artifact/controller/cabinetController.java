package by.grsu.ioda.artifact.controller;

import by.grsu.ioda.artifact.model.User;
import by.grsu.ioda.artifact.repository.ServiceRepository;
import by.grsu.ioda.artifact.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller
@RequestMapping("/cabinet")
public class cabinetController {

    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    public String login(Model model) {
        return "cabinet";
    }

    @PostMapping
    @ResponseBody
    public String nelogin(Model model, @RequestBody Map<String, Object> payload) {


        try {
            System.out.println(payload.get("dollar").toString());

            User user = (User) model.asMap().get("account");
            user.setBalance(user.getBalance() + 1);

            userService.save(user);


            return "ok";
        } catch (Exception e) {
            return "ne ok";
        }
    }
}