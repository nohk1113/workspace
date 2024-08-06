package com.green.Shop.member.service;

import com.green.Shop.member.vo.MemberVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("memberService")
public class MemberServiceImpl implements MemberService{
    @Autowired
    private SqlSessionTemplate sqlSession;

    //회원 가입
    @Override
    public void join(MemberVO memberVO) {
        sqlSession.insert("memberMapper.join", memberVO);
    }


    //    아이디 중복 확인
//    사용가능 하면 true, 사용 불가: false
    @Override
    public boolean isEnableId(String memId) {
//        사용 가능한 아이디면 selctedId: null
        String selectedId= sqlSession.selectOne("memberMapper.isEnableId", memId);
        System.out.println("***********************"+selectedId);
        return selectedId==null?true:false ;
    }

//    로그인 기능
    @Override
    public MemberVO login(MemberVO memberVO) {
        return sqlSession.selectOne("memberMapper.login", memberVO);
    }
}






