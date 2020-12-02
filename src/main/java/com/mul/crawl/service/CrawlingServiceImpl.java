package com.mul.crawl.service;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

public class CrawlingServiceImpl implements CrawlingService {


    @Override
    public void crawlingWeb(String url) {
        try {
            Document document = Jsoup.connect(url).get();

            String selector = "";
            Elements element =  document.select(selector);
            

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
