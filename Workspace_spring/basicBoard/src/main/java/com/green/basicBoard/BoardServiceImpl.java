package com.green.basicBoard;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

// mapper 의 namespace 와 일치를 시켜야 한다
@Service("boardService")
public class BoardServiceImpl implements BoardService{

    @Autowired
    private SqlSessionTemplate sqlSession;


    @Override
    public List<BoardVO> getBoardList(SearchVO searchVO) {
       List<BoardVO> list = sqlSession.selectList("boardMapper.getBoardList", searchVO);
      // return  sqlSession.selectList("boardMapper.getBoardList");   같은 것임
        return list;     //   리턴은 퍼블릭 뒤에 나와있음
    }

    @Override
    public void insertBoard(BoardVO boardVO) {
         //              namespace 랑 똑같이 해야함
        sqlSession.insert("boardMapper.insertBoard", boardVO);
    }

    @Override
    public BoardVO getBoardDetail(int boardNum) {
        BoardVO boardVO=sqlSession.selectOne("boardMapper.getBoardDetail", boardNum);
        return boardVO;
    }

}
