package com.green.Board.vo;

import lombok.Data;
import lombok.ToString;

@Data
//페이지 처리를 위한 모든 정보를 갖는 클래스
public class PageVO {
//    전체 데이터 수
    private int totalDataCnt;

//    한페이지에 보여지는 게시글 수
    private int displayDataCnt;

//    전체 페이지 수
    private int totalPageCnt;

//    현재 페이지
    private int nowPage;

//    한 화면에 보여지는 페이지 수
    private int displayPageCnt;

//    회면에 보이는 시작페이지
    private int beginPage;

//    회면에 보이는 마지막페이지
    private int endPage;

//    이전 버튼의 유무
    private boolean prev;
//    다음 버튼의 유무
    private boolean next;

//    생성자
//    매개변수 : DB에서 조회한 전체 데이터 수
    public PageVO(int totalDataCnt){
        nowPage=1;
        displayPageCnt=5;
        displayDataCnt=5;
        this.totalDataCnt=totalDataCnt;
    }

//    모든 페이지 정보를 세팅하는 메서드
    public void setPageInfo(){
//        총 게시슬 수-> totalDataCnt    20
//        현재 페이지->nowPage   1
//        한 화면에 보이는 페이지 수 displayPageCnt   5
        endPage= (int)Math.ceil(nowPage/(double)displayPageCnt) * displayPageCnt;

//        Math.round(); // 반올림
//        Math.floor()  //버림
//        Math.ceil()  //올림

//        화면에 보이는 시작페이지 번호
        beginPage=endPage-displayPageCnt+1;

//        전체 페이지수
        totalPageCnt=(int)Math.ceil(totalDataCnt/(double)displayDataCnt);

        if(endPage>totalPageCnt){
            endPage=totalPageCnt;
        }

//        이전 버튼 유무
        prev= beginPage!=1;

//        다음 버튼 유무
        next=endPage!=totalPageCnt;
    }
}
