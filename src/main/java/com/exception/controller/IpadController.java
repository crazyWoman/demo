package com.exception.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IpadController {

    @GetMapping("/pads/ipad/{id}")
    @ResponseBody
    public String getPhone(
            @PathVariable("id") int ipadversion){
        if(ipadversion > 3){
            throw new IllegalArgumentException();
        }

        return "ipad "+ipadversion;

    }
}
