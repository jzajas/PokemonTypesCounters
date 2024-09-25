package com.zajdsky.typesCounters.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/")
    public String index() {
        return "home";
    }

    @GetMapping("/simplecounters")
    public String simpleCounters() {
        return "simpleCounters";
    }

    @GetMapping("/detailedcounters")
    public String detailedCounters() {
        return "detailedCounters";
    }
}
