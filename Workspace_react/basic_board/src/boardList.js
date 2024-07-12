import { Navigate, useNavigate } from 'react-router-dom';
import './boardList.css'

const List=({list})=>{
  //  페이지 이동하는 방법
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
          <tbody>
      {
        list.map((board, i)=>{
          return (
            //  중복 오류때문에 key를 준다.
                <tr key={i}>
                  <td>{board.boardNum}</td>
                  <td>
                    <span onClick={(e)=>{
                    navigate(`/detail/${board.boardNum}`);
                    }}>{board.title}</span>
                  </td>
                  <td>{board.writer}</td>
                  <td>{board.createDate}</td>
                </tr>
          );
        })
      }
      </tbody>
      </table>
      <button type='button' onClick={(e)=>{navigate('wirte')}}>글 작성</button>
    </>
  );
}

export default List;


