package ru.netology.authservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.authservice.model.Authorities;
import ru.netology.authservice.service.AuthorizationService;

import java.util.List;

@RestController
public final class AuthorizationController {
 //   @Autowired
    private final AuthorizationService service;

    @Value("8080")
    private int port;

    public AuthorizationController(AuthorizationService service) {
        this.service = service;
    }

    @GetMapping
    public int getPort(){
        return port;
    }

    @GetMapping("/authorize")
    public List<Authorities> getAuthorities(@RequestParam("user") String user, @RequestParam("password") String password) {
        return service.getAuthorities(user, password);
    }
}