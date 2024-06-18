package com.green.Start;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller

//1. 자바에서 html 로 데이터를 전달하기위해서는
// 실핼되는 메서드의 매개변수의  model 인터페이스 객체를 선언
// 2. 객체명.addAttribute 메서드를 사용하여 데이터를 전달한다.
public class MemberController {
    @GetMapping("/main")
    public String goMain(Model model){
        model.addAttribute("name", "java");
        model.addAttribute("age", 10);
        System.out.println("go main 메서드 실행");
        return "main";
    }
    @GetMapping("/login")
    public String gotest_login(Model model){
        String[] hobbies= {"독서", "운동", "공부"};
        model.addAttribute("abc", hobbies);

        Member m=new Member("홍", 20, 90);
        model.addAttribute("member", m);

        return "test_login";
    }
    @GetMapping("/join")
    public String gojoin(Model model){
        List<Member> list=new ArrayList<>();
        Member m1=new Member("홍길동", 22,90);
        Member m2=new Member("이순신", 30, 50);
        Member m3=new Member("장영실", 42, 70);
        list.add(m1);
        list.add(m2);
        list.add(m3);

        model.addAttribute("memberList", list);

        System.out.println("go join  실행");
        return "test_join";
    }
}

