package com.foo.prj.controller;

import com.foo.prj.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


/**
 * HelloWorld
 * Created by liu on 2017/7/13.
 */
@Controller
public class HelloWorld {
    @Autowired
    @Qualifier("helloWorldService")
    private HelloWorldService helloWorldService;

    @RequestMapping("/hello")
    public ModelAndView hello() {
        String message = helloWorldService.hello();
        ModelAndView mv = new ModelAndView();
        //添加模型数据 可以是任意的POJO对象
        mv.addObject("message", message);
        //设置逻辑视图名，视图解析器会根据该名字解析到具体的视图页面
        mv.setViewName("hello");
        return mv;
    }

}
