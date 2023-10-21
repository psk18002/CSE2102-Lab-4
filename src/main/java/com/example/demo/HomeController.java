package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/logincreate")
    public String notHome() {
        return "logincreate";
    }

    @GetMapping("/usr")
    public String testPage() {
        return "usrProfile";
    }

    @GetMapping("/qna")
        public String qnaPage() {
            return "qna";
    }
}