package com.learning.akarsh.teachingMyFriend;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @RequestMapping("/home")
    public String index() {
        return "This is it for today ";
    }
    @RequestMapping("/home/aakash")
    public String aakash() {
        return " Aakash is a good boy ";
    }
}
