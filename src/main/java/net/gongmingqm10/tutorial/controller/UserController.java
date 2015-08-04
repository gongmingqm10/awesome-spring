package net.gongmingqm10.tutorial.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @RequestMapping(value = "/users")
    public String index() {
        return "users/index";
    }
}
