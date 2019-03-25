package com.dzf.controller;

import com.dzf.pojo.User;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/xml")
public class XmlController {

    @RequestMapping(value = "/m1",produces = {MediaType.APPLICATION_XML_VALUE})
    public User m1(){

        User user = new User();
        user.setName("god");
        user.setAge(18);

        return user;
    }
}
