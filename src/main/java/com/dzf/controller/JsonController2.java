package com.dzf.controller;

import com.dzf.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/json2")
public class JsonController2 {

//    前台如何提交一个数据过来
    @RequestMapping("add")
//    user user入参只能处理表单提交的数据
    public String add(@RequestBody User user){

        System.out.println(user.getName()+user.getAge());

        return "msg";
    }

    //    前台如何提交一个数据过来
    @RequestMapping("addList")
//    user user入参只能处理表单提交的数据
    public Map<String, Integer> addList(@RequestBody List<User> list){

        System.out.println(list);

        Map<String,Integer> map = new HashMap<>();

        map.put("code",123456);

        return map;
    }
}

