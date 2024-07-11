import logo from './logo.svg';
import './App.css';
import data from './data';
import List from './boardList';
import { Route, Routes } from 'react-router-dom';


function App() {
  const list=data;

  return (
    <div className="App">
      {/* <table>
        <tr>
          <td>글 번호</td>
          <td>글 제목</td>
          <td>작성자</td>
          <td>작성일</td>
        </tr>
        <List list={list}/>
      </table>
      <button type='button'>글 쓰기</button> */}

      <Routes>
        {/*  게시글 목록 페이지 */}
        <Route path='/'  element={<div><List list={list}/></div>}/>
        {/* 게시글 상세 페이지 */}
        <Route path='/detail'  element={<div>게시글 목록 페이지</div>}/>
      </Routes>
    </div>
  );
}

export default App;
