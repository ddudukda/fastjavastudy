package com.example.hello.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class DeleteController {
    @DeleteMapping("/delete/{userid}")
    public void delete(@PathVariable(value = "userid") long id, @RequestParam String account){
        System.out.println(id);
        System.out.println(account);

        //delete -> 리소스 삭제이기 때문에 멱등하게 항상 200 리턴
    }
}
