import axios from "axios";
import { useEffect, useState } from "react";
import { useNavigate, useParams } from "react-router-dom";

const BoardList=()=>{
  const params= useParams();
  console.log(params);

  const navigate=useNavigate();

// 게시글 목록이 저장할 state 변수
  const [boardList, setBoardList]=useState([]);

  // 게시글 목록 조회
  useEffect(()=>{
    axios
    .get('/boardList')
    .then((res)=>{
      console.log(res.data);
      setBoardList(res.data);
    })
    .catch((error)=>{
      alert('오류발생- \n개발자 모드로 콘솔을 확인하세요');
      console.log(error);
    });
  }, []);


  return(
    <table>
      <thead>
        <tr>
          <td>글번호</td>
          <td>제목</td>
          <td>작성자</td>
          <td>작성일</td>
        </tr>
      </thead>
      <tbody>
        {
          boardList.map((board, i)=>{
            return(
              <tr key={i}>
                <td>{board.boardNum}</td>
                <td>
                  <span onClick={()=>{
                    navigate(`/detail/${board.boardNum}`);
                  }}>{board.boardTitle}</span>
                  </td>
                <td>{board.boardWriter}</td>
                <td>{board.createDate}</td>
              </tr>
            );
          })
        }
      </tbody>
      <button type="button" onClick={(e)=>{navigate('write')}}>글 쓰기</button>
    </table>
  );
}

export default BoardList;