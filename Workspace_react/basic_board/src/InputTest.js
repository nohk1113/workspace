import { useState } from "react";

const InputTest=()=>{
    //  인춧 태그에 입력한 내용을 저장하는 변수
    const [inputData, setInputData]=useState('');
    const [inputData2, setInputData2]=useState('');
  
  // 4개의 데이터를 받는 변수
  const[stu, setStu]=useState({
    stuName:'',
    age:0,
    score: 0,
    addr:''
  });
  
  function changeStu(e){
    setStu({
      ...stu,
      [e.target.name] :e.target.value
    });
  }
  return(
    <>
      <div>
      이름: <input type='text' onChange={(e)=>{
        //  이벤트가 발생하는 태그를 target이라고 한다.
        console.log(e.target.value);
        //  inptu_data에 정보을 저장하겠다(인풋에 입력된 정보)
        // inputData=e.target.value;
        setInputData(e.target.value);
      }}/>
  
      <div>나이:<input type='text' onChange={(e)=>{
        setInputData2(e.target.value);
      }}/></div>
    </div>
      <br></br>
    <div>
      학생명 : <input type='text' name='stuName' onChange={(e)=>{
        changeStu(e);
      }}/> <br/>
      나이 : <input type='text' name='age' onChange={(e)=>{
        changeStu(e);
      }}/> <br/>
      점수 : <input type='text'name='score' onChange={(e)=>{
        changeStu(e);
      }}/> <br/>
      주소 : <input type='text' name='addr' onChange={(e)=>{
        changeStu(e);
      }}/> <br/>
      <div>
        이름 : {stu.stuName}<br></br>
        나이 : {stu.age}<br></br>
        점수 : {stu.score}<br></br>
        주소 : {stu.addr}<br></br>
      </div>
    </div>
    </>
);

}

export default InputTest;