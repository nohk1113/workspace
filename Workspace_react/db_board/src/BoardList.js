import axios from "axios";
import { useEffect, useState } from "react";

const BoardList=()=>{

  const [boardList, setBoardList]=useState([]);
  // 게시글 목록 조회 데이터 받기  (자바, 스프링에서)
  // useEffect 안의 내용은 마지막에 실행
  useEffect(()=>{
// 게시글 목록을 저장할 변수 (state 변수)

    // 서버에서 데이터를 받기
    axios
    .get('/boardList')   // 데이터를 가져올 url을 작성
    // res.data: 조회한 데이터
    .then((res)=>{
      console.log('조회 성공~');
      console.log(res.data);
      setBoardList(res.data);
    })   // 데이터 조회 후 실행 할 내용 (res는 통신 결과 모든 정보가 담긴 객체)
    .catch((error)=>{
      console.log('※ axios 통신 중 오류 발생 ※');
      console.log(error);
    });  // 오류 발생시 실행할 내용 (오류발생시에만 실행됨)
    //error - 오류에 개한 모든 정보가 담긴 객체
  }, []);

  return(
    <div>
      <table>
        <thead>
          <tr>
            <td>글 번호</td>
            <td>제목</td>
            <td>작성자</td>
            <td>작성일</td>
          </tr>
        </thead>
        <tbody>
          {
            boardList.map((board, i)=>{
              return(
                <tr key={i}>
                <td>{board.boardNum}</td>
                <td>{board.boardTitle}</td>
                <td>{board.boardWriter}</td>
                <td>{board.createDate}</td>
              </tr>
              );
              
            })
          }
        </tbody>
      </table>
    </div>
    
  );
}

export default BoardList;