//React - open source js library- only used for building rich user interfaces
//diff b/w library and framework
//libraries-collection of functions that can be used to perform specific task
//framework- its a blueprint to building an application
//react is most popular ui labraries
//react is a component based architecture
//it is declarative - using dom 

//Components 
//function componenet 
//class component
//function componenet- jsx(javascrot+xml)
//export and import in React- export defalult of any componenet make us import it with any name in other files
// const Greet=()=>{
//     return <h1>greet</h1>
// }
// export default Greet        //import as --> import greeting from " ";

// export const greet=()=>
// {
//     return <h1>hello</h1>   //import with same name --> import { greet } from " ";
// }

//jsx similar to html
//React component returns jsx, jsx is syntax extension to js
//feature of react - props - property- component to be dynamic
//pass the name from app component to greet component, then render into browser

//props: 
// const greet=(props)=>{
//     return <h2>hello {props.name}</h2>
// }
// export default greet                         //o/p: hello disha

//props vs state
//props                                                           //state
//props get passed in component                                   //state is managed within the component
//function parameters                                             //varaibles declared in the func body
//props are immutable                                             //state can be changed
//props                                                           //usestate hook

//steps to initiate usestate
//1. import useState from react, it will not merge objects but replace the entire state with a new value
// import { useState } from 'react'
// const Message=(props)=>{
//     const [message,setMessage]=useState('welcome vistor')
//     return <><h2>{message}</h2>
//     <button onClick={()=> setMessage('thank you for subscribing')}>Subscribe</button>
    
//     </>
// }

//HOOKS
//used to hook into other react features
//ex: usestate, useReduccer, useEffect, useContext, useRef, useMemo, useCallback, useTransition, useDeferredValue

//even handling
//mouse handling, key press etc

//ClickHandler event
//ex: 
// export const ClickHandler=()=>{
//     //function inside anther function
//     const clickHandler=()=>{
//         console.log("button clicked");
//     }

//     return(
//         <div>
//             <button onClick={clickHandler}>click</button>
//         </div>
//     )
// }                                                                 //o/p: on clicking on button , console will have button clicked message


//Event handling

//child want to communicate with parents
//