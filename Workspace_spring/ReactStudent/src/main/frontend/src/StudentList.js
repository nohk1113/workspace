import axios from "axios";
import { useEffect, useState } from "react";
import { useNavigate, useParams } from "react-router-dom";

const StudentList=()=>{

  const [stuList, setStuList]=useState([]);

useEffect(() => {
  axios
  .get('/list')
  .then((res)=>{
    setStuList(res.data);
  })
  .catch((error)=>{
    alert('오류발생');
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
      stuList.map((list, i)=>{
        return(
          <tr key={i}>
            <td>{list.stuNum}</td>
            <td>{list.stuName}</td>
            <td>{list.korScore}</td>
            <td>{list.engScore}</td>
            <td>{list.mathScore}</td>
            <td>{(list.korScore+list.engScore+list.mathScore)/3}</td>
          </tr>
        );
      })
    }
    </tbody>
  </table>
);

}


export default StudentList;