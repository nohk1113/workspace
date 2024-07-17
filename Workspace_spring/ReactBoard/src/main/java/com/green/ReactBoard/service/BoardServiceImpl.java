package com.green.ReactBoard.service;

import com.green.ReactBoard.VO.BoardVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service("boardService")
public class BoardServiceImpl implements BoardService{
    @Autowired
    private SqlSessionTemplate sqlSession;

//    게시글 목록 조회
    @Override
    public List<BoardVO> getBoardList() {
//             mapper 아이디 와 실행시킬 쿼리의 아이디를 입력해야함
        List<BoardVO> boardList =sqlSession.selectList("boardMapper.getBoardList");
        return boardList;  // 원하는 데이터를 리턴하는것이다
    }

//    글등록
    @Override
    public void insertBoard(BoardVO boardVO) {
        sqlSession.insert("boardMapper.insertBoard", boardVO);
    }

    @Override
    public BoardVO getBoardDetail(int boardNum) {
        BoardVO boardVO=sqlSession.selectOne("boardMapper.getBoardDetail", boardNum);
        return boardVO;
    }

    @Override
    public void deleteBoard(int boardNum) {
        sqlSession.delete("boardMapper.deleteBoard", boardNum);
    }

}
