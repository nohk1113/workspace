package com.green.Board.service;

import com.green.Board.vo.BoardVO;
import com.green.Board.vo.MemberVO;
import com.green.Board.vo.SearchVO;

import java.util.List;

public interface BoardService {

    //게시글 목록 조회 +  게시글 검색 기능
    List<BoardVO> getBoardList(SearchVO searchVO);

//    게시글 등록
    void insertBoard(BoardVO boardVO);

//    글 상세보기
    BoardVO getBoardDetail(int boardNum);

//    수정 하기위해 정보를 불러오는 페이지  X
    BoardVO updateBoard(int boardNum);

//    수정을 수행하는 자바
    void update(BoardVO boardVO);

//    게시글 삭제
    void delBoard(int boardNum);

}
