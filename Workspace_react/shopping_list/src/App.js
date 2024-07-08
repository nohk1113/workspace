import logo from './logo.svg';
import './App.css';
import { useState } from 'react';
import List from './List';
import Add from './Add';

function App() {
  // 장보기 목록
  const [list, setList]=useState(['계란한판', '생수', '불고기용 돼지고기']);
  return (
    <div className="App">
      <h3>Shopping List</h3>
      장보기 목록
      <List list={list}setList={setList}/>
      <Add list={list} setList={setList}/>
    </div>
  );
}

function add(){
const add1= document.querySelector('.first td>input');

}


export default App;
