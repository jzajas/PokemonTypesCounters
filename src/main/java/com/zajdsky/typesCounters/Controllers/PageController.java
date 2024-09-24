package com.zajdsky.typesCounters.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
//TODO    change mappings when everything is done
public class PageController {

//    currently simpleCounters --> Home Page
    @GetMapping("/")
    public String index() {
        return "index";
    }

//    Currently nothing --> simpleCounters
    @GetMapping("/simpleCounters")
    public String simpleCounters() {
        return "simpleCounters";
    }

//    Currently nothing --> Detailed or something else
    @GetMapping("/charts")
    public String charts() {
        return "charts";
    }
}
