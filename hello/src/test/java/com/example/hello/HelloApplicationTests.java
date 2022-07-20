package com.example.hello;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HelloApplicationTests {

    @DisplayName("object -> text -> object")
    @Test
    void contextLoads() throws JsonProcessingException {
        System.out.println("-----------");
        //Text Json -> object -> text json

        var objectMapper = new ObjectMapper();

        //object -> text
        // objectMapper는 getmethod를 활용한다.
        var tester = new Tester("steve",11,"010-1234-5678");
        var text = objectMapper.writeValueAsString(tester);
        System.out.println(text);

        //text -> object
        // 생성자 오버로딩을 했기 때문에 디폴트 생성자가 사라짐 : 디폴트 생성자가 필요!
        var objectTester = objectMapper.readValue(text, Tester.class);
        System.out.println(objectTester);
    }


}
