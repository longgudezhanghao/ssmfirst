package com.dzf.controller;

import com.dzf.Constant.ResponseCode;
import com.dzf.pojo.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/checkname")
    public Map<String,Integer> checkName(@RequestBody User user){

        Map<String,Integer> map = new HashMap<>();

        int code = ResponseCode.CAN_USE;
        if(user.getName().equals("邓志辉")){
            code = ResponseCode.HAVE_USE;
        }

        map.put("code",code);

        return map;
    }

}
