package demo.demosecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String handleWelcome() {
        return "home";
    }

    @GetMapping("/home/user")
    public String handleUserWelcome() {
        return "home_user";
    }

    @GetMapping("/home/admin")
    public String handleAdminWelcome() {
        return "home_admin";
    }
}
