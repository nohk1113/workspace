import logo from './logo.svg';
import './App.css';
import { Route, Router, Routes, useNavigate } from 'react-router-dom';
import Info from './Info';
import BuyInfo from './BuyInfo';
import BuyerList from './BuyerList';

function App() {
  const navigate=useNavigate();



  return (
    <div className="App">
      <div className='head'>
        <tr>
          <td  className='div'> <span onClick={(e)=>{navigate('/')}}>홈</span></td>
          <td className='div' ><span onClick={(e)=>{navigate('/info')}}>차량관리</span></td>
          <td className='div'><span onClick={(e)=>{navigate('/buyInfo')}}>판매자 정보 등록</span></td>
          <td className='div'><span onClick={(e)=>{navigate('/buyerList')}}>판매자 목록</span></td>
        </tr>
      </div>
      <div>
        <Routes>
          <Route path='/info' element={<Info/>}/>
          <Route path='/buyInfo' element={<BuyInfo/>}/>
          <Route path='/buyerList' element={<BuyerList/>}/>
        </Routes>
      </div>
    </div>
  );
}

export default App;
