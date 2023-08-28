package com.example.menu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MenuController {

    private final String CAT_API_URL = "https://api.thecatapi.com/v1/images/search";
    private final String DOG_API_URL = "https://api.thedogapi.com/v1/images/search";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/Menu1")
    public ResponseEntity<String> menuOne() {
        return restTemplate.getForEntity(CAT_API_URL, String.class);
    }

    @GetMapping("/Menu2")
    public ResponseEntity<String> menuTwo() {
        return restTemplate.getForEntity(DOG_API_URL, String.class);
    }

}
