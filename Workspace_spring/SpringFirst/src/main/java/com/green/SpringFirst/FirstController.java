package com.green.SpringFirst;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {
    @GetMapping("/a")
    public String goFirst(){
        return "first";
    }
    @GetMapping("/b")
    public String goSecond(){
        System.out.println(1111);
        return "second";     // html 파일 명
    }
    @GetMapping("/c")
    public String goThird(){
        System.out.println(1);
        return "third";
    }
    @GetMapping("/login")
    public String goLogin(){
        return "login";
    }
    @GetMapping("/loginResult")
    public String loginResult(){
        System.out.println("loginResult 메서드 실행");
        return "";
    }
}
