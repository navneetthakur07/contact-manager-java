package com.learning.contact_manager.controller;

import com.learning.contact_manager.services.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // combination of request mapping and controller
public class ContactController {
    @Autowired
    ContactService contactService;

    @GetMapping("/example")
    public String demo(){
        System.out.println("Welcome to controller.");
        contactService.displayContact();
        return "hello bye";
    }
}
