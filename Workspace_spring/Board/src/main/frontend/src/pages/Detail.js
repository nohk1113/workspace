import axios from 'axios';
import React, { useEffect, useState } from 'react'
import { useNavigate, useParams } from 'react-router-dom';
import * as replyApi from '../apis/replyApi';

const Detail = ({loginInfo}) => {

console.log('bpardDetail 컴포먼트 실행');

// 댓글 삭제 후 재 랜더링을 위한 변수
const[delelteState, setdelelteState]=useState({});

  const navigate=useNavigate();

  // // 정보 받아오기
  const params=useParams();

  const [mem, setMem]=useState({});

  // 댓글 목록
  const [replyList, setReplyList]=useState([]);

  //  댓글 등록시 가져가야하는 데이터
  const [replyData, setReplyData]=useState({
    replyContent:'',
    memId:loginInfo.memId,
    boardNum:params.boardNum
  });

  // 댓글 목록 
  useEffect(()=>{
    replyApi.getReplyList(params.boardNum)
    .then((res)=>{
      setReplyList(res.data);
    })
    .catch((error)=>{});
  },[]);

  useEffect(()=>{
    // replyApi.getReplyList(boardNum)
    axios.get(`/board/detail/${params.boardNum}`)
    .then((res)=>{
      console.log(res.data);
      setMem(res.data);
    })
    .catch((error)=>{
      alert('오류발생');
      console.log(error);
    });
  },[]);



// DB에서 데이터 조회 여러개 동시에 실행하기
useEffect(()=>{
  axios.all([ replyApi.getReplyList(params.boardNum),axios.get(`/board/detail/${params.boardNum}`) ])  // 배열처럼 사용 가능
  .then(axios.spread((res1, res2)=>{

    setReplyList(res1.data);
    setMem(res2.data);
    //  위 두개를(repliList, mem) 배열에 넣으면
    // 무한 재랜더링이 된다 그래서 절대로 들어올수가 없다
  }))
  .catch();
},[replyData, delelteState]);


function regReply(){
  axios.post('/reply/insert', replyData)
  .then((res)=>{
    alert('댓글 등록 성공');
    // document.querySelector('input[type="text"]').value='';
    // 추가된 댓글이 화면에 바로 보이게 코드 작성
    setReplyData({
      ...replyData, 
      replyContent:''
    });
  })
  .catch((error)=>{
    console.log(error);
  });
}

//  댓글 삭제
function delReply(replyNum){
  axios.delete(`/reply/delReply/${replyNum}`)
  .then((res)=>{
    alert('삭제 되었습니다.');
    setdelelteState({});
  })
  .catch((error)=>{
    console.log(error);
  });
}

// 게시글 삭제
function delBoard(boardNum){
  axios.delete(`/board/delBoard/${boardNum}`)
  .then((res)=>{
    alert('게시글 삭제 완료');
    navigate('/');
  })
  .catch((error)=>{
    alert('삭제 오류');
  });
}

  return (
    <div>
      <table>
        <tbody>
          <tr>
            <td>작성일</td>
            <td>{mem.createDate}</td>
            <td>작성자</td>
            <td>{mem.memId}</td>
          </tr>
          <tr>
            <td colSpan={2}>제목</td>
            <td colSpan={2}>{mem.title}</td>
          </tr>
          <tr>
            <td colSpan={2}>내용</td>
            <td colSpan={2}>{mem.content}</td>
          </tr>
        </tbody>
      </table>
      <button className='btn' onClick={(e)=>{navigate('/')}}>목록가기</button>
      {
        loginInfo.memId!=null || loginInfo.memRole=='admin'
        ?
        <>
          <button className='btn' onClick={(e)=>{navigate(`/update/${mem.boardNum}`)}}>수정</button>
          <button className='btn' onClick={(e)=>{delBoard(mem.boardNum)}}>삭제</button>  <br/>
          <input value={replyData.replyContent} type='text'onChange={(e) => {
            setReplyData({
              ...replyData,
              replyContent : e.target.value
            });
          }}/> 
          <button className='btn' onClick={(e)=>{regReply()}}>댓글 등록</button>
        </>
        :
        null
      }
      <div>
        {
          replyList.map((reply, i)=>{
            return(
              <div key={i}>
                <div>{reply.replyDate}</div>
                <div>{reply.memId}</div>
                <div>{reply.content}</div> 
                <button type='button' onClick={(e)=>{delReply(reply.replyNum)}}>삭제</button>
              </div>
            );
          })
        }
      </div>
    </div>
  )
}

export default Detail;