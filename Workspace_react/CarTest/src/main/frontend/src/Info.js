import axios from 'axios';
import React, { useEffect, useState } from 'react'

const Info = () => {
  // 조회된 자동차 정보목록 저장
const [carList, setCarList]=useState([]);

// 자동차 정보를 입력할 공간
const [carInfo, setCarInfo]=useState({
  band:'',
  carName:'',
  carPrice:''
});

function changeCar(e){
  setCarInfo({
    ...carInfo,
    [e.target.name]: e.target.value
  });
}




// 차량 목록 조회
useEffect(()=>{
  axios.get('/car/list')
  .then((res)=>{
    setCarList(res.data);
  })
  .catch((error)=>{
    console.log(error);
  });
},[]);

function carInfoUpdate(){
  axios.post('/car/info', carInfo)
  .then((res)=>{
    alert('등록 되었습니다')
    setCarInfo(res.data);
  })
  .catch((error)=>{
    alert('등록 오류');
    console.log(error);
  });
}


  return (
    <div >
      <div>-차량 등록</div> <br></br>
      <tr className='info'>
        <td>제조사</td>
        <td><input type='text' name='band' onChange={(e)=>{changeCar(e)}}/></td>
        <td>모델명</td>
        <td><input type='text' name='carName' onChange={(e)=>{changeCar(e)}}/></td>
        <td>차량 가격</td>
        <td><input type='text' name='carPrice' onChange={(e)=>{changeCar(e)}}/></td>
      </tr>
      <button className='btn' type='button' onClick={(e)=>{carInfoUpdate()}}>등록</button>
      <div className='list-list'>-차량 목록</div>
      <div className='list'>
        <tr className='list-tr'>
          <td>모델번호</td>
          <td>모델명</td>
          <td>제조사</td>
        </tr>
        {
          carList.map((car, i)=>{
            return(
              <tr key={i} className='list-tr'>
                <td>{car.carPk}</td>
                <td>{car.carName}</td>
                <td>{car.band}</td>
              </tr>
            );
          })
        }
      </div>
    </div>
  )
}

export default Info