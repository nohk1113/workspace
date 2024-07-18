import axios from "axios";
import { useEffect, useState } from "react";
import { useNavigate, useParams } from "react-router-dom";


const StuDetail=()=>{

  const navigate=useNavigate();

  //  정보 받아오는 것
  const params=useParams();
  const {stuNum}=useParams();

  const [stu, setStu]=useState({});

  useEffect(()=>{
    axios
    .get(`/stuDetail/${params.stuNum}`)
    .then((res)=>{
      console.log(res.data);
      setStu(res.data);
    })
    .catch((error)=>{
      alert('오류가 발생하였습니다.')
      console.log(error);
    });
  },[]); 

  const avg=(stu.korScore+stu.engScore+stu.mathScore)/3;

return(
  <>
    <table>
      <thead>
        <tr>
          <td>이름</td>
          <td>{stu.stuName}</td>
          <td>나이</td>
          <td>{stu.stuAge}</td>
        </tr>
        <tr>
          <td>연락처</td>
          <td>{stu.stuTell}</td>
        <td>주소</td>
        <td>{stu.stuAddr}</td>
        </tr>
        <tr>
        <td>국어점수</td>
          <td>{stu.korScore}</td>
          <td>영어점수</td>
          <td>{stu.engScore}</td>
        </tr>
        <tr>
          <td>수학점수</td>
          <td>{stu.mathScore}</td>
          <td>평균</td>
          <td>{Math.round(avg*100)/100}</td>
        </tr>
      </thead>
    </table>
      <button type="button" onClick={(e)=>{navigate('/')}}>뒤로가기</button>
  </>
);

}


export default StuDetail;