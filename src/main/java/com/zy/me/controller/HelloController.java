package com.zy.me.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@CrossOrigin(origins = "*",maxAge = 3600)
public class HelloController {

    @RequestMapping(value = "hello",method = RequestMethod.GET)
    public String hello(HttpServletRequest request){
        String username = request.getParameter("username");
        System.out.printf(username);
        return "hello";
    }

}
