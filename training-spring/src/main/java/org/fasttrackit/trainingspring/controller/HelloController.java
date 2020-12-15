package org.fasttrackit.trainingspring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/api/salut/{mesaj}")
    public String getHelloMessage(@PathVariable("mesaj") String pathVar) {
        String responseText = "<h1 style=color:green> Salut lume! </h1> \n <h4>Bun venit pe serverul nostru local!</h4>\n " + pathVar;
        return responseText;
    }

}
