package com.zajdsky.typesCounters.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class DataDisplayController {

//    Change this to return multiple lists
    @GetMapping("/api/get-selected-names")
    public List<String> getSelectedTypes() {

        return Arrays.asList("Dark", "Fairy", "Bug");
    }

}