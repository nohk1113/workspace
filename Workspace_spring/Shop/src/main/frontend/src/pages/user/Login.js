import axios from 'axios'
import React, { useState } from 'react'
import { useNavigate } from 'react-router-dom';
import Modal from '../../common/Modal';

const Login = ({setLoginInfo}) => {
  const navigate=useNavigate();

//  로그인 클릭 시 모달창
const [beforeLoginModal, setBeforeLoginModal]=useState(false);

// 로그인 쿼리가 실행된 후 보여지는 모달창의 상태
const [afterLoginModal, setAfterLoginModal]=useState(false);

// 로그인 성공, 실패 여부확인하는 변수
const [isLoginSuccess, setIsLoginSucces]=useState(false);

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
    if(loginData.memId==''||loginData.memPw==''){
      // 모달 창을 보이게 하는 것
      setBeforeLoginModal(true);
      return ;
    }

    axios.post('/api_member/loginForm', loginData)
    .then((res)=>{
      setAfterLoginModal(true);
      // res.data;
      // 자바에서 null 데이터가 전달되면 res.data는 빈 문자 데이터로 변환된다.
      if(res.data==''){
        setIsLoginSucces(false);
      }
      else{
        setIsLoginSucces(true);
        console.log(res.data);

        // 로그인 정보
        const loginInfo={
          memId:res.data.memId,
          memPw:res.data.memPw,
          memRole:res.data.memRole
        };

        //  로그인 정보를 가진 객체를 문자열 형태로 변환
        //  객체-> 쿤자열로 변환한 데이터를 JSON데이터로 부른다
        const json_loginInfo= JSON.stringify(loginInfo);

        window.sessionStorage.setItem('loginInfo', json_loginInfo);
      }
    })
    .catch((error)=>{});
  }

  function Content(){
    return(
      <div>제대로 입력 해 주세요٩( ͡◉ ̯ ͡◉)۶</div>
    );
  }
// 로그인 실행후 띄우는 모달의 안의 내용
  function Content2(){
    return(
      <>
        {
          isLoginSuccess
          ?
          <div>(˶• ﻌ •˶)환영합니다</div>
          :
          <div>(~˙∇˙)~📣확인 바랍니다.</div>
        }
      </>
    );
  }

  // 로그인 쿼리 실행후 띄우는 모달 안의 확인 버튼 클릭시 실행되는 내용
  function handleBtn(){
    if(isLoginSuccess){   // 로그인이 성공했을떄
      // 로그인 성공시 상품 목록 화면으로 넘어감
      navigate('/');
    }
  }


  return (
    <div className='join-div'>
      <table className='join-table'>
        <tbody>
          <tr>
            <td>아이디</td>
            <td><input type='text' name='memId' onChange={(e)=>{changeLoginData(e)}}></input></td>
          </tr>
          <tr>
            <td>비밀번호</td>
            <td><input type='password' name='memPw' onChange={(e)=>{changeLoginData(e)}}></input></td>
          </tr>
        </tbody>
      </table>
      <button type='button' className='btn btn-primary' onClick={(e)=>{login()}}>로그인</button>
      {/* 로그인 중 ID PW 입력 여부를 알려주는 것 */}
      {
        beforeLoginModal
        ?
        <Modal content={Content}
          setIsShow={setBeforeLoginModal}
          onClickModalBtn={()=>{}}/>
        :
        null
      }
      {/* 이 모달은 로그인 쿼리 실행후 뜨는 모달 */}
      {
        afterLoginModal
        ?
        <Modal content={Content2}
        setIsShow={setAfterLoginModal}
        onClickModalBtn={handleBtn}/>
        :
        null
      }
    </div>
  )
}

export default Login