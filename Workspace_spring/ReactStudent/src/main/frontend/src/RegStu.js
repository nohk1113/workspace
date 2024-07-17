import axios from "axios";
import { useState } from "react";
import { useNavigate } from "react-router-dom";

const RegStu=()=>{

  const navigate=useNavigate();
  const [inputdata, setinputdata]=useState({
    stuName:'',
    stuAge:0,
    stuTell:'',
    stuAddr:''
  });

  function regStu(){
    axios.post('/regStu', inputdata).then((res)=>{
      setinputdata(res.data);
      navigate('/');
    }).catch((error)=>{
      alert('글 등록 오류');
    });
  }


  function changeStu(e){
    setinputdata({
      ...inputdata,
      [e.target.name]:e.target.value
    });
  }



  return(
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
      <button type="button" onClick={(e)=>{regStu(e)}}>글 쓰기</button>
    </table>

  );
}

export default RegStu;