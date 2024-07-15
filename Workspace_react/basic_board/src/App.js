import logo from './logo.svg';
import './App.css';
import data from './data';
import List from './boardList';
import { Route, Routes } from 'react-router-dom';
import Board from './Board';
import Wirte from './Wirte';
import { useState } from 'react';
import InputTest from './InputTest';



function App() {
  // let list=data;
  const [boardList, setboardList]=useState(data);
  


  return (
    <div className="App">
      {/* <table>
        <tr>
          <td>글 번호</td>y
          <td>글 제목</td>
          <td>작성자</td>
          <td>작성일</td>
        </tr>
        <List list={list}/>
      </table>
      <button type='button'>글 쓰기</button> */}

      <Routes>
        {/*  게시글 목록 페이지 */}
                                      {/* App.js에서의 변수 이름  const [boardList*/}
        <Route path='/'  element={<List list={boardList}/>}/>
        {/* 게시글 상세 페이지 */}
        {/*  boardNum 이라는 정보를 가져 가겠다는 의미 */}
        <Route path='/detail/:boardNum'  element={ <Board list={boardList}/> }/>
        <Route path='/wirte'
        element={<Wirte list={boardList} setboardList={setboardList}/>}/>
        {/* input 값 입력받기 연습 */}
        <Route path='/test' element={<Wirte/>}></Route>
        
      </Routes>
    </div>
  );
}

export default App;
