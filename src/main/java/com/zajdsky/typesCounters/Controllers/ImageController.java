package com.zajdsky.typesCounters.Controllers;

import com.zajdsky.typesCounters.Templates.ImageNames;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

import static com.zajdsky.typesCounters.Services.ProcessTypes.getTypes;

@RestController
@RequestMapping("/api")
public class ImageController {

    @PostMapping("/save-selected-names")
    public ResponseEntity<Map<String, String>> saveSelectedNames(@RequestBody ImageNames imageNames) {
        String name1 = imageNames.getName1();
        String name2 = imageNames.getName2();

//        TODO change return type
        getTypes(name1, name2);

        Map<String, String> response = new HashMap<>();
        response.put("message", "Names received successfully");
        response.put("name1", name1);
        response.put("name2", name2);



        return new ResponseEntity<>(response, HttpStatus.OK);
    }

}
