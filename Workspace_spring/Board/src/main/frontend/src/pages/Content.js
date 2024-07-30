import axios from 'axios';
import React, { useState } from 'react'
import { useNavigate } from 'react-router-dom'
import * as boardApi from '../apis/boardApi';

const Content = ({loginInfo}) => {
  const navigate=useNavigate();

  const [boardInfo, setBoardInfo]=useState({
    memId:loginInfo.memId,
    title:'',
    content:''
  });

function update(){
  boardApi.insertBoard(boardInfo)
  .then((res)=>{
    alert('등록이 되었습니다.');
    // setBoardInfo(res.data);
    navigate('/');
  })
  .catch((error)=>{
    alert('글 등록 오류');
    console.log(error);
  });
}


function changeBoard(e){
  setBoardInfo({
    ...boardInfo,
    [e.target.name]:e.target.value
  });
}



  return (
    <div className='body'>
      <table>
        <thead>
          <tr>
            <td>제목</td>
            <td><input type='text' name='title' onChange={(e)=>{changeBoard(e)}}/></td>
          </tr>
          <tr>
            <td>내용</td>
            <td><textarea type='textarea' name='content' onChange={(e)=>{changeBoard(e)}}/></td>
          </tr>
        </thead>
      </table>
        <button className='btn' onClick={(e)=>{update()}}>글 등록</button>
    </div>
  )
}

export default Content;