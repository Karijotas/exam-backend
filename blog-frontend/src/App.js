import { HashRouter, Route, Routes } from 'react-router-dom';
import './App.css';
import { Menu } from './Components/Menu';
import { CreateBlogPostPage } from './Pages/CreateBlogPost';
import { FrontPage } from './Pages/FrontPage';
import { ViewBlogPost } from './Pages/ViewBlogPost';

function App() {
  return (
    <div className="App">
      <HashRouter>
     <Menu />

        <Routes>
          <Route path='/blogger' element={<FrontPage/>} />
          <Route path='/blogger/create' element={<CreateBlogPostPage/>}/>
          <Route path='/blogger/view/:id' element={<ViewBlogPost/>}></Route>
        </Routes>
      </HashRouter> 
    </div>
  );
}

export default App;
