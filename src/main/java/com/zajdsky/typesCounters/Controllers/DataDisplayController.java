package com.zajdsky.typesCounters.Controllers;

import com.zajdsky.typesCounters.Templates.TypeImages;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.zajdsky.typesCounters.Services.ProcessTypes.getTypes;

@RestController
@RequestMapping("/api")
public class DataDisplayController {

//    TODO  2024-09-23T15:36:29.059+02:00  WARN 17648 --- [Pokemon Types Counters] [nio-8080-exec-7] .w.s.m.s.DefaultHandlerExceptionResolver : Resolved [org.springframework.web.HttpRequestMethodNotSupportedException: Request method 'GET' is not supported]
    @PostMapping("/selected-types")
//    public String getSelectedTypes(@RequestBody TypeImages typesSent) {
    public ResponseEntity<List<List<String>>> getSelectedTypes(@RequestBody TypeImages typesSent) {

        String type1 = typesSent.getType1();
        String type2 = typesSent.getType2();


        List<List<String>> results = getTypes(type1, type2);

        return ResponseEntity.ok(results);
//        return "Data received successfully: " + typesSent.toString();

    }

}