import axios from "axios";
import { useEffect, useState } from "react";
import { useNavigate } from "react-router-dom";
  // spring 서버와 데이터 통신을 위해 react에서는 axios기술 사용
  // axios 설치 :  npm install axios

  // axios 는 데이터베이스의 작업종류에 따라 함수를 제공
  // get(): 데이터 조회(SELECT)
  // post(): 데이터 삽입 (INSERT)
  // put(): 데이터 수정(UPDATE)
  //delete : 데이터 삭제 (DELETE)
  // 사용 예제
  // axios.get().then(데이터 통신 성공 후 실행 내용).catch(데이터 통신 오류발생 시 실행);


const Write=(()=>{
  const navigate=useNavigate();
  const [inputdata, setinputdata]=useState([]);

  // 서버에서 데이터를 받기
  function regBoard(){
    axios
    .post('/write', board)  // 데이터를 가져올 주소  get:데이터 조회(SELECT)  post:데이터 삽입 (INSERT)
    .then((res)=>{
      setinputdata(res.data);
      navigate('/');
    })
    .catch((error)=>{
      console.log('※ axios 통신 중 오류 발생 ※');
      console.log(error);
    });
  }

  const [board, setBoard]=useState({
    boardNum:0,
    boardTitle:'',
    boardWriter:'',
    createDate:''
  });

  function changeBoard(e){
    setBoard({
      ...board,
      [e.target.name]:e.target.value
    });
  }



  return(

    <table>
      <tbody>
        <tr>
          <td>제목</td>
          <td><input type="texte" name="boardTitle" onChange={(e)=>{changeBoard(e);}}></input></td>
        </tr>
        <tr>
          <td>작성자</td>
          <td><input type="texte" name="boardWriter" onChange={(e)=>{changeBoard(e);}}></input></td>
        </tr>
        <tr>
          <td>내용</td>
          <td><input type="texte" name="boardContent" onChange={(e)=>{changeBoard(e);}}></input></td>
        </tr>
      </tbody>
      <button type="button" onClick={(e)=>{regBoard(e)}}>글 등록</button>
    </table>
  )
});

export default Write;