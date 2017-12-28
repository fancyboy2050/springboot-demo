package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by tianbenzhen on 2017/10/27.
 */
@Controller
@RequestMapping("/")
public class IndexController {

    @RequestMapping({"/index","/"})
    public @ResponseBody String index(){
        return "index";
    }

}
