package com.green.DB_Score.service;

import com.green.DB_Score.VO.ScoreVO;

import java.util.List;



public interface ScoreService {

//    학생 목록 조회
    List<ScoreVO> getStuList();

//    학생 등록
    void insertStudent(ScoreVO scoreVO);

    // delete, update, insert 리턴 타입 : void, int
    //  전달 받은 회원번호를 가진 회원을 삭제

    // 학생 상세 조회   (리턴 타입 중요)
    ScoreVO getStuDetail(int stuNum);

    // delete, update, insert 리턴 타입 : void, int
    //  전달 받은 회원번호를 가진 회원을 삭제
    int delete(int stuNum);

    int update(ScoreVO scoreVO);

    void updateStudent(ScoreVO scoreVO);
}
