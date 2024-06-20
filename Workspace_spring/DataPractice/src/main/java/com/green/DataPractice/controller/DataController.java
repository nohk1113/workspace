package com.green.DataPractice.controller;

import com.green.DataPractice.vo.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ConcurrentModel;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DataController {
//    localhost:8080/loginForm        웹 주소
    @GetMapping("/loginForm")
    public String loginForm(){
        return "login";
    }
//    form 태그로 전달되는 데이터를 받을때 매개변수를 사용한다.
//    매개변수에 @RequestParam 을 사용 하여 데이터를 받을수 있다.
//    @RequestParam(name = "이름") : "이름" -> 전달되는 input 태그의 name  속성 값
    @GetMapping("/login")
    public String login(@RequestParam(name = "id") String id,
                        @RequestParam(name = "pw") String pw){
        System.out.println("id = "+id);
        System.out.println("pw = "+pw);
        return "login_result";
    }
//    html 에서 전달되는 데이터의 이름 (input 태그의 name 속석 값) 과
//    매개뱐수로 전달 된 클래스의 멤버 변수명이  일치하면 html 에서 넘어온 데이터 객체에 자동 저장 시켜줌.
//     이때 클래스는 반드시 getter, setter 가 생성되어야 함.
//    이렇게 html에서 넘어온 데이터를 받기 위해 컨트롤러 안의 메서드 에서 매개변수로 활용하는 객체를 커맨드 객체라고 지징한다.
    @PostMapping("/login1")
    public String login1(LoginVO loginVO, Model model){
        model.addAttribute("loginInfo", loginVO);

        System.out.println("id ="+loginVO.getId());
        System.out.println("pw ="+loginVO.getPw());
        return "login_result";
    }
//    Controller.JoinController
    @GetMapping("/reg_member")
    public String reg_member(){
        return "reg_member";
    }
    @PostMapping("/member_info")
    public String member_info(MemberVO memberVO){
        System.out.println(memberVO);
        return "member_info";
    }

    @GetMapping("/survey")
    public String survey(){
        return "survey";
    }
    @PostMapping ("/sResult")
    public String sResult(SurveyVO surveyVO){
        System.out.println(surveyVO);
        return "survey_result";
    }

    @GetMapping("/a")
    public String inputName(){
        return "input_name";
    }
    @PostMapping("/b")
    public String inputAge(@RequestParam(name="name")String name, Model model){
        System.out.println(name);
        model.addAttribute("name", name);
        return "input_age";
    }
    @PostMapping("/c")
    public String show(@RequestParam(name="name")String name, @RequestParam(name="age")int age){
        System.out.println(age);
        return "show";
    }


    @GetMapping("/ScoreController")
    public String scoreController(){
        return "ScoreController";
    }
    @PostMapping("/ScoreController_2")
    public String ScoreController_2(ScoreControllerVO scoreControllerVO){


        System.out.println(scoreControllerVO);
        return "ScoreController_2";
    }
    @PostMapping("/ScoreController_3")
    public String ScoreController_3(ScoreControllerVO scoreControllerVO){

        System.out.println(scoreControllerVO);
        return "ScoreController_3";
    }
    @PostMapping("/ScoreController_4")
    public String ScoreController_4(ScoreControllerVO scoreControllerVO){


        System.out.println(scoreControllerVO);
        return "ScoreController_4";
    }
@GetMapping("/first")
    public String scoreFirst(){
    return "score_first";
    }

//    치킨 주문 받는 메소드

    @GetMapping("/order")
    public String order(OrderVO orderVO){
        return "order";
    }
    @PostMapping("/delivery")
    public String delivery(OrderVO orderVO, DeliveryVO deliveryVO){
        System.out.println(orderVO);
        System.out.println(deliveryVO);
        return "delivery";
    }
    @PostMapping("/order_info")
    public String order_info(OrderVO orderVO, DeliveryVO deliveryVO){
        System.out.println(orderVO);
        System.out.println(deliveryVO);
        return "order_info";
    }

}
