//latest version of react is 18.2.0- automatic batching, new hooks(managing components, server side rendering enhancements)

//diff b/w  react js and react native --> 
//react js                                                          //react native
//is a js library for building for web interface                    //is a framework of hs for building natuve mobile apps
//react js used with web browser and runs in browser                //runs directly on the mobile devices and soes not require web browsersve
//both react js and react native are similar but components for native is for native ui rather then DOM elemts 
//both have strong community back 

//diff b/w react and vue js
//react                                                                     //vue
//is a library of js maintained by facebook                                //js framework by evan you
//uses virtual DOM to optimise updates and minimise dom manipulation       //uses reactive system that tracks changes to the data model and updates the veiw


//1. fetch data from an api given url and get request and display the data on the screen
//will be using axios - aa js library that allows users to make HTTP reuqest to external resourcdes, such as API
// import React,{useEffect} from 'react'
// import axios from 'axios';

// const fetchData=()=>{
//     return axios.get('')
//     .then((res)=>{
//         console.log(res);
//     })
//     .catch((err)=>{
//         console.log(err);
//     })
// }

// export default function App(){
//     useEffect(()=>{
//         fetchData();
//     },[])
//     return (
//     <div className='App'>
//         <h1>hello</h1>
//         <h1>start a new table</h1>

//     </div>
//     )
// }

//2. display a table can display these users
//every name has a row kind of , col has the city name
//Hooks: special functions in react, they simplify the code format maling components cleaner
//useState: amages state within a functional components
//counter app where you can store and update the ciunt
//const[count,setCount]=useStete(0);

//useeffect mages side effcts suh asfetching, subscription
//useEffect(()=>{
//    fetchData();
//},[])

//.map in js -> use to iterate over an arrayand apply a func to each eleme returning a new array with the result

// import React, { useState, useEffect } from 'react';

// const FetchData = () => {
//     // State to store fetched records
//     const [records, setRecords] = useState([]);

//     useEffect(() => {
//         fetch('https://jsonplaceholder.typicode.com/users')
//             .then(response => response.json())
//             .then(data => setRecords(data))
//             .catch(err => console.log(err));
//     }, []);

//     return (
//         <>
//             <ul>
//                 {records.map((list, index) => (
//                     <li key={index}>
//                         {list.id} | {list.name}
//                     </li>
//                 ))}
//             </ul>
//         </>
//     );
// };

// export default FetchData;

//3. creating a dynamic table with data fetching using api
//using useeffct, useState hooks and using .map
// import React, { useState, useEffect } from 'react';

// const FetchData = () => {
//     // State to store fetched records
//     const [records, setRecords] = useState([]);

//     useEffect(() => {
//         fetch('https://jsonplaceholder.typicode.com/users')
//             .then(response => response.json())
//             .then(data => setRecords(data))
//             .catch(err => console.log(err));
//     }, []);

//     return (
//         <>
//             <table border="1" style={{ width: "100%", textAlign: "left" }}>
//                 <thead>
//                     <tr>
//                         <th>ID</th>
//                         <th>Name</th>
//                         <th>Username</th>
//                         <th>Email</th>
//                         <th>Phone</th>
//                         <th>Website</th>
//                     </tr>
//                 </thead>
//                 <tbody>
//                     {records.map((user) => (
//                         <tr key={user.id}>
//                             <td>{user.id}</td>
//                             <td>{user.name}</td>
//                             <td>{user.username}</td>
//                             <td>{user.email}</td>
//                             <td>{user.phone}</td>
//                             <td>{user.website}</td>
//                         </tr>
//                     ))}
//                 </tbody>
//             </table>
//         </>
//     );
// };

// export default FetchData;

//4. creating a reusable components - button
//using concept called as props - children and parent concept
{/* <h1>hello</h1>
<Buttonss>hello components</Buttonss>
<Buttonss><h1>heheh</h1></Buttonss> */}

//5. simple counter app with react - using simple react , useState, onClick feature , 
// import React from 'react'
// import {useState} from 'react'

// const CounterApp = () => {
//     const [Count,setCount]= useState(0)
//   return (
//     <div className='container my-5'>
//         <div className='card center-text my-5'>
//             <div className='card-body'>
//                 <h1>Counter App</h1>
//                 <div className='my-5 center-text'> 
//                     <h2 className='my-5 center-text '>{Count}</h2>
//                     <button className='btn btn mx-3 ' onClick={()=>setCount(Count+1)}>Increment</button>
//                     <button className='btn btn mx-3 ' onClick={()=>setCount(Count-1)}>Decrement</button>
//                     <button className='btn btn mx-3 'onClick={()=>setCount(0)}>Reset</button>
//                 </div>

//             </div>
//         </div>
//     </div>
//   )
// }

// export default CounterApp

//6. conditional rendering
// import React from 'react'
// function Conditional(props){
//     if(props.isLoggedIn)
//     {
//         return <h2>Welcome {props.username}</h2>
//     }
//     else{
//         return <h2>please login to continue</h2>
//     }
// }

// export default Conditional

//7. React component lifecycle - DOM(DOCUMENT OBJECT MODEL), update, render, add values 
//3 phases
//Mounting - first time if we are loading something -- componentDidMount()
//updating- updating --- componentDidUpdate()
//unmounting - remove--- componentDidUnmount()

//what are constructor: are automatically called wen a new object or class or obejct is created

//props and state both used to pass and manage data within components
//props - to pass data from parent to child comp, they are read-only we cant modify receiving comp
//reusable comp
//immutable

//state- like changes within the components, react to user interface
//tyoically initialized using useState or this.state 
//used to manage internal data and reflect changes on UI
//mutable

// import React, { Component } from 'react'
// import useState from 'react'

// export default class ClassComponent extends Component {
//     //before loading some page,we want to initialize somethings
// constructor(){
//     super();
//     this.state={
//         Count:0
//     }
// }
// increment()
// {
//     this.setState({count:this.state.Count+1})
// }
// //first time rendering something ,then componentDidMount runs
// componentDidMount(){
//     console.log("componentDidMount : when component render first time")
// }
// //render is one of componet lifecycle method
// //browser doesnt understand jsx as a lang, so we need transpiler - EX: babel
//   render() {
//     return (
//       <div>
//         <h1>{this.state.Count}</h1> 
//         <button onClick={()=>{ this.increment()}}>click me</button>
//         <h1>disha</h1>
//       </div>
//     )
//   }
// }

//8. create a toggle component using context API 
//setup react application with npm install
//setup basic css part
