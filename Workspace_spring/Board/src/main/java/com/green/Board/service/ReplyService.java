package com.green.Board.service;

import com.green.Board.vo.ReplyVO;

import java.util.List;

public interface ReplyService {
// 댓글목록
    List<ReplyVO> getReplyList(int boardNum);

    void insertReply(ReplyVO replyVO);

    void delReply(int replyNum);

//    게시글 삭제를 위한 댓글 삭제
    void delBoard(int boardNum);
}
