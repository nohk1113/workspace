const Item=({item})=>{
  return(
    <div className='item'>
      <img src={process.env.PUBLIC_URL+'/'+item.imgName} />
      <div>{item.itemName}</div>
      <div>{item.price}</div>
    </div>
  );
}

export default Item;