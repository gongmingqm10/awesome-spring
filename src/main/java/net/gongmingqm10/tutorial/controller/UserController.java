package net.gongmingqm10.tutorial.controller;

import net.gongmingqm10.tutorial.model.User;
import net.gongmingqm10.tutorial.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    protected UserService userMapper;

    @RequestMapping(value = "")
    public ModelAndView index() {
        List<User> users = userMapper.getAllUsers();
        ModelAndView modelView = new ModelAndView("users/index");
        modelView.addObject("users", users);
        return modelView;
    }
}
