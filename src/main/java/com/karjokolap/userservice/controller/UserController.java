package com.karjokolap.userservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/users")
public class UserController {


    @Autowired
    private Environment environment;

    @GetMapping(path = "/status")
    public String users(){
        return "Working! Running on port: " + environment.getProperty("local.server.port");
    }
}