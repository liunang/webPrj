package com.foo.prj.service.impl;

import com.foo.prj.service.HelloWorldService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

/**
 * HelloWorldServiceImpl
 * Created by liu on 2017/7/18.
 */
@Service("helloWorldService")
public class HelloWorldServiceImpl implements HelloWorldService {
    private static final Logger logger = LogManager.getLogger(HelloWorldServiceImpl.class);

    public String hello() {
        logger.error("testError");
        logger.trace("testSysout");
        return "this is from Impl!s";
    }
}
