package com.green.AecurityTest.service;

import lombok.RequiredArgsConstructor;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor  //final 이 붙어있는 변수를 매개변수로 갖는 생성자
@Service("memberService")
public class MemberServiceImpl implements MemberService{
    //    필드주입
//    @Autowired
//    ------기존과 달라진점--------
//    1.선언한 객체위의 어노테이션 사라짐
//    2.선언한 변수에 final 키워드가 붙는다
//    3.클래스에 @requiredArgsContru
    private final SqlSessionTemplate sqlSession;
    //    final이 붙은 것은 초기값이 필수라서 밑의 생성자를 만들어주었음 (생성자가 하나면 autowired 생략가능)
//    public memberServicempl(SqlSessionTemplate sqlSession){
//        this.sqlSession=sqlSession;
//    }

    @Override
    public void test1() {
        System.out.println();
    }
}
