import logo from './logo.svg';
import './App.css';
import data from './data';
import ItemList from './ItemList';
import axios from 'axios';

function App() {
// const item_list=data;
let item_list=[];

axios.get("/test1")
  .then((response)=>{
    console.log(response.data);
  });

  axios.get('/test2').then((res)=>{
    console.log(res.data);
  });

let arr=[];
  axios.get('/test3').then((res)=>{
    console.log(res.data);
    arr=res.data;
  });


  // axios.get('/test4').then((res)=>{
  //   console.log(res.data);
  // });

  axios.get('/test4').then((res)=>{
    // console.log(res.data);
    item_list=res.data;
  });



  return (
    <div className="App">
      <div className='header'>
        book shop
      </div>

      <div className='banner'>
        <img src={process.env.PUBLIC_URL+'/header.jpg'}/>
      </div>

      <ItemList item_list={item_list}/>

      <Test name={'홍길동'} age={20}/>
      
    </div>
  );
}

const Test=({name, age})=>{
  console.log(name);
  console.log(age);
  return(
    <div>asd</div>
  )
}


export default App;
