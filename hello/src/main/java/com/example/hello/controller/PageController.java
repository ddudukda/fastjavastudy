package com.example.hello.controller;

import com.example.hello.dto.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PageController {
    @RequestMapping("/main")
    public String main(){
        return "main.html";
    }

    // ResponseEntity
    @ResponseBody //: 페이지가 아니라 객체를 찾아서 데이터 타입으로 내려줌
    @GetMapping("/user")
    public User user(){
        var user = new User();  // java11 부터 타입 추론 'var'
        user.setName("Allex");
        user.setAddress("Korea");

        return user;
    }
}
