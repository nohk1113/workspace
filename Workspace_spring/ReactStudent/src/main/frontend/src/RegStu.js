import axios from "axios";
import { useState } from "react";
import { useNavigate } from "react-router-dom";

const RegStu=()=>{

  const navigate=useNavigate();
  
  // 쿼리 실행을 위해 전달해야 하는 데이터
  const [stuInfo, setStuInfo]=useState({
    stuName:'',
    stuAge:0,
    stuTell:'',
    stuAddr:''
  });


  function regStu(){
    // 이름 입력했는지 확인
    const nameInputTag= document.querySelector('input[name="stuName"]');
    if(nameInputTag.value==''){
      alert('이름 입력은 필수입니다');
      nameInputTag.focus();
      return;
    }

    axios
    .post('/regStu', stuInfo)
    .then((res)=>{
      alert('학생을 등록하였습니다');
      setStuInfo(res.data);
      navigate('/');
    }).catch((error)=>{
      alert('글 등록 오류');
      console.log(error);
    });
  }


  function changeStu(e){
    setStuInfo({
      ...stuInfo,
      [e.target.name]:e.target.value
    });
  }



  return(
    <>
      <table>
        <thead>
          <tr>
            <td>이름 <input type="text" name="stuName" onChange={(e)=>{changeStu(e);}}></input></td>
          </tr>
          <tr>
            <td>나이 <input type="text" name="stuAge" onChange={(e)=>{changeStu(e);}}></input></td>
          </tr>
          <tr>
            <td>연락처 <input type="text" name="stuTell" onChange={(e)=>{changeStu(e);}}></input></td>
          </tr>
          <tr>
            <td>주소 <input type="text" name="stuAddr" onChange={(e)=>{changeStu(e);}}></input></td>
          </tr>
        </thead>
      </table>
        <button type="button" onClick={(e)=>{regStu(e)}}>글 쓰기</button>
    </>

  );
}

export default RegStu;