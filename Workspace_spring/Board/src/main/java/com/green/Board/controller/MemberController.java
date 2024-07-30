package com.green.Board.controller;

import com.green.Board.service.MemberService;
import com.green.Board.vo.MemberVO;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j    // 로그 남기는 어노테이션  -- 모든 클레스 위에서 사용 가능하다
@RestController
@RequestMapping("/member")
public class MemberController {
//    서비스 클래스의 정보를 가져오는 코드
    @Resource(name = "memberService")
    private MemberService memberService;

    @GetMapping("/checkId/{inputId}")
//     아이디 중복 확인
    public boolean checkId(@PathVariable("inputId") String inputId){  // 서비스의 변수형태도 boolean
        log.info(inputId);
        return memberService.isDuplicateId(inputId);
    }

    @PostMapping("/join")
    public void join(@RequestBody MemberVO memberVO){
        log.info("..........................join 메서드 실행...................................");
        log.info("..........................memberVO에 전달 된 데이터......................");
        log.info(memberVO.toString());
        log.info(".........................끝...................................");
        memberService.join(memberVO);
    }

//    로그인
    @PostMapping("/login")
    public MemberVO login(@RequestBody MemberVO memberVO){
//        조회된 데이터가 없으면 member는 null이 된다.
        MemberVO member=  memberService.login(memberVO);
        return member;
    }
}
