import { useParams } from "react-router-dom";

const Board=({list})=>{
  console.log(list);

  const params =  useParams();
  const boardNum = params.boardNum;

  console.log(boardNum);
  

  let board=null;
  for(const e of list){
    if(e.boardNum==boardNum){
      //  board= 객체 (하나의 글정보)
      board=e;
    }
  }


  return(
    <>
      <div>
        <div>글번호 : {board.boardNum} </div>
        <div>제목 : {board.title} </div>
        <div>내영 : {board.content} </div>
        <div>작성자 : {board.witer} </div>
        <div>작성일 : {board.createDate} </div>
      </div>
    </>

  )
  
}

export default Board;