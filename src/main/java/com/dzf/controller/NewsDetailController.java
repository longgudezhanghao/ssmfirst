package com.dzf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("news")
public class NewsDetailController {

    @RequestMapping("main")
    public String index(){

        return "main";
    }
}
