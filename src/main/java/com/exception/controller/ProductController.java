package com.exception.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {

    @GetMapping("/phones/iphone/{id}")
    @ResponseBody
    public String getPhone(
            @PathVariable("id") int phoneversion){
        if(phoneversion > 12 ){
            throw new IllegalArgumentException();
        }

        return "iphone "+phoneversion;

    }

    @GetMapping("/phones/samsung/{id}")
    @ResponseBody
    public String getSamsungPhone(
            @PathVariable("id") int phoneversion){
        if(phoneversion > 4 ){
            throw new IllegalArgumentException();
        }

        return "iphone "+phoneversion;

    }
}
