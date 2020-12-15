package org.fasttrackit.trainingspring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/api/salut")
    public String getHelloMessage() {
        return "Salut lume!";
    }

}
