package com.green.ReactStudent;

import java.util.List;

public interface StudentService {
//    학생 목록 조회
    List<StudentVO> getStudentList();

// 글 등록
    void insertStudent(StudentVO studentVO);

//    상세조회
    StudentVO getStudentDetail(int stuNum);

//    학생 정보 삭제
    void delStu(int stuNum);

    //    글 수정 페이지
    void updtateStu(StudentVO studentVO);
}
