import axios from "axios";
import { useEffect, useState } from "react";
import { useNavigate, useParams } from "react-router-dom";
import * as api from './api';

const UpdateStu=()=>{

  const {stuNum}=useParams();
 
  const [updateData, setUpdateDate] = useState({
    stuNum:stuNum,
    korScore:0,
    engScore:0,
    mathScore:0
  });

  const [stu,setStu]=useState({});  // 학생 한명이라서 중괄호

  // 점수가 입력될때 마다 실행되는 함수
  function changeScore(e){
    setUpdateDate({
      ...updateData,
      [e.target.name]: e.target.value
    });
  }

  // 학생의 정보를 조회해서 가져와야한다.
  useEffect(()=>{
    // api에서 들고온 데이터
    api.stuDetail(stuNum)
    // axios.get('/stuDetail/${stuNum}')
    .then((res)=>{
      setStu(res.data);
    })
    .catch((error)=>{});
  },[]);

  const navigate=useNavigate();

  function updateStu(){
    api.updateScore(updateData)
    // axios.put('/update')
    .then((res)=>{
      alert('점수를 수정하였습니다');
      navigate('/Score');
    })
    .catch((error)=>{
      alert('오류');
    });
  }

  return(
    <>
    <table>
      <thead>
        <tr>
          <td colSpan={2}>{stu.stuName}학생의 성적을 입력합니다</td>
        </tr>
        <tr>
          <td>국어</td>
          <td><input type="text" defaultValue={stu.korScore} name="korScore"
          onChange={(e)=>{changeScore(e)}}></input></td>
        </tr>
        <tr>
          <td>영어</td>
          <td><input type="text" defaultValue={stu.engScore} name="engScore"
          onChange={(e)=>{changeScore(e)}}></input></td>
        </tr>
        <tr>
          <td>수학</td>
          <td><input type="text" defaultValue={stu.mathScore} name="mathScore"
            onChange={(e)=>{changeScore(e)}}></input></td>
        </tr>
      </thead>
    </table>
      <button type="button" onClick={(e)=>{updateStu()}}>점수 등록</button>
    </>
  )

}


export default UpdateStu;