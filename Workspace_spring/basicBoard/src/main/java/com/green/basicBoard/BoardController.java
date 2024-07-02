package com.green.basicBoard;

import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.sql.SQLOutput;
import java.util.List;
import java.util.Set;

@Controller
public class BoardController {
    @Resource(name="boardService")
    private BoardService boardService;


//    게시글 처음 화면 + 글쓰기 이동
    @RequestMapping("/")   //  겟 과 포스트를 혼합으로 사용할떄 리퀘스트
    public String board_list(Model model, SearchVO searchVO){
        // searchVO 데이터 검사
        System.out.println(searchVO);

//        목록들 정보 전달
        List<BoardVO> boardList=boardService.getBoardList(searchVO);
        model.addAttribute("boardList", boardList);
        return "board_list";
    }


//     글쓰기 화면 + 글 등록하기
    @GetMapping("/write")
    public String write_form(BoardVO boardVO){

        return "write_form";
    }
//    html안만들어도 됨 (글을 등록하는 곳)+ 글등록
    @PostMapping("/reg")
    public String reg(BoardVO boardVO){
        boardService.insertBoard(boardVO);
        return "redirect:/";
    }
// 상세보기 페이지 + 뒤로   + 조회수 증가
    @GetMapping("/detail")
    public String boardDetail(@RequestParam(name = "boardNum") int boardNum, Model model){
        BoardVO boardVO = boardService.getBoardDetail(boardNum);
        model.addAttribute("board", boardVO);
//        [[${board.boardNum}]]   << 해당 html에 이런식으로 적어야함

//        조회수 증가하는 문법
        boardService.updateReadCnt(boardNum);
        return "board_detail";
    }

//    글 삭제
    @GetMapping("/deleteBoard")
    public String deleteBoard(@RequestParam(name="boardNum")int boardNum){
        boardService.deleteBoard(boardNum);
        return "redirect:/";
    }

}
