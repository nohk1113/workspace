
import axios from 'axios';
import React, { useEffect, useState } from 'react'
import * as boardApi from '../apis/boardApi';
import { useNavigate } from 'react-router-dom';

//          데이터 받는 방법
const BoardList = ({loginInfo}) => {
  const navigate=useNavigate();

  //조회된 게시글 목록을 저장할 변수
  const [boardList, setBoardList] = useState([]);

// 자바에서 가져온 페이지 정보를 담을 변수
const [pageInfo, setPageInfo]=useState({});

  // 검색 조건을 저장하는 변수
  const [searchData, setSearchData]=useState({
    searchType:'TITLE',
    searchValue:''
  });

  function changeSearchData(e){
    setSearchData({
      ...searchData,
      [e.target.name]:e.target.value
    });
  }

  // 게시글 작성
  function content (){
    navigate('/content');
  }

  //게시글 목록 조회
  useEffect(() => {
    boardApi.getboardList(1)
    .then((res) => {
      console.log('---------------mapData-----------------')
      console.log(res.data)
      setBoardList(res.data.boardList);
      setPageInfo(res.data.pageInfo);
    })
    .catch((error) => {
      alert('게시글 목록 조회 오류!');
      console.log(error);
    });
  }, []);


  // 검색 버튼 클릭시 실행 함수
  function searchBoard(pageNo){
    boardApi.getboardList(pageNo)
    .then((res)=>{
      setBoardList(res.data);
    })
    .catch((error)=>{
      console.log(error);
    });
  }

  // for문을 이용한 그림 그리기 예제
function test(){
  const arr=[];
if(pageInfo.prev){
  arr.push(<span className='page-span' onClick={((e)=>{getList(pageInfo.beginPage-1)})}>이전</span>);
}

  for(let i= pageInfo.beginPage; i< pageInfo.endPage+1 ;i++){
    arr.push(<span key={i} className='page-span' onClick={(e)=>{getList(i)}}>{i}</span>);
  }

if(pageInfo.next){
  arr.push(<span className='page-span' 
    onClick={(e)=>{getList(pageInfo.endPage+1)}}>다음</span>);
}

  return arr;
}

// 페이징 처리한 곳에서 숫자(페이지 번호)를 다시 게식글을 조회할수있음
function getList(pageNo){
  boardApi.getboardList(pageNo)
  .then((res)=>{
    setBoardList(res.data.boardList);
    setPageInfo(res.data.pageInfo);
  })
  .catch((error)=>{});
}


  return (
    <div className='board-list-container'>
      <div className='search-div'>
        <select name='searchType' onChange={(e)=>{changeSearchData(e)}}>
          <option value={'TITLE'}>제목</option>
          <option value={'MEM_ID'}>작성자</option>
        </select>
        <input type='text' onChange={(e)=>{changeSearchData(e)}} name='searchValue'/>
        <button className='btn' name='searchValue' onClick={(e)=>{searchBoard()}}>검색</button>
      </div>
      <div className='board-list-div'>
        <table>
          <colgroup>
            <col width='10%'/>
            <col width='*'/>
            <col width='20%'/>
            <col width='20%'/>
          </colgroup>
          <thead>
            <tr>
              <td>No</td>
              <td>글번호</td>
              <td>제 목</td>
              <td>작성자</td>
              <td>작성일</td>
            </tr>
          </thead>
          <tbody>
            {
              boardList.map((board, i) => {
                return (
                  <tr key={i}>
                    <td>{boardList.length - i}</td>
                    <td>{board.boardNum}</td>
                    <td><span onClick={(e)=>{navigate(`/detail/${board.boardNum}`)}}>{board.title}</span></td>
                    <td>{board.memId}</td>
                    <td>{board.createDate}</td>
                  </tr>
                );
              })
            }
          </tbody>
        </table>
        <div>
        </div>
      </div>
      {
        loginInfo.memId!=null 
        ?
        <button className='btn-div' type='button' onClick={(e)=>{content()}}>글쓰기</button>
        :
        null
      }
      <div>
        {
          test()
        }
      </div>
    </div>
  )
}

export default BoardList