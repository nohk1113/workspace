// 서버와 통신하는 기능을 모아놓은 js

// import * as api from './api';

import axios from "axios";

// 학생 목록조회 api
  export const getStuList=()=>{
    const reponse=axios.get('/list');
    return reponse;
  }


  // import { getStuList } from "./api"; 필요한것만 사용하는법

  export let myName='kim';
  export let myAge=30;

  export const myprint=()=>{
    console.log(1)
  }

  export const getNum=()=>{
    const num=10;
    return num;
  }

// UpdateStu.js 에서 사용하는 것
  export const stuDetail=(stuNum)=>{
    const response=axios.get(`/stuDetail/${stuNum}`)
    return response;
  }


  // 학생 점수정보를 등록하는 함수
  export const updateScore=(data)=>{
    const response=axios.put('/update', data);
    return response;
  }

  // export const getReg=axios.post('/regStu',stuInfo)