import React, { useState } from 'react'
import './joinform.css'
import axios from 'axios'
import * as memberApi from '../apis/memberApi'
import { useNavigate } from 'react-router-dom'
//  약어 rafce

const JoinForm = () => {
  const navigate=useNavigate();
  // 버튼 활성화 여부 state 변수
  const [isDisabled,setisDisabled ]=useState(true);

  // 회원가입 시 가지고 가야하는 데이터를 저장할 state 변수
  const [joinData, setJoinData]=useState({
    memId:'',
    memPw:'',
    confirmPw:'',
    memName:'',
    gender:'male'
  });
  // input 태그에 값 입력시 joinData 변경
  function changeJoinData(e){
//  아이디 input태그의 값이 변경되면 회원가입 버튼을 비활성화
if(e.target.name=='memId'){
  setisDisabled(true);
}


    setJoinData({
      ...joinData,
      [e.target.name]:e.target.value
    });
  }
  
  // 아이기 중복 획인 함수
  function checkId(){
    if(joinData.memId==''){
      alert('아이디를 입력해 주세요.');
      return ;
    }

    // id 값을 가지고 자바로 가서 중복확인 쿼리를 실행
    // axios.get(`/member/checkId/${data}`)
    memberApi.checkId(joinData.memId)
    .then((res)=>{
      const result= res.data;
      if(result){
        alert('ID  중복');
      }
        else{
          alert('사용가능');
        }
        // 사용 가능한 ID면 활성화
        if(!result){
          setisDisabled(false);
        }

        // alert(result?'ID 중복' : '사용 가능');  삼항연산자 
    })
    .catch((error)=>{
      alert('중복');
      console.log(error);
    });
  }

  //  회원가입 버튼 클릭 시 실행
  function join(){
    // vaildation 처리 (유효성 검사)
    if(joinData.memPw !=joinData.confirmPw){
      alert('비번이 일치하지 않습니다');
      return ;
    }

    // 아이디 4~8 글자
    const idLength=joinData.memId.length;
    if(idLength < 4|| idLength > 8){
      alert('아이디는 4~8글자 여야 합니다');
      return ;
    }

    // 회원가입
    memberApi.join(joinData)
    .then((res)=>{
      alert('회원가입을 축하합니다');
      // 로그인 페이지로 이동
      navigate('/joinForm');
    })
    .catch((error)=>{
      console.log(error);
    });
  }


  return (
    <div className='join-div'>
      <div>
        <p>아이디</p>
        <div className='id-area'>
          <input className='inp' type='text' name='memId' onChange={(e)=>{changeJoinData(e)}}></input>
          <button type='button' className='btn' onClick={(e)=>{checkId()}}>중복 확인</button>
        </div>
      </div>
      <div><p>비밀번호</p>
      <input className='inp' type='password' name='memPw' onChange={(e)=>{changeJoinData(e)}}></input></div>
      <div><p>비밀번호 확인</p>
      <input className='inp' type='password' name='confirmPw'
      onChange={(e)=>{changeJoinData(e)}}></input></div>
      <div><p>이름</p>
      <input className='inp' type='text' name='memName' onChange={(e)=>{changeJoinData(e)}}></input></div>
      <div className='gender-div'>
        <div>성별</div>
        <div><input type='radio' name='gender' value="male" 
        onChange={(e)=>{{changeJoinData(e)}}}
        // onClick={(e)=>{changeJoinData(e)}}
        checked={joinData.gender=='male'}></input>남</div>
        <div><input type='radio' name='gender' value="female" 
        onChange={(e)=>{{changeJoinData(e)}}}
        // onClick={(e)=>{changeJoinData(e)}}
        checked={joinData.gender=='female'}></input>여</div>
      </div>
      <div className='btn-div'>
        <button type='button' className='btn'
          onClick={(e)=>{join()}} disabled={isDisabled}>회원가입</button>
        </div>
    </div>
  )
}

export default JoinForm;

