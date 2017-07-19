package com.foo.prj.service.impl;

import com.foo.prj.service.HelloWorldService;
import org.springframework.stereotype.Service;

/**
 * HelloWorldServiceImpl
 * Created by liu on 2017/7/18.
 */
@Service("helloWorldService")
public class HelloWorldServiceImpl implements HelloWorldService {

    public String hello() {
        return "this is from Impl!s";
    }
}
