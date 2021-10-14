package com.amr.project.service.controllers;

import com.amr.project.model.entity.User;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@RestController
public class IndexController {

    @GetMapping(path={"/","/index"})
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView("/index");
        return modelAndView;
    }

    @GetMapping(path="/login")
    public ModelAndView login() {
        ModelAndView modelAndView = new ModelAndView("/login");

        return modelAndView;
    }

    @GetMapping(path="/signup")
    public ModelAndView signup() {
        ModelAndView modelAndView = new ModelAndView("/signup");
        User user = new User();
        System.out.println(user.getUsername());
        modelAndView.addObject("user", user);

        return modelAndView;
    }

    @RequestMapping(value = "/signup", method = RequestMethod.POST)
    public Map<String, String> signup_post(@RequestParam Map<String, String> body) {
        return body;
    }
}
