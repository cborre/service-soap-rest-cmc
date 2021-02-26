package com.cmc.servicesoaprest.controllers;

import com.cmc.service_soap.User;
import com.cmc.servicesoaprest.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserServiceImpl userServiceImpl;

    @GetMapping(value = "/rest/users")
    public List<User> getAllUsers() {

        // Return
        return userServiceImpl.getUsers();
    }
}