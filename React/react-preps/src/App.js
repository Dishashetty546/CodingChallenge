import logo from './logo.svg';
import './App.css';
import Greet from './components/greet'
import { ClickHandler } from './components/ClickHandler'
import Message from './components/Message';
import { ParentComponent } from './components/ParentComponent';


function App() {
  return (
    <>
    {/* <Greet name='disha'/>
    <Greet name="anisha">
      <button>Action</button>
    </Greet>
    <Greet name="hello">childrens</Greet> */}
    {/* <Message/> */}
   {/* <ClickHandler/> */}
    <ParentComponent/>
    
  
    </>
  );
}

export default App;
                