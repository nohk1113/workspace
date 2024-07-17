import axios from "axios";
import { useEffect, useState } from "react";
import { useNavigate, useParams } from "react-router-dom";


const BoardDetail=()=>{
  const params=useParams();
  const[board, setBoard]=useState({});
  const navigate=useNavigate();


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


  function deleteBoard(){
    if(window.confirm('삭제 하시겠습니까?')){
      axios
      .delete(`/deleteBoard/${board.boardNUm}`)   // 자바의 주소임
      .then((res)=>{
        alert('정보가 삭제되었습니다');
        navigate('/');
      })
      .catch((error)=>{
        alert('삭제가 되지 않았습니다(오류)');
      });
    }
  }


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
        <button type="button" onClick={()=>{navigate(-1)}}>뒤로가기 1</button>
        <button type="button" onClick={()=>{navigate('/')}}>뒤로가기 2</button>
        <button type="button" onClick={(e)=>{deleteBoard()}}>글 삭제</button>
      </table>
    </>
    

  );
}


export default BoardDetail;