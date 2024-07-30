package com.green.Board.service;

import com.green.Board.vo.ReplyVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("replyService")
public class ReplyServiceImpl implements ReplyService{
    @Autowired
    private SqlSessionTemplate sqlSession;

//    댓글목록
    @Override
    public List<ReplyVO> getReplyList(int boardNum) {
        return sqlSession.selectList("replyMapper.getReplyList", boardNum);
    }

    @Override
    public void insertReply(ReplyVO replyVO) {
        sqlSession.insert("replyMapper.insertReply", replyVO);
    }

//     댓글 삭제
    @Override
    public void delReply(int replyNum) {
        sqlSession.delete("replyMapper.delReply", replyNum);
    }

    @Override
    public void delBoard(int boardNum) {
        sqlSession.delete("reply.Mapper.delBoard", boardNum);
    }


}
