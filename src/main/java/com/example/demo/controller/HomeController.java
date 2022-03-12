package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
//    @GetMapping("/hoem")
//    public String getHtml(@RequestParam(value="param") String param){
//        URL url = new URL("https://ridibooks.com/search?q="+param);
//        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
//        connection.setRequestMethod("GET");
//
//    }

    @GetMapping("/home")
    public String getHome(){
        return "map/Republic_Korea_2019.html";
       // return "home.html";
    }
}
