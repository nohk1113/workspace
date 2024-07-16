import axios from "axios";

const AxiosTest=()=>{

  // spring 서버와 데이터 통신을 위해 react에서는 axios기술 사용
  // axios 설치 :  npm install axios

  // axios 는 데이터베이스의 작업종류에 따라 함수를 제공
  // get(url, data [, config]): 데이터 조회(SELECT)
  // post(url, data [, config]): 데이터 삽입 (INSERT)
  // put(url, data [, config]): 데이터 수정(UPDATE)
  //delete(url [, config]) : 데이터 삭제 (DELETE)
  // 사용 예제
  // axios.get().then(데이터 통신 성공 후 실행 내용).catch(데이터 통신 오류발생 시 실행);

  // 기본 형태  (모르면 복붙하시오)
  // axios
  // .get('/getList')
  // .then((res)=>{})
  // .catch((error)=>{});

  //쿼리에 빈값이 없는 데이터 조회
  function get1(){
    axios
    .get('/getList')
    .then((res)=>{
      console.log(res.data);
    })
    .catch((error)=>{
      console.log('오류 발생!!!')
      console.log(error);
    });
  }

  // 자바에서 메서드를 만들어줘야함
  function get2(){
    axios.get('/detail/1').then((res)=>{}).catch((error)=>{});
  }

  // post로 데이터 전달하기
  function postTest(){
    axios
    .post('/insertBoard', {name:'kim', age:20})
    .then((res)=>{})
    .catch((error)=>{});
  }

  // put 테스트
  function putTest(){
    axios
    .put('/updateBoard', {boardNum:1, boardTitle:'자바', boardWriter:'홍길동'})
    .then((res)=>{
      alert('내용을 수정했습니다');
      //  자바에서 들어온 데이터가 리엑트에 잘 들어왔는지 확인
      alert(res.data);
    })
    .catch((error)=>{});
  }


  return(
    <div className="btn-div"><h2> Axios 통신 예제</h2>
    <div><button type="button" onClick={()=>{get1()}}>get 으로 데이터 조회하기</button></div>
    <div><button type="button" onClick={()=>{get2()}}>get2 으로 데이터 조회하기</button></div>
    <div><button type="button" onClick={()=>{postTest()}}>post로 데이터 전달하기</button></div>
    <div><button type="button" onClick={()=>{putTest()}}>put로 데이터 전달하기</button></div>
    </div>
  );
}

export default AxiosTest;