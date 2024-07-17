package com.green.ReactStudent;

import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
//    목록조회 하기 위한 ... 객체 선언
    @Resource(name="studentService")
    private StudentService studentService;

//    학생 목록 페이지
    @GetMapping("/list")
    public List<StudentVO> getStudentList(){
        List<StudentVO> studentList=studentService.getStudentList();
        return studentList;
    }
//    글 등록 페이지
    @GetMapping("/regStu")
    public void regStu(@RequestBody StudentVO studentVO){
        studentService.insertStudent(studentVO);
    }
}
