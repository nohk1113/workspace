package com.green.Board.controller;

import com.green.Board.service.ReplyService;
import com.green.Board.vo.ReplyVO;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reply")
public class ReplyController {
    @Resource(name="replyService")
    private ReplyService replyService;

    //댓글 목록
    @GetMapping("/list/{boardNum}")
    public List<ReplyVO> getReplyList(@PathVariable("boardNum")int boardNum){
        return replyService.getReplyList(boardNum);
    }

    @PostMapping("/insert")
    public void insertReply(@RequestBody ReplyVO replyVO){
        replyService.insertReply(replyVO);
    }

//    댓글 삭제
    @DeleteMapping("/delReply/{replyNum}")
    public void delReply(@PathVariable("replyNum")int replyNum){
        replyService.delReply(replyNum);
    }

//    게시글 삭제를 위한 댓글 삭제
    @DeleteMapping("/delBoard/{boardNum}")
    public void delBoard(@PathVariable("boardNum")int boardNum){
        replyService.delBoard(boardNum);
    }
}
