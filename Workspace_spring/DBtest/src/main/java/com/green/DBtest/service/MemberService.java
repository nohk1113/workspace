package com.green.DBtest.service;

// 인터페이스는 멤버변수 안됨 ,  생성자  안됨  -> 인터페이스는 객체 생성 불가
// 오직 추상메서드(메서드의 이름만 존재하고 몸통은 없는 메서드)만 존재
// 인터페이스는 단독으로 사용불가 -> 클래스의 정의 부분에서 사용을 함
public interface MemberService {
//    public void aaa();      이것이 추상 메서드
    void insertMember();

    void insertMember2();
}
