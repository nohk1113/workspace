import logo from './logo.svg';
import './reset.css';
import './App.css';
import { Route, Routes, useNavigate } from 'react-router-dom';
import BoardList from './pages/BoardList';
import JoinForm from './pages/JoinForm';
import LoginFrom from './pages/LoginFrom';
import axios from 'axios';
import { useEffect, useState } from 'react';
import Content from './pages/Content';
import Detail from './pages/Detail';
import Update from './pages/Update';
// state변수의 값이 바뀌면 재랜더링 된다
// 재랜더링: 컴포넌트를 다시 읽는다(코드)

function App() {
  const navigate=useNavigate();

  const [loginInfo, setLoginInfo]=useState({});

  useEffect(()=>{
    const loginDataString=window.sessionStorage.getItem('loginInfo');

    if(loginDataString != null){
      const loginData=JSON.parse(loginDataString);
      setLoginInfo(loginData);
    }
  },[]);

  return (
    <div className='body'>
      <div className="container">
        <div className='header'>
          <div>
            {
              loginInfo.memId==null
              ?
              <>
              {/* 로그인 안했을떄 */}
                <span onClick={(e)=>{navigate('/loginFrom')}}>login</span>
              <span onClick={(e)=>{navigate('/joinForm')}}>Join</span>
              </>
              :
              // {/* 로그인 했을떄 */}
              <div>☆{loginInfo.memName}☆님 반갑습니다람쥐
              <span onClick={(e)=>{
                // 세션스토리지에 있는 저장된 로그인 정보를 제거
                window.sessionStorage.removeItem('loginInfo');
                setLoginInfo({});
                alert('-logout-');
                navigate('/');
              }}>로그아웃</span>
              </div>

            }
            
            
          </div>
          <h1 className='head-h1'>자 유 게 시 판</h1>
        </div>
        <div className='content'>
          <Routes>
            {/* 게시글 목록 페이지                    데이터 넘기는 방법   */}
            <Route path='/' element={ <BoardList loginInfo={loginInfo} /> } />
            {/* 회원가입 페이지 */}
            <Route path='/joinForm' element={<JoinForm/>}/>
            {/* 로그린 페이지 */}
            <Route path='/loginFrom' element={<LoginFrom setLoginInfo={setLoginInfo}/>}></Route>
            {/* 게시글 작성 페이지 */}
            <Route path='/content' element={<Content loginInfo={loginInfo}/>}/>
            <Route path='/detail/:boardNum' element={<Detail loginInfo={loginInfo}/>}/>
            {/* 수정 페이지 */}
            <Route path='/update/:boardNum' element={<Update/>}/>
            {/*  /:boardNum */}

          </Routes>
        </div>
      </div>
    </div>
  );
}

export default App;
