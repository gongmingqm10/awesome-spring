package net.gongmingqm10.tutorial.api;

import net.gongmingqm10.tutorial.model.User;
import net.gongmingqm10.tutorial.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/api/users")
public class UsersApi {

    @Autowired
    protected UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    List<User> index() {
        return userService.getAllUsers();
    }

}
