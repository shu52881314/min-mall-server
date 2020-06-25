package com.action;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
@RestController
public class LoginAction {
    @GetMapping("/login")
    public Map login(){
        Map map=new HashMap();
        map.put("errorCode",0);
        return map;
    }
}
