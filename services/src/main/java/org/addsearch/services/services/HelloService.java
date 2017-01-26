package org.addsearch.services.services;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public String greet() {
        return "Greetings from Spring Boot!";
    }
}
