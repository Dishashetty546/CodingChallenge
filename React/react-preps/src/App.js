// import logo from './logo.svg';
import { useState } from 'react';
import './App.css';
// // import './appStyle.css';
// import styles from './appStyle.module.css'
// import Greet from './components/greet'
// import { ClickHandler } from './components/ClickHandler'
// import Message from './components/Message';
// import { UserGreeting } from './components/UserGreeting';
// // import { Stylesheet } from './components/Stylesheet';
//  import {Inline} from './components/Inline';
// import {Forms } from './components/Forms';
// import  hostList  from './components/hostList'
// import { PostList } from "./components/PostList";

// import { PostForm } from "./components/PostForm";

import NAMES from './components/Studentdata.json';
function App() {
  const [query,setquery]= useState('')
  const changeHandler = (event)=>{
    setquery(event.target.value)
  }
  const filterNames = NAMES.filter((item)=>{
    return item.firstname.includes(query) || item.lastname.includes(query)
  })
  return (
    <>
      <div className="App">
        
          <input type='text' value={query} onChange={changeHandler}/>
          {filterNames.map((item) => (
            <p key={item.id}>{item.firstname} {item.lastname}</p>
          ))
        }
      </div>
    {/* <Greet name='disha'/>
    <Greet name="anisha">
      <button>Action</button>
    </Greet>
    <Greet name="hello">childrens</Greet> */}
    {/* <Message/> */}
   {/* <ClickHandler/> */}
   
    {/* <NameList/> */}
    {/* <Stylesheet/> */}
    {/* <Inline/> */}
    {/* <h1 className='error'>Error</h1>
    <h1 className={styles.success}></h1> */}
   {/* <Forms/> */}
   {/* <hostList/> */}
  {/* <PostList/> */}
  {/* <PostForm/> */}
    </>
  );
}

export default App;
                