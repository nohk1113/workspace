import axios from 'axios';
import React, { useEffect, useState } from 'react'
import { useNavigate } from 'react-router-dom'

const BuyInfo = () => {
  const navigate=useNavigate();

  const [buy, setBuy]=useState({
    carPk:1,
    buyerName:'',
    buyerTel:'',
    color:'블랙'
  });


  // 자동차 셀렉트 옵션 변수
  const [carList, setCarList]=useState([]);

  useEffect(()=>{
    axios.get('/car/carList')
    .then((res)=>{
      setCarList(res.data);
    })
    .catch((error)=>{
      console.log(error)
    });
  }, []);

  function update(){
    axios.post('/car/buy', buy)
    .then((res)=>{
      navigate('/buyerList');
    })
    .catch((error)=>{
      alert('등록 오류');
    });
  }

  function changeBuy(e){
    setBuy({
      ...buy,
      [e.target.name]:e.target.value
    });
  }

  return (
    <div className='buy-top'>
      <table className='buy-table'>
        <thead>
          <tr>
            <td>구매자 명</td>
            <td colSpan={3} ><input type='text' name='buyerName' className='buy-input' onChange={(e) => {changeBuy(e)}}/></td>
          </tr>
          <tr className='buy-tr'>
            <td>색상</td>
            <td>
              <select name='color' onChange={(e)=>{changeBuy(e)}}>
                <option>블랙</option>
                <option>실버</option>
                <option>화이트</option>
                <option>레드</option>
              </select>
            </td>
            <td>모델</td>
            <td>
              <select name='carPk' onChange={(e)=>{changeBuy(e)}}>
                {
                  carList.map((car, i)=>{
                    return(
                      <option key={i} value={car.carPk}>
                        {car.carName}
                        </option>
                    );
                  })
                }
              </select>
            </td>
          </tr>
          <tr>
            <td>연락처</td>
            <td colSpan={3} ><input type='text' name='buyerTel' className='buy-input' onChange={(e)=>{changeBuy(e)}}></input></td>
          </tr>
        </thead>
      </table>
      <button type='button' className='btn' onClick={(e)=>{update()}}>등록</button>
    </div>
  )
}

export default BuyInfo