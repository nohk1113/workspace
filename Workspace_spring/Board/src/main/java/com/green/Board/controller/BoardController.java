package com.green.Board.controller;

import com.green.Board.service.BoardService;
import com.green.Board.service.MemberService;
import com.green.Board.vo.BoardVO;
import com.green.Board.vo.MemberVO;
import com.green.Board.vo.PageVO;
import com.green.Board.vo.SearchVO;
import jakarta.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/board")
public class BoardController {
    private static final Logger log = LoggerFactory.getLogger(BoardController.class);
    @Resource(name = "boardService")
    private BoardService boardService;


    //게시글 목록 조회 + 검색창 기능
    @PostMapping("/list")
    public Map<String, Object> getBoardList(@RequestBody(required = false) SearchVO searchVO){
        log.info("...................넘어온 페이지번호.................."+searchVO.getPageNo());
//        전체 게시글 수
        int totalDataCnt= boardService.getBoardCnt();
        //    페이지 정보를 담을 수 있는 pageVO객체 생성
        PageVO pageInfo=new PageVO(totalDataCnt);

//        if(searchVO.getPageNo()!=0){
//            pageInfo.setNowPage(searchVO.getPageNo());
//        }
        pageInfo.setNowPage(searchVO.getPageNo());

        pageInfo.setPageInfo();

//        게시글 목록 데이터
        List<BoardVO> boardList=boardService.getBoardList(pageInfo);

        System.out.println(pageInfo);


//        리액트로 가져갈 모든 데이터를 담을 변수
        Map<String, Object> mapData=new HashMap<>();
//        페이징 정보가 담긴 데이터
        mapData.put("pageInfo", pageInfo);

//        게시글 목록 데이터
        mapData.put("boardList",boardList);

        int a=10;

        return  mapData;
//        return boardService.getBoardList(searchVO);
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
