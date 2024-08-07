package com.green.Board.service;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.green.Board.vo.MemberVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("memberService")
public class MemberServiceImpl implements MemberService{
    @Autowired
    private SqlSessionTemplate sqlSession;

//    아이디 중복 확인
//    중복-> true
//    중복x ->false
    @Override
    public boolean isDuplicateId(String memId) {
        //    id 가 null이면 회원가입 가능
        // id 가 조회되면(null) 회원가입 불가능
        String id= sqlSession.selectOne("memberMapper.isDuplicate", memId);
        return id!=null;   // 아이디가 널이 아니면 true ( 회원가입이 가능 )
    }
// 회원가입
    @Override
    public void join(MemberVO memberVO) {
        sqlSession.insert("memberMapper.join", memberVO);
    }

    @Override
    public MemberVO login(MemberVO memberVO) {
        return sqlSession.selectOne("memberMapper.login", memberVO);
    }

}
