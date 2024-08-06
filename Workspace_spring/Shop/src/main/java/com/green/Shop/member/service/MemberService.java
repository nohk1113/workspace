package com.green.Shop.member.service;

import com.green.Shop.member.vo.MemberVO;

public interface MemberService {

    //회원 가입
    void join(MemberVO memberVO);

//    아이디 중복 확인
//    사용가능 하면 true, 사용 불가: false
    boolean isEnableId(String memId);

//    로그인 기능
    MemberVO login(MemberVO memberVO);
}
