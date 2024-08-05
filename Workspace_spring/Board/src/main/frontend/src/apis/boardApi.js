//  게시판 테이블에서 사용하는 axios를 모아둠

import axios from "axios"
import { useState } from "react";

// 게시글 목록 조회
export const getboardList=(pageNo)=>{
  const reponse= axios.post('/board/list',{'pageNo':pageNo});
  return reponse;
}

export const insertBoard=(data)=>{
  const reponse=axios
  .post('/board/content', data)
  return reponse;
}

export const getboardDetail = (boardNum)=>{
  const response = axios.get(`/board/detail/${boardNum}`)
  return response;
}

export const updateBoard=(data)=>{
  const reponse=axios.put('/board/update', data)
  return reponse;
}

// import * as boardApi from '../apis/boardApi';