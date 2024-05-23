package com.atos.microservice1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class HelloController {

    @GetMapping("/moez")
    public String index() {
        return "Greetings from Spring Boot! Micro service 1";
    }

    @GetMapping("/moez/search/{name}")
    public Mono index2(@PathVariable("name")  String name) {
        if (name.equals("momo"))
            return Mono.just("Momo Niahahahaha ");
        if (name.equals("mama"))
            return Mono.just("Mama Hohohoho ");
        return Mono.just("Not Found Mouahahahaha ");
    }



}