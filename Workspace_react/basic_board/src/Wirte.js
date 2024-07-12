import { useState } from "react";
import { useNavigate } from "react-router-dom"


const Wirte=(({list, setboardList})=>{
  const navigate=useNavigate();
  const [inputdata, setinputdata]=useState('');

  const [board1, setBoard]=useState({
    boardNum: 0,
    title: '',
    content:'',
    writer:'',
    createDate:''
  });

  function changeBoard(e){
    // const arr1=[1,2,3];
    // const arr2=[...arr1, 4];    아래의 코드와 같은 의미 이다
    setBoard({
      ...board1,    // ...board 뒤에 값은 추가하겠다는 정보임
      [e.target.name]:e.target.value
    });
  }
  
  return(
    <>
      <table>
        <tbody>
          <tr>
            <td>글번호</td>
            <td><input type="texte" name="boardNum" onChange={(e)=>{
              changeBoard(e);
            }}></input></td>
          </tr>
          <tr>
            <td>제목</td>
            <td><input type="texte"name="title" onChange={(e)=>{
              changeBoard(e);
            }}></input></td>
          </tr>
          <tr>
            <td>작성자</td>
            <td><input type="texte"name="writer" onChange={(e)=>{
              changeBoard(e);
            }}></input></td>
          </tr>
          <tr>
            <td>작성일</td>
            <td><input type="date"name="createDate" onChange={(e)=>{
              changeBoard(e);
            }}></input></td>
          </tr>
          <tr>
            <td>내용</td>
            <td><input type="texte"name="content" onChange={(e)=>{
              changeBoard(e);
            }}></input></td>
          </tr>
        </tbody>
      </table>
      <button type="button" onClick={(e)=>{
        setboardList([...list, board1]);
        navigate('/');
        console.log(board1);
      }}>글 등록</button>

      {/* 입력한 값이 잘 저장되었는지 확인하는 코드 */}
      {/* <div>
        글번호 : {board.boardNum}<br></br>
        제목 : {board.title}<br></br>
        작성자 : {board.writer}<br></br>
        작성일 : {board.createDate}<br></br>
        내용 : {board.content}<br></br>
      </div>  */}
    </>
  )
});

export default Wirte;