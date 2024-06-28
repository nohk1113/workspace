package com.green.DB_Score.Controller;

import com.green.DB_Score.VO.ScoreVO;
import com.green.DB_Score.service.ScoreServiceImpl;
import jakarta.annotation.Resource;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.sql.SQLOutput;
import java.util.List;

@Controller
public class scoreController {
    @Resource(name="scoreService")
    private ScoreServiceImpl scoreService;


    //학생 목록 페이지
    @GetMapping("/")
    public String studentList(Model model){
        // 학생 목록 데이터를 DB에서 조회
        List<ScoreVO> stuList=scoreService.getStuList();
        model.addAttribute("stuList", stuList);
        return "stu_list";
    }

    // 하생 등록 페이지로 이동
    @GetMapping("/reg_student")
    public String insertStu(ScoreVO scoreVO){
        // 인설트 작업이 필요함 == mapper에서 하면됨 (정보 등록을 위함)
         return "reg_student";
    }

    //학생 정보 등록, 목록 페이지로 이동
    @PostMapping("/reg")
    public String reg(ScoreVO scoreVO){
        System.out.println(scoreVO);
        scoreService.insertStudent(scoreVO);
        //다시 돌아가는것 (redirect:)
        return "redirect:/";
    }

    // 학생 정보 상세 페이지
    @GetMapping("/student_detail")
//    public String studentDetail(ScoreVO scoreVO){
    public String studentDetail(@RequestParam(name="stuNum")int stuNum,  Model model){
        // 데이터를 꺼내는것 scoreVO.getStuNum()
//    scoreService.getStuDetail(scoreVO.getStuNum());
    ScoreVO student =scoreService.getStuDetail(stuNum);
    model.addAttribute("student", student);
            return "student_detail";
    }

    // 학생 정보를 삭제
    @GetMapping("/delete")
    public String delete(ScoreVO scoreVO){
        int delete=scoreService.delete(scoreVO.getStuNum());
//         목록으로 다시 돌아가는 방법
        return "redirect:/";
    }

//    정보를 수정하는 페이지
    @GetMapping("/update")
    public String update(@RequestParam(name="stuNum") int stuNum, Model model){
        ScoreVO student=scoreService.getStuDetail(stuNum);
        model.addAttribute("student", student);

        return "update_student";
    }

//    학생정보를 수정하고 상세 페이지로 이동
    @PostMapping("/update2")
    public String update(ScoreVO scoreVO){
        scoreService.updateStudent(scoreVO);
        return "redirect:/student_detail?stuNum=" + scoreVO.getStuNum();
    }
}
