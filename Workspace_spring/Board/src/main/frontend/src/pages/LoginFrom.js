import React, { useState } from 'react'
import * as memberApi from '../apis/memberApi'
import { useNavigate } from 'react-router-dom';

// 리액트는 회면을 새로고침을 할때마다 데이터가 초기화 되기 때문에
// 로그인을 했다는 정보를 일반적인 방식으로 저장해도 새로고침하면 로그인이 풀려버린다

// 새로고침 해도 정보가 사라지지 않는 저장 공간을 두개 제공
// 이 두개의 저장 공감은 client pc에 존재한다
// 문자열 데이터만 저장이 가능

// localStorage  : 여기에 저장되는 데이터는 직접 삭제하지않는 한 반영구적으로 보전
//  인터넷이 끊겨도 , 컴퓨터를 재부팅해도 데이터가 살아있음
// 브라우저에 다른 탭 끼리도 데이터가 공유

//  sessionStorege  : 여기에 저장되는 데이터는 인터넷을 종료하면 자동으로 사라짐
// 브라우저의 탭이 달라도 데이터 공유가 안됨.
// 사용방법
// 데이터 저장 : window.sessionStorage.setItem(key, value);
// 데이터 읽기 : window.sessionStorage.getItem(key);
// 데이터 삭제: window.sessionStorage.removeItem(key);
// 전체 데이터 삭제: window.sessionStorage.clear();

// 함수를 전달하는 법 다른 컴포먼트에서 (setLoginInfo)이것을 전달받음
const LoginFrom = ({setLoginInfo}) => {

  const navigate=useNavigate();
  // sessionStorage에 데이터 입력
  window.sessionStorage.setItem('name', 'kim');
  window.sessionStorage.setItem('age', 20);
  const n={
    stuNum:1,
    stuName:'kim',
    score:80
  };

  //JSON.stringify();
  // Json-> 객체
  // JSON.parse();

  window.sessionStorage.setItem('member', JSON.stringify(n));

  const data= window.sessionStorage.getItem('member');
  console.log(data);
  // json 데이터를 가져오면 문자로 인식한다.
  console.log(data.stuNum);

  const result= JSON.parse(data);
  console.log(result);

  // 객체나 배열을 Storage에 저장을 할때 json 형태로 저장 할수 있음
  // json(javascript object notation) ->자바 스크립트의 객체를 문자화 시킨것
  // {name: 'kim', age:20}-> "{name: 'kim', age:20}"
  // 모든 언어에서 공통으로 해석할수 있는 자료형

  // sessionStorage에서 데이터 읽기
  console.log(window.sessionStorage.getItem('name'));

  const [loginData, setLoginData]=useState({
    memId:'',
    memPw:''
  });

  function changeLoginData(e){
    setLoginData({
      ...loginData,
      [e.target.name] : e.target.value
    });
  }

  function login(){
// 아이디 비번 입력했는지 유효성 검사
    memberApi.login(loginData)
    .then((res)=>{
      //  조회결과에 따라 로그인 실행
      // 조회 결과가 있으면 로그인 처리
      // 조회 결과가 없으면 다시 로그인 할수있도록 처리
      console.log(res.data);
      
      if(res.data!=''){
        alert('로그인 성공');
        navigate('/');

        // sessionStorage에 로그인한 사람의 아이디, 이름을 저장, 권한 저장

;
const loginInfo={
  memId:res.data.memId,
  memName: res.data.memName,
  memRole:res.data.memRole
};
// 위에 3가지 코드를 아래 하나로 만들수있음
        window.sessionStorage.setItem('loginInfo', JSON.stringify(loginInfo));
        //const {memId, memName, memRole}=res.data;    // 3개를 한줄로 변수저장하는 방법
        setLoginInfo(loginInfo);

      }
      else{
        alert('ID혹은 비밀번호가 틀립니다');
      }
    })
    .catch((error)=>{
      console.log(error);
    });
  }


  return (
    <div>
      <input type='text' placeholder='input ID' 
      name='memId' onChange={(e)=>{changeLoginData(e)}}/>
      <input type='password' placeholder='input PW' 
      name='memPw' onChange={(e)=>{changeLoginData(e)}}/>
      <input type='button' className='btn' value='로그인' onClick={(e)=>{login()}}></input>
    </div>
  )
}

export default LoginFrom;