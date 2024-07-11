import { Navigate, useParams } from 'react-router-dom';
import './Detail.css';
import Item from './Item';
import ItemList from './ItemList';




const Detail=(item_list)=>{
  // 1번 방식
  // const params=useParams();
  // console.log(params);
  // console.log(params.id);   {id: '1', name:'5'}

  
  const {id}= useParams();
  console.log(`전달 된 상품 번호: ${id}`)
  console.log(item_list);
  
  let finditem=null;
  
  item_list.forEach((item, i)=>{
    if(item.itemNum==id){
      finditem=item;

    }
  });

    return(
      <>
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