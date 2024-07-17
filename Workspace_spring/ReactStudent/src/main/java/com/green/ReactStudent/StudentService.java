package com.green.ReactStudent;

import java.util.List;

public interface StudentService {
//    학생 목록 조회
    List<StudentVO> getStudentList();

// 글 등록
    void insertStudent(StudentVO studentVO);
}
