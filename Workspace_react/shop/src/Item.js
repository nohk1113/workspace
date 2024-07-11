import { useNavigate } from "react-router-dom";

const Item=({item})=>{
  // navigate 는 함수임!!!  함수는 사용할때 무조건 소괄호 넣어야함
  //  navigate('이동할 url');
  //  navigate('-1') 한페이지 뒤로
  //  navigate('-2') 두페이지 뒤로
  const navigate=useNavigate();


  return(
    <div className='item'>
      <img onClick={(e)=>{
        navigate(`/detail/${item.itemNum}`);
      }} src={process.env.PUBLIC_URL+'/'+item.imgName} />
      <div>{item.itemName}</div>
      <div>{item.price}</div>
    </div>
  );
}


export default Item;