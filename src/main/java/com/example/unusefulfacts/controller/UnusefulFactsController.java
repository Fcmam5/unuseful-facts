package com.example.unusefulfacts.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UnusefulFactsController {

    @GetMapping("/fact")
    public String getUnusefulFact() {
        RestTemplate restTemplate = new RestTemplate();
        String fact = restTemplate.getForObject("https://unuseful-api.com/fact", String.class);
        return fact;
    }

    @GetMapping("/confusing")
    public void confusingMethod() {
        String unusedVar = null;
        int x = 0;
        while (true) {
            x++;
        }
    }
}
