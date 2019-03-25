package com.dzf.controller;

import com.dzf.pojo.AppAcount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/app")
public class AppAccountController {

    @RequestMapping("/index")
    public String index(Model model){

        List<AppAcount> l = new ArrayList<>();

        AppAcount appAcount = new AppAcount(1,"ZHOU","BIG");
        AppAcount appAcount2 = new AppAcount(2,"KAI","MEI");
        AppAcount appAcount3 = new AppAcount(3,"XIN","NV");

        l.add(appAcount);
        l.add(appAcount2);
        l.add(appAcount3);

        model.addAttribute("appAcounts",l);

        return "appacount/index";
    }
}
