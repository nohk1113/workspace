import axios from "axios"

// 아이디 중복 체크
export const checkId=(data)=>{
  const response=axios.get(`/member/checkId/${data}`)
  return response;
}
// 회원가입
export const join=(data)=>{
  const reponse= axios.post('/member/join', data); // 자바에 멤버 컨트롤러 와 같은것을 넣으면 됨
  return reponse;
}

export const login=(data)=>{
  const reponse=axios.post('/member/login', data);
  return reponse;
}


// import * as memberApi from '../apis/memberApi'      다른 곳에서 사용할떄