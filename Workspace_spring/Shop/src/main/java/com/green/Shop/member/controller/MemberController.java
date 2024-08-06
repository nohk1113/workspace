package com.green.Shop.member.controller;

import com.green.Shop.member.service.MemberService;
import com.green.Shop.member.vo.MemberVO;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api_member")
public class MemberController {
    @Resource(name = "memberService")
    private MemberService memberService;

    //회원 가입
    @PostMapping("/join")
    public void join(@RequestBody MemberVO memberVO){
        memberService.join(memberVO);
    }

    @GetMapping("/isEnableId/{memId}")
    public boolean isEnableId(@PathVariable("memId") String memId){
//        사용가능하면 id = result : true
        boolean result= memberService.isEnableId(memId);
        return result;
    }

//    로그인
    @PostMapping("/loginForm")
    public MemberVO login(@RequestBody MemberVO memberVO){
        MemberVO member= memberService.login(memberVO);
        System.out.println(member);
        return member;
    }
}








