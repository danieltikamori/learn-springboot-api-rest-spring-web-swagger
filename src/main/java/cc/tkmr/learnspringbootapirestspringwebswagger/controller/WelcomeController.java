package cc.tkmr.learnspringbootapirestspringwebswagger.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Define as a REST controller. Some methods will be HTTP services, others exposed as REST API
public class WelcomeController {
    @GetMapping // Map the HTTP GET request to the welcome() method
    public String welcome() {
        return  "Welcome to My Spring Boot Web API";
    }
}
