package com.green.ReactBoard.controller;

import com.green.ReactBoard.VO.BoardVO;
import com.green.ReactBoard.service.BoardService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

// RestController 어노테이션이 붙은 클레스는 컨트롤러 역할을 한다
//controller 어노테이션과 다른점
// 1. 해당 클레스의 리턴은 html 파일명이 아니다.
// 2. 리턴 되는 것은 react로 만든 회면에 보여줄 데이터를 리턴한다.
// 3. 메서드의 리턴타입을 잘 지정해야한다!
@RestController
public class BoardController {

    @Resource(name = "boardService")
    //    객체 선언을 하기만 했음  (게시글 목록 조회)
    private BoardService boardService;

//    게시글 목록 조회 (impl에 있는 메서드의 이름을 가져오는것)
    @GetMapping("/boardList")
//     리턴하는 값이 List<BoardVO> 타입으로 리턴을 한다는 의미 (통이라고 생각하면 쉬움)
//    정보들을 List<BoardVO>라는 통에 담아서 주는것 (예_ int 는 숫자 통, string 문자 통)
    public List<BoardVO> getBoardList(){
       List<BoardVO> boardList=boardService.getBoardList();
        return boardList;
    }
}
