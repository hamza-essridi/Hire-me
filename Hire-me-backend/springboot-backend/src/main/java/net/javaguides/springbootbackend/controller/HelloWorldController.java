package net.javaguides.springbootbackend.controller;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/api")
public class HelloWorldController {

    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello, World!";
    }
}