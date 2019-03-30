package com.dzf.controller;

import com.dzf.pojo.People;
import com.dzf.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/people")
//@SessionAttributes("SESSION_PEOPLE")
public class PeopleController {

//    自动注入PeopleService
//    不能扫描service下的包，需额外添加spring-context配置文件，否则注入失败
    @Autowired
    private PeopleService peopleService;

    @RequestMapping("/login")
    public String login(People people,HttpSession session){

        people = peopleService.get(people);

        if(people != null){
            System.out.println("登入中....");
            session.setAttribute("SESSION_PEOPLE",people);
            return "people";
        }else {
            return "redirect:/login.jsp";
        }
    }

    @RequestMapping("/delete/{name}")
    @ResponseBody
    public Map<String,Integer> delete(@PathVariable("name")String name){
        boolean deleteSuc = peopleService.delete(name);
        Map<String,Integer> map = new HashMap<>();
        int code = deleteSuc?2000:2003;
        map.put("code",code);
        return map;
    }
}
