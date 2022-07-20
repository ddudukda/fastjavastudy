package com.example.hello.controller;

import com.example.hello.dto.UserRequest;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/get")
public class GetApiController {
    @GetMapping(path = "/hello")  // http://localhost:9090/api/get/hello
    public String hello(){
        return "getHello";
    }

    // http://localhost:9090/api/get 까지는 고정 -> /path-variable/{name} 변하는 값{name}
    @GetMapping("/path-variable/{name}")
    public String pathVariable(@PathVariable(name = "name") String pathName){
        System.out.println("pathVariable : " + pathName);
        return pathName;
    }
    
    // 쿼리파라미터 -> ?key=value&key2=value2
    // http://localhost:9090/api/get/query-param?user=jams&email=jams@gmail.com&age=30
    @GetMapping(path = "query-param")
    public String queryParam(@RequestParam Map<String,String> queryparam){

        StringBuilder stringBuilder = new StringBuilder();

        queryparam.entrySet().forEach(entry ->{
            System.out.print(entry.getKey() + ", ");
            System.out.println(entry.getValue());

            stringBuilder.append(entry.getKey()+ " = "+entry.getValue());
        });

        return stringBuilder.toString();
    }

    @GetMapping("/query-param02")
    public String param02(@RequestParam String name,
                          @RequestParam String email,
                          @RequestParam int age)
    {
        System.out.println(name);
        System.out.println(email);
        System.out.println(age);

        return name+" ,"+email+" ,"+age;
    }

    //dto객체 맵핑
    @GetMapping("/query-param03")
    public String param03(UserRequest userRequest)
    {
        System.out.println(userRequest.getName());
        System.out.println(userRequest.getEmail());
        System.out.println(userRequest.getAge());

        return userRequest.toString();
    }

}
