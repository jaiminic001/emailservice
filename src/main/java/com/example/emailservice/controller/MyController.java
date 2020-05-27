package com.example.emailservice.controller;

import com.example.emailservice.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

    @Autowired
    private EmailService emailService;

    @GetMapping(value = "/sendmail")
    public String sendmail() {

        emailService.sendMail("psharmam15@gmail.com", "Test Subject", "Test mail");

        return "emailsent";
    }
}
