import logo from './logo.svg';
import './App.css';
import { Route } from 'react-router-dom';
import BoardList from './BoardList';

function App() {
  return (
    <div className="App">
      <Route>
        {/* 게시글 목록 페이지 */}
        <Route path='/' element={<BoardList/>}></Route>
      </Route>
    </div>
  );
}

export default App;
