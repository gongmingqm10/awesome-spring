package net.gongmingqm10.tutorial.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/books")
public class BookController {

    @RequestMapping(value = "")
    public String index() {
        return "books/index";
    }
}
