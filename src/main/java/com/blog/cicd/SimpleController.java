package com.blog.cicd;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class SimpleController {
    private final SimpleService simpleService;

    @GetMapping
    public String main(Model model){
        model.addAttribute("message", simpleService.getMessage());

        return "index";
    }

}
