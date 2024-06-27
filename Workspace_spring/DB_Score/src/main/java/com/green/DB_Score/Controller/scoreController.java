package com.green.DB_Score.Controller;

import com.green.DB_Score.VO.ScoreVO;
import com.green.DB_Score.service.ScoreServiceImpl;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class scoreController {
    @Resource(name="scoreService")
    private ScoreServiceImpl scoreService;


//     학생 목록 페이지
    @GetMapping("/")
    public String studentList(Model model){
// 학생 목록 데이터를 DB에서 조회
        List<ScoreVO> stuList=scoreService.getStu();
        model.addAttribute("stuList", stuList);
     return "stu_list";
 }
 @GetMapping("/reg_student")
    public String insertstu(ScoreVO scoreVO){

     return "reg_student";
 }



}
