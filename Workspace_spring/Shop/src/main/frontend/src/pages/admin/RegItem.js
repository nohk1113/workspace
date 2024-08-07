
import axios from 'axios';
import React, { useEffect, useState } from 'react'
import Modal from '../../common/Modal';
import { useNavigate } from 'react-router-dom';

const RegItem = () => {
  const navigate=useNavigate();
// 목록 조최 변수
const [categoryList, setCategoryList]=useState([]);

// 아이템 등록 변수
const [itemInsert, setItemInsert]=useState({
  cateCode:0,
  itemName:'',
  itemPrice:0,
  itemIntro:''
});

  // 카테고리 목록 조회
  useEffect(()=>{
    axios.get('/api_admin/getCateList')
    .then((res)=>{
      setCategoryList(res.data);
    })
    .catch((error)=>{console.log(error);});
  }, []);

function itemUpdate(){
  axios.post('/api_admin/insertItem', itemInsert)
  .then((res)=>{
    alert('등록 되었습니다');
    setIsShow(true);
  })
  .catch((error)=>{console.log(error); alert('오류');});
}

function changeItem(e){
  setItemInsert({
    ...itemInsert,
    [e.target.name]:e.target.value
  });
}

//모달창 랜더링 여부
const [isShow, setIsShow] = useState(false);

// 모달창 안의 내용
function modalContent(){
  <div>(✿´꒳`)ﾉ° 등록 성공</div>
}

// 모달창 닫으면 가는 곳
function modalClose(){
  navigate('/');
}


  return (
    <div className='reg-item-div'>
      <div className='input-element'>
        <div>상품 카테고리</div>
        <div>
          <select name='cateCode' className='form-control' onChange={(e)=>{changeItem(e)}}>
          {
            categoryList.map((category, i)=>{
              return(
                <option key={i} value={category.cateCode}>{category.cateName}</option>
              );
            })
          }
          </select>
        </div>
      </div>
      <div className='input-element'>
        <div>상품명</div>
        <div><input type='text' className='form-control' name='itemName' onChange={(e)=>{changeItem(e)}} /></div>
      </div>
      <div className='input-element'>
        <div>상품 가격</div>
        <div><input type='text' className='form-control' name='itemPrice' onChange={(e)=>{changeItem(e)}} /></div>
      </div>
      <div className='input-element'>
        <div>상품 소개</div>
        <div>
          <textarea className='form-control' rows={7} name='itemIntro' onChange={(e)=>{changeItem(e)}} ></textarea>
        </div>
      </div>
      <div className='btn-div'>
        <button type='button' className='btn btn-primary' onClick={(e)=>{itemUpdate()}}>상품등록</button>
      </div>
      {/* 상품 등록 시 열리는 모달 */}
      {
        isShow
        ?
        <Modal content={modalContent}
        setIsShow={setIsShow}
        clickCloseBtn={modalClose}/>
        :
        null
      }
    </div>
  )
}

export default RegItem