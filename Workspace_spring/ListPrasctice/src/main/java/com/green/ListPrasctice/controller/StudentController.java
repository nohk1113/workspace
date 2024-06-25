package com.green.ListPrasctice.controller;

import com.green.ListPrasctice.VO.BoardVO;
import com.green.ListPrasctice.VO.StudentVO;
import com.green.ListPrasctice.service.StudentService;
import org.apache.tomcat.util.log.UserDataHelper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class StudentController {
    StudentService studentService=new StudentService();     // 정보 불러오기


    //목록 페이지
    @GetMapping("/")
    public String stu( Model model){
// 학생 목록 데이터 받아오기
        List<StudentVO> list = studentService.getStuList();

//        학생 목록을 html로 전달
        model.addAttribute("stuList", list );
        return "stu_list";
    }

    //학생 등록 페이지
    @GetMapping("/regForm")
    public String regForm(StudentVO studentVO){

        return "reg_student";
    }

    //학생 등록 + 목록 페이지로 이동
    @PostMapping("/reg")
    public String reg_student(StudentVO studentVO){
        studentService.regStudent(studentVO);
        return "redirect:/";
    }
//   폼 태그는 post ,   다른거는 무조건  get
    @GetMapping("/detail")
    public String student_detail(@RequestParam(name="stuNum") int stuNum, Model model){
//        내가 클릭한 학생 한명을 검색(학번을 알면 된다.)
        StudentVO student= studentService.getStuDetail(stuNum);
//        상세보기 하고싶은 학생의 정보를 html로 전달
        model.addAttribute("student", student);

        return "student_detail";
    }
// 학생 삭제 + 목록 페이지
    @GetMapping("/stuDelete")
    public String delete(@RequestParam(name="stuNum")int stuNum){
        studentService.deleteStu(stuNum);
        return "redirect:/";
    }

    @GetMapping("/updateForm")
      public String updateForm(@RequestParam(name="stuNum") int stuNum, Model model){
// 정보를 수정할 학생의 원래 정보를 html에 전달
//        정보를 수정할 학생 한명을 pick!
        StudentVO student= studentService.getStuDetail(stuNum);
//        수정할 학생을 html로 전달
        model.addAttribute("student",student );
        return "update_student";
    }
// 학생 정보 수정+ 상세 페이지로 이동
    @PostMapping("/updateStu")
    public String updateStu(StudentVO studentVO){
//        학생정보 수정
        studentService.updateStu(studentVO);
        return "redirect:/detail?stuNum="+studentVO.getStuNum();
    }
}
