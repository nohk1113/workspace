import axios from "axios";
import { useState } from "react";
import { useNavigate } from "react-router-dom";


const Write=(()=>{
  const navigate=useNavigate();
  const [inputdata, setinputdata]=useState('');

  axios.get().then(),catch();

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
          <td><input type="texte" name="content" onChange={(e)=>{changeBoard(e);}}></input></td>
        </tr>
      </tbody>
      <button type="button" onClick={(e)=>{
        
        navigate('/');}}>글 등록</button>
    </table>

  )


});

export default Write;