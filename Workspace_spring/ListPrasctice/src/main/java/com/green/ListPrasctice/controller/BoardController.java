package com.green.ListPrasctice.controller;

import com.green.ListPrasctice.VO.BoardVO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BoardController {
//     게시글 목록을 저장할 리스트 생성
    List<BoardVO> boardList=new ArrayList<>();


    @GetMapping("/board")
    public String boardController(Model model){
//        게시글 목록 데이터를 html로 전달
        model.addAttribute("boardList", boardList);    // 정보 입력

        return "board_list";
    }

    @GetMapping("/writeForm")
    public String writeForm(){
        return "board_write_Form";
    }

    @PostMapping("/regBoard")
    public  String www(BoardVO boardVO){
        System.out.println(boardVO);
        boardList.add(boardVO);
//        return 에는 원래 이동할 html 파일 명 작성
//        redirect: -> 컨트롤러로 이동하겠다.
        return "redirect:/board";
    }

    @GetMapping("/board_detail")
    public String last(BoardVO boardVO, Model Model, @RequestParam (name="boardNum") int boardNum){
//        내가 클릭한 게시글의 글번호 알아내기
        BoardVO result = null;
        for(BoardVO board:boardList){
            if(board.getBoardNum() == boardNum){
                result=board;
            }
        }
        Model.addAttribute("board", result);
//         게시글 목록에서 (boardList) 에서 내가 가지고 온 글 번호와 일치하는 게시글을 찾음
        return "board_detail";
    }

//    게시글 삭제--> 게시글 목록으로 페이지 이동
    @GetMapping("/delete")
    public String delete(@RequestParam(name = "boardNum")int boardNum){


        System.out.println(boardNum);
        int deleteIndex=0;
        for(int i=0; i< boardList.size();i++){
            if(boardList.get(i).getBoardNum()== boardNum){
                deleteIndex=i;
            }
        }
        boardList.remove(deleteIndex);
        return "redirect:/board";
    }
}
