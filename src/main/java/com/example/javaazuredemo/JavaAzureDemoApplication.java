package com.example.javaazuredemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JavaAzureDemoApplication {

    @GetMapping("/message")
    public String message(){
        return "Congrats ! Your app is deployed successfully in Azure! Application is redeployed.1/25/2024";
    }

    public static void main(String[] args) {
        SpringApplication.run(JavaAzureDemoApplication.class, args);
    }

}
