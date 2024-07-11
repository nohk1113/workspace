import { Navigate, useNavigate } from 'react-router-dom';
import './boardList.css'

const List=({list})=>{
  const navigate = useNavigate();

  return (
    <>
    {                 /*   map 사용 시 중괄호 넣어야 한다 */}
            <table>
              <thead>
                <tr>
                  <td> 글번호</td>
                  <td>제목 </td>
                  <td> 작성자</td>
                  <td> 작성일</td>
                </tr>
                  </thead>
      {
        list.map((board, i)=>{
          return (
                <tr>
                  <td onClick={(e)=>{
                    navigate(`/detail`);
                  }}>{board.boardNum}</td>
                  <td>{board.title}</td>
                  <td>{board.writer}</td>
                  <td>{board.createDate}</td>
                </tr>
          );
        })
      }
      
      </table>
      <button type='button'>글 작성</button>
    </>
  );
}

export default List;


