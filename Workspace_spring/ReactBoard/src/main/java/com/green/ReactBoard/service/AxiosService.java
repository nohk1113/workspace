package com.green.ReactBoard.service;

import com.green.ReactBoard.VO.BoardVO;

import java.util.List;

public interface AxiosService {
//    셀렉트를 실행시키는 메소드
    List<BoardVO> getList();
}
