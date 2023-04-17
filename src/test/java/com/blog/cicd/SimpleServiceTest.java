package com.blog.cicd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SimpleServiceTest {
    @Autowired
    private SimpleService simpleService;

    @Test
    public void 대문자_검사(){
        String message = simpleService.getMessage();

        for(int i = 0; i < message.length(); i ++){
            char ch = message.charAt(i);
            if(('A' <= ch && ch <= 'Z')){
                Assertions.fail();
            }
        }
    }
}