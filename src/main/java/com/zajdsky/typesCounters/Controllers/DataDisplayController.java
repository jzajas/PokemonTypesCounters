package com.zajdsky.typesCounters.Controllers;

import com.zajdsky.typesCounters.Templates.TypeImages;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.zajdsky.typesCounters.Services.ProcessTypes.getTypes;

@RestController
@RequestMapping("/api")
public class DataDisplayController {

    @PostMapping("/detailed-counters")
    public ResponseEntity<List<List<String>>> getDetailedInfo(@RequestBody TypeImages typesSent) {

        String type1 = typesSent.getType1();
        String type2 = typesSent.getType2();

        List<List<String>> results = getTypes(type1, type2);

        return ResponseEntity.ok(results);

    }


    @PostMapping("/simple-counters")
    public ResponseEntity<List<List<String>>> getSimpleInfo(@RequestBody TypeImages typesSent) {

        String type1 = typesSent.getType1();
        String type2 = typesSent.getType2();

        List<List<String>> results = getTypes(type1, type2);

        return ResponseEntity.ok(results);

    }
}