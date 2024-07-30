import axios from "axios";
import { useEffect, useState } from "react";
import { Navigate, useNavigate, useParams } from "react-router-dom";
import './StudentList.css';
import { getStuList } from "./api";

const StudentList=()=>{

  const [stuList, setStuList]=useState([]);
  const navigate=useNavigate();

useEffect(() => {
  getStuList()
  .then((res)=>{
    setStuList(res.data);
  })
  .catch((error)=>{
    alert('오류발생');
    console.log(error);
  });
}, []);

return(
  <table>
    <thead>
      <tr>
        <td>No</td>
        <td>학생명</td>
        <td>국어점수</td>
        <td>영어점수</td>
        <td>수학점수</td>
        <td>평균</td>
      </tr>
    </thead>
    <tbody>
    {
      stuList.length==0
      ?
      <tr>
        <td colSpan='6'>조회된 데이터가 없습니다</td>
      </tr>
      :
      stuList.map((stu, i)=>{
        const avg=(stu.korScore+stu.engScore+stu.mathScore)/3;
        return(
          <tr key={i}>
            <td>{i+1}</td>
            <td><span onClick={()=>{
              navigate(`/stuDetail/${stu.stuNum}`);
            }}>{stu.stuName}</span></td>
            <td>{stu.korScore}</td>
            <td>{stu.engScore}</td>
            <td>{stu.mathScore}</td>
            <td>{Math.round(avg*100)/100}</td>
          </tr>
        );
      })
    }
    </tbody>
  </table>
  );
}


export default StudentList;