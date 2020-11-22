package com.mul.crawl.service;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class CrawlingServiceImpl implements CrawlingService {


    @Override
    public void crawlingWeb(String url) {
        try {
            Document document = Jsoup.connect(url).get();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
