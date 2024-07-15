import { Navigate, useParams } from 'react-router-dom';
import './Detail.css';
import Item from './Item';
import ItemList from './ItemList';
import { useEffect, useState } from 'react';




const Detail=({item_list})=>{
  // 1번 방식
  // const params=useParams();
  // console.log(params);
  // console.log(params.id);   {id: '1', name:'5'}

  
  const {id}= useParams();
  // console.log(`전달 된 상품 번호: ${id}`)
  // console.log(item_list);
  
  let finditem=null;
  
  item_list.forEach((item, i)=>{
    if(item.itemNum==id){
      finditem=item;
    }
  });
  const[num, setNum]=useState(0);
  const[num1, setNum1]=useState(0);
  // useEffect == 자바에서 데이터를 가져올때 사용하는것임 *************************
  // 해당 컴포넌트가 랜더링 되면 마지막에 실행된다: mount되면 실행
  // mount (컴포넌트를 새로 읽을때)+update(재 랜더링)될때 실행
  // useEffect 두번때 매개변수가 없으면 mount + update 될때 실행
  useEffect(()=>{
    console.log(1);  // 무조건 실행이됨
  });    

// mount(컴포넌트를 새로 읽을떄) 실행
//  두번째 매개변수로 빈 배열을 전달하면 mount 될때만 실행
  useEffect(()=>{
    console.log(2);
  }, []);  // 배열에 아무것도 없으니까 실행이 되지 않음

//  두번째매개번수에 배열형태로 state변수를 넣으면 
// 해당useEffect+ 배열에 넣은 state될때 실행
  useEffect(()=>{
    console.log(3);  // num 값이 변할때만 실행이됨
  }, [num]); 
  // 컴포넌트의 라이프싸이클 사이에 필요한 기능 추가
  // mount:최초에 컴포넌트가 생성
  // update:컴포넌트가 재랜더링 되는 상태
  // unmount:컴포넌트가 사라질때

  useEffect(()=>{
    console.log(4);  // num 또는 num1값이 실행되면 실행이 됨
  }, [num, num1]); 


  useEffect(()=>{
    console.log(5);  // 5는 무조건 실행이됨 1과 같은 조건이라서

    // return 안의 내용은 마운트 될때 실행 안함
    // update 될때 실행되는데 가장 먼저 실행함
    // numount 될때도 실행
    return ()=>{
      console.log(6);
    };
  }, [num]);

// 언마운트 될때만 7을 출력
  useEffect(()=>{
    return()=>{
      console.log(7);
    };
  }, []);


    return(
      <>
      <button type='button' onClick={(e)=>{
        // 클릭 하면 1씩 증가
        setNum(num+1);
      }}>num 값 변경!</button>
      <div>num={num}</div>


      <button type='button' onClick={(e)=>{
        // 클릭 하면 1씩 증가
        setNum1(num1+1);
      }}>num1 값 변경!</button>
      <div>num1={num1}</div>




      <div className="itemInfo">
        <img src={process.env.PUBLIC_URL+'/'+finditem.imgName}/>
        <div>
          <h4>{finditem.itemName}</h4>
          <p>{finditem.price}</p>
          <button type='button'>주문 하기</button>
        </div>
      </div>
      <div>{finditem.intro}</div>
    </>
  )
}


export default Detail;