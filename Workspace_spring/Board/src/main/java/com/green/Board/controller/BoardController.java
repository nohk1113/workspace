package com.green.Board.controller;

import com.green.Board.service.BoardService;
import com.green.Board.service.MemberService;
import com.green.Board.vo.BoardVO;
import com.green.Board.vo.MemberVO;
import com.green.Board.vo.SearchVO;
import jakarta.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/board")
public class BoardController {
    private static final Logger log = LoggerFactory.getLogger(BoardController.class);
    @Resource(name = "boardService")
    private BoardService boardService;

    //게시글 목록 조회 + 검색창 기능
    @PostMapping("/list")
    public List<BoardVO> getBoardList(@RequestBody SearchVO searchVO){
        log.info(searchVO.toString());
        return boardService.getBoardList(searchVO);
    }

    //게시글 상세 조회
    @GetMapping("/detail/{boardNum}")
    public BoardVO getDetail(@PathVariable("boardNum")int boardNum){
        return boardService.getBoardDetail(boardNum);
    }

//    글 등록
    @PostMapping("/content")
    public void  content(@RequestBody BoardVO boardVO){
        log.info("--------------------BoardController : insertBoard() run--------------");
        log.info(boardVO.toString());
        boardService.insertBoard(boardVO);
    }

//    글 상세보기
    @PostMapping("/detail/{boardNum}")
    public BoardVO getBoardDetail(@PathVariable("boardNum") int boardNum){
        return boardService.getBoardDetail(boardNum);
    }

//    수정화면만 띄우기  X
    @GetMapping("/update/{boardNum}")
    public BoardVO updateBoard(@PathVariable("boardNum")int boardNum){
        return boardService.updateBoard(boardNum);
    }

// 수정을 실행
    @PutMapping("/update")
    public void update(@RequestBody BoardVO boardVO){
        boardService.update(boardVO);
    }

//    글 삭제
    @DeleteMapping("/delBoard/{boardNum}")
    public void delBoard(@PathVariable("boardNum")int boardNum){
        boardService.delBoard(boardNum);
    }
}
