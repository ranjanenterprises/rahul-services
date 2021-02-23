package com.ranjan.service.rahul.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RahulController {

    @GetMapping("/status")
    public String getStatus() {
        return "SUCCESS response from Rahul services";
    }
}
