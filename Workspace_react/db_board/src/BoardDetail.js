import axios from "axios";
import { useEffect, useState } from "react";
import { useParams } from "react-router-dom";


const BoardDetail=()=>{
  const params=useParams();
  const[board, setBoard]=useState({});


  useEffect(()=>{
    axios
    .get(`/boardDetail/${params.boardNum}`)
    .then((res)=>{
      console.log(res.data);
      setBoard(res.data);
    })
    .catch((error)=>{
      alert('오류발생');
      console.log(error);
    });
  },[]);

  return(
    <>
      <table>
        <thead>
          <tr>
            <td>글번호</td>
            <td>{board.boardNum}</td>
          </tr>
          <tr>
            <td>제목</td>
            <td>{board.boardTitle}</td>
          </tr>
          <tr>
            <td>작성자</td>
            <td>{board.boardWriter}</td>
          </tr>
          <tr>
            <td>작성일</td>
            <td>{board.createDate}</td>
          </tr>
          <tr>
            <td>내용</td>
            <td>{board.content}</td>
          </tr>
        </thead>
      </table>
    </>
    

  );
}


export default BoardDetail;