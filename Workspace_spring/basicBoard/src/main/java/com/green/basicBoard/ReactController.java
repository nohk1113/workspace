package com.green.basicBoard;

import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ReactController {
    @Resource(name="boardService")
    private BoardService boardService;


//    게시글 처음 화면 + 글쓰기 이동
    @RequestMapping("/list")   //  겟 과 포스트를 혼합으로 사용할떄 리퀘스트
    public List<BoardVO> board_list(Model model, SearchVO searchVO){

//        목록들 정보 전달
        List<BoardVO> boardList=boardService.getBoardList(searchVO);

            return boardList;
    }

}
