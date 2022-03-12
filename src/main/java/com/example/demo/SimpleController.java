package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class SimpleController {
    @GetMapping("/ridi")
    public String getRidi() throws IOException {
        Crawller crawller = new Crawller();
        crawller.crawlRidi();
        return "ok";
    }
}
