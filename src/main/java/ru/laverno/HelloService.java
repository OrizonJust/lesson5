package ru.laverno;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public String helloTo(String username) {
        return "Hello " + username;
    }

    public String goodbye(String username) {
        return "Goodbye " + username;
    }
}
