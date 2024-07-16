package com.green.ReactBoard.service;

import com.green.ReactBoard.VO.BoardVO;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public interface BoardService {

//     게시글 목록 조회 하는 쿼리
    List<BoardVO> getBoardList();   // 메개변수가 하는건 빈값에 무엇을 채울지 정하는것

//    게시글 등록
    void insertBoard(BoardVO boardVO);

//    게시글 상세정보
    BoardVO getBoardDetail(int boardNum);
}
