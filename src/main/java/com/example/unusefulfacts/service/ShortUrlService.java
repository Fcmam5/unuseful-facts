package com.example.unusefulfacts.service;

import org.springframework.stereotype.Service;

@Service
public class ShortUrlService {

    public String shortenUrl(String url) {
        return new StringBuilder(url).reverse().toString().substring(0, 6);
    }
}
