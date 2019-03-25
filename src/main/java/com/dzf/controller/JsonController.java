package com.dzf.controller;

import com.dzf.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/json")
public class JsonController {

    @RequestMapping("/m1")
//    @ResponseBody // 这个注解将知道现在返回的不是视图，它会将这个数据转换为json格式
    public User m1(){

        User user = new User();

        user.setName("dengzhihui");
        user.setAge(20);

        return user;
    }

    @RequestMapping("/m2")
//    @ResponseBody
    public Map<String,Object> m2(){

        Map<String,Object> map = new HashMap<>();

        map.put("name","dengzhihui");
        map.put("born",199908199);

        return map;
    }

    @RequestMapping("/m3")
    public User[] m3(){

        User u = new User();
        u.setName("deng");
        u.setAge(20);

        User u2 = new User();
        u2.setAge(21);
        u2.setName("zhihui");

        return new User[]{u,u2};
    }

    @RequestMapping("/m4")
    public List<Map<String,User>> m4(){

        User u = new User();
        u.setName("deng");
        u.setAge(20);

        User u2 = new User();
        u2.setAge(21);
        u2.setName("zhihui");

        Map<String,User> map = new HashMap<>();
        map.put("first",u);

        Map<String,User> map2 = new HashMap<>();
        map2.put("first",u2);

        List<Map<String,User>> list = new ArrayList<>();

        list.add(map);
        list.add(map2);

        return list;
    }
}
