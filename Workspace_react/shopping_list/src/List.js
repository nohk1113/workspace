function List(props){
  return(
    <div className='box'>
    {
      props.list.map((item, i) => {
        return(
          <div key={i} className="item-div">
            <span className="item">{item}</span>
            <button type='button' className="item" onClick={(e)=>{
              // const copyList=[...props.list];
              // copyList.splice(i, 1);
              // props.setList(copyList);


              props.list.splice(i, 1);
              props.setList([...props.list]); 

            }}>삭제</button>
          </div>
        );
      })
    }
  </div>
  );
}


export default List;