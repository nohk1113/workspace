import React, {useEffect, useState} from 'react'
import axios from 'axios';


const BuyerList = () => {
// 조회할 구매자 목록 데이터 저장 변수
const [buyList, setBuyList]=useState([]);

useEffect(()=>{
  axios.get('/car/buyer')
  .then((res)=>{
    setBuyList(res.data);
  })
  .catch((error)=>{console.log(error)});
}, []);

console.log(buyList);
  return (
    <div>
      <table className='last-table'>
        <thead>
          <tr>
            <td>No</td>
            <td colSpan={4}>구매자 정보</td>
            <td colSpan={2}>차량정보</td>
          </tr>
          <tr>
            <td>No</td>
            <td>구매자명</td>
            <td>연락처</td>
            <td>구매 일</td>
            <td>색상</td>
            <td>모델명</td>
            <td>금액</td>
          </tr>
        </thead>
          <tbody>
            {
              buyList.map((car, i)=>{
                return(
                  <tr key={i}>
                    <td>{i+1}</td>
                    <td>{car.buyerName}</td>
                    <td>{car.buyerTel}</td>
                    <td>{car.buyDate}</td>
                    <td>{car.color}</td>
                    <td>{car.carInfoVO[0].carName}</td>
                    <td>{car.carInfoVO[0].carPrice}</td>
                  </tr>
                );
              })
            }
          </tbody>
      </table>
    </div>
  )
}

export default BuyerList