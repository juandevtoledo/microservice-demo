package com.microservices.demo.adapter;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/gretting")
public class Gretting {

    @GetMapping(value = "/word/{word}")
    public ResponseEntity<String> sayHellow(@PathVariable("word" ) String word){
        String respose=word.concat(" - ").concat(" --> hey");
        return ResponseEntity.ok(respose);
    }
}
