package com.dzf.controller;

import com.dzf.pojo.NewsDetail;
import com.dzf.service.NewsDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/news")
public class NewsDetailController {

    @Autowired
    private NewsDetailService newsDetailService;

    @RequestMapping("/main")
    public String index(Model model){

        List<NewsDetail> newsDetails = newsDetailService.queryAll();

        model.addAttribute("newsDetailList",newsDetails);

        return "main";
    }

}
