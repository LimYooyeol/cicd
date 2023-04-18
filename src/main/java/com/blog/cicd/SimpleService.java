package com.blog.cicd;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class SimpleService {
    @Value("${service-name}")
    private String serviceName;

    public String getMessage(){
        return "hello, this is " + serviceName;
    }

}
