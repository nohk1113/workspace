package com.green.Board.service;

import com.green.Board.vo.BoardVO;
import com.green.Board.vo.MemberVO;
import com.green.Board.vo.SearchVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("boardService")
public class BoardServiceImpl implements BoardService{
    @Autowired
    private SqlSessionTemplate sqlSession;

    //게시글 목록 조회 + 검생창 기능
    @Override
    public List<BoardVO> getBoardList(SearchVO searchVO) {
        return sqlSession.selectList("boardMapper.getBoardList", searchVO);
    }

//    글 등록
    @Override
    public void insertBoard(BoardVO boardVO) {
        sqlSession.insert("boardMapper.insertBoard", boardVO);
    }

//    글 상세보기
    @Override
    public BoardVO getBoardDetail(int boardNum) {
        BoardVO boardVO=sqlSession.selectOne("boardMapper.getBoardDetail", boardNum);
        return boardVO;
    }

//    수정하기 위해 불러오는 정보  X
    @Override
    public BoardVO updateBoard( int boardNum) {
        return sqlSession.selectOne("boardMapper.getBoardDetail", boardNum);
    }

//    수정하는 것을 실행하는 것
    @Override
    public void update(BoardVO boardVO) {
        sqlSession.update("boardMapper.update", boardVO);
    }

//    게시글 삭제(댓글 + 게시글 삭제)
    @Override
    public void delBoard(int boardNum) {
//        댓글 삭제
        sqlSession.delete("replyMapper.delBoard", boardNum);
//        게시글 삭제
        sqlSession.delete("boardMapper.delBoard", boardNum);
    }


}
