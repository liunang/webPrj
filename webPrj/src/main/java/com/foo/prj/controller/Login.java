package com.foo.prj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Login
{
    @RequestMapping("/")
    public String login(){
        return "/util/login";
    }
}
