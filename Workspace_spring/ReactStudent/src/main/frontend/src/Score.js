import axios from "axios";
import { useEffect, useState } from "react";
import { useNavigate } from "react-router-dom";

const Score=()=>{
  const navigate=useNavigate();

  const[stu, setStu]=useState([]);

  useEffect(() => {
    axios
    .get('/list')
    .then((res)=>{
      setStu(res.data);
    })
    .catch((error)=>{
      alert('오류발생');
      console.log(error);
    });
  }, []);


  function updateStu(){
    axios.put('/score')
    .then((res)=>{
      alert('내용을 수정하였습니다');
      navigate('/update');
    })
    .catch((error)=>{
      alert('오류');
    });
  }



  return(
    <div>
      <table>
        <thead>
          <tr>
            <td>No</td>
            <td>학생명</td>
            <td>성적입력</td>
          </tr>
            {
              stu.map((student, i)=>{
                return(
          <tr key={i}>
            <td>{student.stuNum}</td>
            <td>{student.stuName}</td>
            <td><button type="button" onClick={(e)=>{updateStu(student)}}>입력</button></td>
          </tr>
                );
              })
            }
        </thead>
      </table>
    </div>
  );
}


export default Score;