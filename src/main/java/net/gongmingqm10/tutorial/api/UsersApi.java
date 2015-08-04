package net.gongmingqm10.tutorial.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api/users")
public class UsersApi {

    @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody String index() {
        return "hello world";
    }

}
