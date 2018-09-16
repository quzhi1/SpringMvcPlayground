package com.quzhi1.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    private final static Logger LOGGER = LoggerFactory.getLogger(IndexController.class);

    @GetMapping("/")
    public String index(Model m) {
        m.addAttribute("someAttribute", "hello world");
        LOGGER.info("I am here");
        return "index";
    }

    @GetMapping("/hello-path")
    public String helloPath(Model m) {
        m.addAttribute("someAttribute", "hello world in hello-path");
        LOGGER.info("I am in path hello-path");
        return "index";
    }
}
