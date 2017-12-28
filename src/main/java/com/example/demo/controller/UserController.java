package com.example.demo.controller;

import com.example.demo.manager.UserManager;
import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by tianbenzhen on 2017/11/3.
 */
@Controller
public class UserController {

    @Autowired
    UserManager userManager;

    @RequestMapping("/match")
    public @ResponseBody String match(){
        return "";
    }

    @RequestMapping("/user/{id}")
    public @ResponseBody User get(@PathVariable(name="id")  Long id){
        return userManager.getUserById(id);
    }

}
