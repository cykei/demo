package com.example.demo;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class Crawller {
    public void crawlRidi() throws IOException {
        String url="https://ridibooks.com/search?q=안녕";
        Document document = Jsoup.connect(url).get();

        System.out.println(document.text());
    }
}
