package com.green.ReactBoard.controller;

import com.green.ReactBoard.VO.BoardVO;
import com.green.ReactBoard.VO.MemberVO;
import com.green.ReactBoard.service.AxiosService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AxiosController {
    @Resource(name="axiosService")
    private AxiosService axiosService;

//    1번 버튼 클릭시 호출 되는 메서드
    @GetMapping("/getList")
    public List<BoardVO> getList(){
        return axiosService.getList();
    }

    @PostMapping("/insertBoard")
    public void insertBoard(@RequestBody MemberVO memberVO){
        System.out.println(memberVO);
        System.out.println(1);
    }

    @PutMapping("/updateBoard")
    public int updateBoard(BoardVO boardVO){
        System.out.println(boardVO);
//        데이터베이스 쿼리실행
        return 10;
    }

//    리엑트에서 GET으로 정보를 넘기면 get으로
    @GetMapping("/detail/{boardNum}")
    public void detail(@PathVariable("boardNum") int boardNum){
        System.out.println(boardNum);
    }
}
