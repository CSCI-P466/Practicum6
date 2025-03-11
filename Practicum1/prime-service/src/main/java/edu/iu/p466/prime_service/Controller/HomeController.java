package edu.iu.p466.prime_service.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class HomeController {
    @GetMapping
    public String greetings() {
        return "This is the Practicum 1, Prime Service.";
    }
}
