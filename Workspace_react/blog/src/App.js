import logo from './logo.svg';
import './App.css';
import { useState } from 'react';

// App() 앱 함수의 리턴문 안에 작성하는 코드가 화면에 나타남
// html처럼 보이는 것은 실은 jsx라는 문법이다.
//  그렇게 때문에 html과 조금 다른 부분이 있다.
function App() {
const title=['울산 맛집', 'react공부', '잠온다'];

// 좋아요 갯수
let cnt=0;
// 대괄호의 첫번째 : 변수
let[likeCnt, setLikeCnt]=useState(0);

function test(){
  alert(1);
}


  return (
    <div className="App">
      <div className="blog-nav">
        <h3>My Blog</h3>
      </div>
        <div className='list'>
          <h4>
            {title[0]}
            <span onClick={() => {
              cnt=cnt+1;
              }}>👍</span>
            {cnt} {likeCnt}
            </h4>
          <p>2024-07-04 작성</p>
        </div>
        <div className='list'>
          <h4>{title[1]}</h4>
          <p>2024-07-24 작성</p>
        </div>
        <div className='list'>
          <h4>{title[2]}</h4>
          <p>2024-07-24 작성</p>
        </div>
    </div>
  )
}

export default App;
