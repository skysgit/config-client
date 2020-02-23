package com.cn.app.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigClientController {
 
 
    @Value("${test}")
    private String profile;
 
 
    @RequestMapping(value = "/getProfile",method = RequestMethod.GET)
    public String getProfile(){
        return profile;
    }
}