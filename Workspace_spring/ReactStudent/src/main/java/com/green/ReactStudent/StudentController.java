package com.green.ReactStudent;

import jakarta.annotation.Resource;
import org.apache.ibatis.annotations.Update;
import org.springframework.web.bind.annotation.*;

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
    @PostMapping("/regStu")
    public void regStu(@RequestBody StudentVO studentVO){
        System.out.println(studentVO);
        studentService.insertStudent(studentVO);
    }

//    상세보기
    @GetMapping("/stuDetail/{stuNum}")
    public StudentVO getStudentDetail(@PathVariable("stuNum") int stuNum){
        System.out.println(stuNum);
        return studentService.getStudentDetail(stuNum);
    }

//    삭제
    @DeleteMapping("/delStu/{stuNum}")
    public void delStudent(@PathVariable("stuNum")int stuNum){
        studentService.delStu(stuNum);
    }

//     수정 페이지
    @PutMapping("/update")
    public void updateStudent(@RequestBody StudentVO studentVO){
        studentService.updtateStu(studentVO);
    }
}
