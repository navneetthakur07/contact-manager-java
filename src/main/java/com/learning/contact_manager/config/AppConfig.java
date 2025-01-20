package com.learning.contact_manager.config;

import com.learning.contact_manager.services.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppConfig {
    @Autowired
    ContactService contactService;

    //@GetMapping("/example")
    public String demo(){
        System.out.println("Welcome to controller.");
        contactService.displayContact();
        return "hello bye";
    }
}
