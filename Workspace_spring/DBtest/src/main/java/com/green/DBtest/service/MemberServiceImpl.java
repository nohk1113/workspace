package com.green.DBtest.service;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// TEST_MEMBER 테이블에 데이터를 조작하는 DB 작업을 하는 클레스
// MemberServiceImpl MemberServiceImpl=new MemberServiceImpl();
@Service("memberService")
public class MemberServiceImpl implements MemberService{
//    SqlSessionTemplate  객체 : 쿼리 실행을 위한 메서드를 가지고 있는 객체
//    쿼리 실행을 위한 메서드
//    데이터 삽입(insert) : sqlSession.insert("쿼리가 있는 mapper파일 의 namespace.쿼리 id", [실행할 쿼리의 빈값을 채울 데이터]);
//    데이터 삭제 (DELETE) : sqlSession.delete("쿼리가 있는 mapper파일 의 namesapce.쿼리 id", [실행할 쿼리의 빈값을 채울 데이터]):
//    데이터 수정(UPDATE) : sqlSession.update("쿼리가 있는 mapper파일 의 namesapce.쿼리 id", [실행할 쿼리의 빈값을 채울 데이터]);
//    데이터 조회 (SELECT) : sqlSession.selectOne("쿼리가 있는 mapper파일 의 namesapce.쿼리 id", [실행할 쿼리의 빈값을 채울 데이터]):
//                    :  .selectList("쿼리가 있는 mapper파일 의 namesapce.쿼리 id" , [실행할 쿼리의 빈값을 채울 데이터]);
    @Autowired
    private SqlSessionTemplate sqlSession;
//     test_member 테이블에 데이터 1개 삽입

    @Override
    public void insertMember() {
        sqlSession.insert("memberMapper.insert1");
    }

    @Override
    public void insertMember2() {
        sqlSession.insert("memberMapper.insert2", 20);
    }

}
