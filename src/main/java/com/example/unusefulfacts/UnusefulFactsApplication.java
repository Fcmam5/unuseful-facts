package com.example.unusefulfacts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Base62;

@SpringBootApplication
public class UnusefulFactsApplication {

    public static void main(String[] args) {
        SpringApplication.run(UnusefulFactsApplication.class, args);
        generateShortUrl("https://example.com");
    }

    public static String generateShortUrl(String url) {
        return Base62.getEncoder().encodeToString(url.getBytes());
    }
}
