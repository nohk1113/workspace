import axios from 'axios';
import React, { useEffect, useState } from 'react'
import { useNavigate, useParams } from 'react-router-dom';
import * as boardApi from '../apis/boardApi';

const Update = () => {
  const navigate=useNavigate();

  const {boardNum}=useParams();

    // 수정 쿼리 실행시 빈 값을 채워줄 데이터
  const [boardData, setBoardData]=useState({
    boardNum:boardNum,
    title:'',
    content:''
  });

  function changeBoard(e){
    setBoardData({
      ...boardData,
      [e.target.name]:e.target.value
    });
  }

  useEffect(()=>{
    boardApi.getboardDetail(boardNum)
    // axios.get(`/board/update/${boardNum}`)
    .then((res)=>{
      setBoardData(res.data);
      setBoardData({
        ...boardData,
        title:res.data.title,
        content:res.data.content
      });
    })
    .catch((error)=>{
      alert('오류1');
      console.log(error);
    });
  },[]);

  // 게시글 수정 쿼리 실행
  function updateBoard(){
    boardApi.updateBoard(boardData)
    // axios.put('/board/update', data)
    .then((res)=>{
      alert('게시글을 수정하였습니다');
      navigate(`/detail/${boardNum}`);
    })
    .catch((error)=>{
      alert('오류2');
    });
  }




  return (
    <div>
      <table>
        <thead>
          <tr>
            <td>작성일</td>
            <td>{boardData.createDate}</td>
            <td>작성자</td>
            <td>{boardData.memId}</td>
          </tr>
          <tr>
            <td>제목</td>
            <td><input type='text' value={boardData.title} name='title'
            onChange={(e)=>{changeBoard(e)}}/></td>
          </tr>
          <tr>
            <td>내용</td>
            <td><textarea type='textarea' value={boardData.content} name='content'
            onChange={(e)=>{changeBoard(e)}}/></td>
          </tr>
        </thead>
      </table>
      <button type='button' className='btn'>뒤로가기</button>
      <button type='button' className='btn' onClick={(e)=>{updateBoard()}}>수정</button>
    </div>
  )
}

export default Update;