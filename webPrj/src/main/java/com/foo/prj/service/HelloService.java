package com.foo.prj.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * HelloService
 * Created by liu on 2017/7/18.
 */
@Service
public class HelloService {
    public String hello(){
        return "This is return from Service!!";
    }
}
