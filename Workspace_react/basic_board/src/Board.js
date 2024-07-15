import { useNavigate, useParams } from "react-router-dom";

const Board=({list})=>{
  const navigate=useNavigate();
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
        <div>
          <button type='button' onClick={(e)=>{
            list.forEach((board,i) => {
              if(board.boardNum==boardNum){
                list.splice(i,1);
              }
            });
            // board.splice(, 1);
             // arr[1,2,3]에서 2만 지우고 싶을때 (1, 1) 첫번째 배열에서 1개만 지우기

            navigate('/');
          }}> 삭제  </button>
          </div>
      </div>
    </>

  )
  
}

export default Board;