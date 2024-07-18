import axios from "axios";
import { useEffect, useState } from "react";
import { useNavigate, useParams } from "react-router-dom";


const DelStu=()=>{

  const params=useParams();
  const[stu, setStu]=useState([]);
  const navigate=useNavigate();


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


  function delStu(e){
    if(window.confirm('삭제하시겠습니까???')){
      axios
      .delete(`/delStu/${e.stuNum}`)
      .then((res)=>{
        alert('삭제되었습니다.');
        navigate('/');
        stu.forEach((student, i)=>{
          if(student.stuNum==stuNum){
            stu.splice(i, 1);
          }
        });
        setStu([...stu]);
      })
      .catch((error)=>{
        alert('삭제가 되지 안았습니다 (오류)')
        console.log(error);
      });
    }
  }

  return(
    <div>
        <table>
          <thead>
            <tr>
              <td>No</td>
              <td>학생명</td>
              <td>삭제</td>
            </tr>
          </thead>
            <tbody>
              {
                stu.map((student, i)=>{
                  return(
                    <tr key={i}>
                      <td>{i+1}</td>
                      <td>{student.stuName}</td>
                      <td><button type="button" onClick={(e)=>{delStu(student)}}>삭제</button></td>
                    </tr>
                    );
                  })
                }
            </tbody>
        </table>
    </div>
  );
}

export default DelStu;