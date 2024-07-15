import logo from './logo.svg';
import './App.css';
import data from './data';
import ItemList from './ItemList';
import { Link, Route, Routes } from 'react-router-dom';
import Detail from './Detail';


function App() {
  //  상품 목록 데이터
const item_list=data;


  return (
    <div className="App">
      <div className='header'>
        book shop
        <Link to='/list'>상품목록</Link>
        <Link to='/detail'>상품 상세</Link>
    </div>

      <div className='banner'>
        <img src={process.env.PUBLIC_URL+'/header.jpg'}/>
      </div>

      {/* <ItemList item_list={item_list}/> */}

      <Test name={'홍길동'} age={20}/>
      
      {/*  이동할수있는 페이지의 url들 */}
      <Routes>
        <Route path='/'  element={<div>메인페이지</div>}/>
        <Route path='/list' element={<div><ItemList item_list={item_list}/></div>}/>
        <Route path='/detail/:id' element={<Detail  item_list={item_list}/>}/>
        {/*  그외 모든 url 주소 = *    */}
        <Route path='*' element={<div>◇잘못된 페이지 입니다◇</div>}/>
      </Routes>

    </div>

  );
}

const Test=({name, age})=>{
  console.log(name);
  console.log(age);
  return(
    <div>거슬리는 글자</div>
  )
}


export default App;
