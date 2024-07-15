package com.green.ReactBoard.service;

import com.green.ReactBoard.VO.BoardVO;

import java.util.List;

public interface BoardService {

//     게시글 목록 조회 하는 쿼리
    List<BoardVO> getBoardList();   // 메개변수가 하는건 빈값에 무엇을 채울지 정하는것

}
