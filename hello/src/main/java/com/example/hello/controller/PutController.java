package com.example.hello.controller;

import com.example.hello.dto.PutRequestDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PutController {

    @PutMapping("/put")
    public PutRequestDto put(@RequestBody PutRequestDto requestDto){
        System.out.println(requestDto);
        return requestDto;

    }

    @RequestMapping("/put/{userid}")
    public PutRequestDto put(@RequestBody PutRequestDto requestDto, @PathVariable long userid){
        System.out.println(userid);
        System.out.println(requestDto);
        return requestDto;

    }

}
