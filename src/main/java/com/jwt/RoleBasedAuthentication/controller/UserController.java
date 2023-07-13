package com.jwt.RoleBasedAuthentication.controller;

import com.jwt.RoleBasedAuthentication.model.User;
import com.jwt.RoleBasedAuthentication.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@RestController
public class UserController {
    @Autowired
    private UserService service;
    @PostConstruct
    public void initRolesAndUsers(){
        service.initRolesAndUser();
    }
    @PostMapping({"/registerNewUser"})
    public User registerNewUser(@RequestBody User user){
        return service.registerNewUser(user);
    }
    @GetMapping("/admin")
    public String forAdmin(){
        return "this api is for admin only!";
    }
    @GetMapping("/user")
    public String forUser(){
        return "this api is for user only!";
    }
}
