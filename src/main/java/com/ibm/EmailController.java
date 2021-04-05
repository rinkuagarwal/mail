package com.ibm;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {
	@Autowired
    private EmailService emailService;

    @GetMapping(value = "/sendmail")
    public String sendMail() {

        emailService.sendMail("sabhilasha1628@gmail.com", "Test Subject", "Test mail");

        return "emailsent";
    }
}
