//Async js
//js is synchronous - we have 2 func, then the code executes top down with only one line excecuting at any given time
//Blocking in js -  how much time prev func might take, the next func will not takes place until former is completed
//single threaded - thread is a process, so js can only do one task at a time

//ASync js - with the help of web browsers and api function we achecive asynchronous javascript


//------------TIMOUTS AND INTERVALS--------------------------------------------------
//setTimeout()
//executes particular block of a code, after certain time is elapsed
//syntax: setTimeout(function, duration,param1,param2,..)
//first param is to run the func defined elsewhere
//second param is to represent the duration in milisec to wait before executing
// function great(){
//      console.log("hello");
// }
// setTimeout(great,1000);   //print after 10s

// function greet(name)
// {
//     console.log(`hello,${name}`);
// }
// setTimeout(greet,2000,'disha');

//setTimeput()--clear s timeout method we use ---clearTimeout()
// function greet()
// {
//     console.log("hello");
// }
//  const TimeoutId=setTimeout(greet(),1000)
// clearTimeout(TimeoutId)

//setInterval() will repeate;y runs the same code over and over again
//setInterval(function,duration,param1,param2,..)
// function greet()
// {
//     console.log("hello")
// }
// setInterval(greet,1000);   //o/p: hello ....

//clearInterval()

//**IMPORTANT POINTS
//*timers and intervals re not features of js, implemented by web browsers\
//*it is possible to achecice the same effect as setInterval wih a recursive setTimeout()
//EX:

//setTimeout( function run()
// {
//     console.log("hello")     //duration is gurabteed
//     setTimeout(run,100)      //time taken interval will remain the same 
// }, 100)

// setInterval(function run()   //duration interval inlcudes time taken to execute the code you want to run
// {
//     console.log("hello")
// },100)


//---------CALLBACKS IN JS-----------------
//Just like in object, func can be passed as an argument to the func in js
//any func passsed as an arguement to another func are called as callback func in js
//func which accepts an argument or returns a func is called as higher order func

// function greet(name)
// {
//     console.log(`hello,${name}`)
// }
// function higherorderfunction(callback)
// {
//     const name="disha"
//     callback(name)
// }
// higherorderfunction(greet)

 //2 types of callback func
 //**synchronous func: callback which is executed immediately is called as synchronous callback
 //**asynchronous func:used to delay the execution of a func until aparticula time or event has occured 
 //EX:
 //setTimeout
//  function greet(name)
//  {
//     console.log(`hello,${name}`)   //greet is a callback fun
//  }
//  setTimeout(greet,100,'disha')     //wait for 2 sec, and callback greet

 //event handlers
 //on click event takes place, a callback func called

 //**IMP POINTS
 //callbacks are the func passed as an argument to another func
 //they can be synchronous if they execute immediately, they can be asynchronous if it is executedbafter some time has passed
 //as more and more requests has been made based on the data pbtained prev, developers started encounetr probelm known as callback hell
 //an alternative and recommended approach is use of promise


 //------------PROMISE--------------------------------------------
 //someone of points
 // promise - to do certain things after certain instance
 //Asynchronous operation in js - during the certain instance instead of being idle , start some stuffs done
 //promise return value - can/cant message reading
 //promise is said to be fulfilled - can
 //promise is been rejected - cant
 //callback
 //failure callback

 //defination: promise is proxy for a value not necessarily knows when the promise is created, it allowas you to associate hamdlers with a asynchronous actions eventual success or failure reasons

 //simply an object in js
 //3 states -- pending - initial state, neither fulfilled nor rejected
//             fullfilled - operation completed successfully
//             rejected - operation failed

//used to deal will asynchronous code more simpler compared to callback, avid the callback hell

//constructors: special func that creates and initialize an obj of a class, it is called when an obj is created using new keyword, purpose is to create a new obj and set values for an existing obj
//using new keyword
//Async operation : allowas ur code to run in background without blocking the execution of other codes

//steps to create an promise
//* create a constructor using new keyword
//* using curly braces with 2 instances , resolve nd reject
//call reject() or resolve()
//* reject() or resolve() func r called after async operation
//*passing a string on to function
//*success and failure callbacks
//*promise status: promise fullfileesd , then() executed
// promise rejected , catch() executed

// const promise= new Promise((resolve,reject)=>
// {
// setTimeout(()=>{
// reject() 
// }, 1000)    

// })

//execute callback function based on the status changes
// const promise = new Promise((resolve,reject)=>{
//     setTimeout(()=>{
//         resolve("bringing food")
//     },1000)
// })
// const promises = new Promise((resolve,reject)=>{
//     setTimeout(()=>{
//         reject("food truch isnt there")
//     },1000)
// })

// const onfufillment = (result)=>{
//     console.log(result)
//     console.log('set up table for food')
// }
// const onrejection = (result)=>{
//     console.log(result)
//     console.log('start cooking at home')
// }
// promise.then(onfufillment).catch(onrejection)
// promises.then(onfufillment).catch(onrejection)

//**IMP POINTS
//wht are promise
//explain with real world senerio
//about steps to create and execute promise in js
//reject nd resolve
//callback
//constructor used


//----------------------PROMISE part II-----------------------------

//then() func
//can handle both success and reject callbacks
// const promise = new Promise((resolve,reject)=>{
//     resolve()
    
// })
// const promises = new Promise((resolve,reject)=>{
//     reject()
    
// })
// const onfulfillment = (result)=>{
//     console.log("fulfilled")
// }
// const onrejection=(result)=>{
//     console.log("rejected")
// }
// promise.then(onfulfillment, onrejection)
// promises.then(onfulfillment, onrejection)

//chaining promises
///ex: promise.then(fulfilled).catch(rejected)

//Static methods in JS
//1. promise.all() -> used when query multiple apis and perform actions but only after all the APIs have finished loading 
// const promise= new Promise.resolve(3);
// const promise1= 42
// const promise2= new Promise((resolve,reject)=>{
//     setTimeout(resolve,100,'foo')
// });
// promise.all([promise,promise1,promise2]).then((values) =>{
//     console.log(values)
// })

//promise,all() takes iterable array of promise as input and returns a single promose that resolve the array of the results
//returned promise will resolve all the input promises have resolved
//it rejects if inout promise reject or non promise throw an error and will reject with this first rejection message

//2. promise.allSettled()
//waits for all input promises to complete regardless of whether or not one of them is rejected
//EX:
// const promise1= Promise.resolve(3);
// const promise2= 42;
// const promise3= new Promise((resolve,reject)=>{
//     setTimeout(resolve,100,'foo')
// });
// Promise.allSettled([promise1,promise2,promise3]).then((value)=>{
// console.log(value)
// })

//3. promise.race()
//it returns a promise that fulfills or rejects as soon as one of the input promise fulfill or rejects
//EX:
// const promise= new Promise((resolve,reject)=>{
//     setTimeout(resolve,100,'hehe');
// })
// const promise1= new Promise((resolve,reject)=>{
//     setTimeout(resolve,50,'hello')
// })
// Promise.race([promise,promise1]).then((value)=>{
// console.log(value)
// })
//o/p: hello


//---------------------ASYNC AWAIT-----------------
//how chaining promise is solution for callback hell
//there is a way to impore it more further
//async func always returns a promise

//async keyword is used to declare async func
// async function greet(){
//     return Promise.resolve('hello')
// }
// greet().then((value)=> console.log(value));

//await keyword
//used infront of async function
//to wait until promise settles and returns its results
//await words inside async func

// async function greet(){    //asyn func initialization
//     let promise = new Promise((resolve,reject)=>{   //create a promise
//         setTimeout(()=>resolve('hello'),2000)
//     })
//     let result= await promise;     //await , wait unril promise exicutes
//     console.log(result);               
// }greet()                           //function call

//chaining promises vs async awiat
//even more readable comparitively
//error handlling is also simplified 

// sequencial vs concurrent vs parelle execution
//**sequencial execution
//sequencial process takes place - delay in time
// function resolvehello()
// {
//     return new Promise(resolve=>{
//         setTimeout(function(){
//             resolve('hello')
//         },1000)
//     })
// }
// function resolveworld()
// {
//     return new Promise(resolve=>{
// setTimeout(function(){
//     resolve('hello')
// },2000)
//     })
// }                                                                //o/p: logs hello 
//                                                                  //     after 2 s world     => total - 3 s
// async function sequencialstart()
// {
//     const hello = await resolvehello()
//     console.log(hello)

//     const world= await resolveworld()
//     console.log(world)
// }
// sequencialstart()

//**concurrent state
//first it will start execution of resolvehello in 1 sec, then during the log of 1st , it executes 2nd and print together
// function resolvehello()
// {
//     return new Promise(resolve=>{
//         setTimeout(function(){
//             resolve('hello')
//         },1000)
//     })
// }
// function resolveworld()
// {
//     return new Promise(resolve=>{
// setTimeout(function(){
//     resolve('hello')
// },2000)
//     })
// }                                                                //o/p: logs hello - after 1 sec
//                                                                  //     logs hello  - no wait of additionally , total- 2 s
// async function concurrent()
// {

//     const hello = await resolvehello()
//     const world= await resolveworld()
//     console.log(hello)
//     console.log(world)
// }
// concurrent()

//**parellel state
// function resolvehello()
//  {
//      return new Promise(resolve=>{
//          setTimeout(function(){
//              resolve('hello')
//          },1000)
//      })
//  }
//  function resolveworld()
//  {
//      return new Promise(resolve=>{
//  setTimeout(function(){
//     resolve('hello')
//  },2000)
//      })
//  }                                                                //o/p: hello - 1s
//                                                                   //     hello - 2s
//  async function parellel()
//  {
// Promise.all([
//     (async()=>console.log(await resolvehello()) )(),
//     (async()=>console.log(await resolveworld()) )(),

// ])}
//  parellel()

//**IMP points
//asyn nd await defination - enables asynchronoud , promise based behaviour in  cleaner way , avaoiding need of explicitly configure promise chains
//async await keyword definations
//async- returns a promise
//await - pauses the execution uril promise resolves or rejects
//aync nd await introduced in ES2017


//----------------------EVENT LOOP----------------------------------------------------------------------------------------
//JS euntime environment
//parts are:
// 1. JS engine - consists  of 2 memory space - 1. memeory heap   - whenver we declare a variable , it is stored here
//                                              2. call stack - whenever exixute a program, functions are stored in call stack, when function returned,poped off the call stack
//V8 engine - JS engine in browser
// 2. Web API's -ex: setTimeout, promise, DOM etc
//they are not implemented by js, they are by web browsers, they are simply have access to js, they are features of web browsers
// 3. callback queue/task queue - 
// 4. event loop - it checks if the call stack is empty, if it is push an item from queue to stack

//synchronous code snippids
//js run time environment -- have call stack , web apis, event loop , callback queue/task queue, console
//ex:
// console.log("first")
// setTimeout(()=>{
//     console.log("second")
// },1000)
// console.log("third")
//operations here:
//first on call stacl , global() will be defalut
//                      push log('first')
//pop from stack , printed on console
//setTimeout is pushed on to call stack , for execution, as setTimeout is not js feature, it is browser feature
//poped out of stack into web API's
//then log("third") is pushed into stack, poped out to console
//web api's cant directly push elements into stack
//it push element into callback queue
//event loop will check if stack is empty, if so it will push into stack , and print on console by popping out

//async  promise code
// console.log("first")
// const promise = fetch('www.google.com')
// promise.then(value=>{
//     console.log('promise value is ', value)
// })
// console.log("second")
//for promies code to execute we need --> memory heap , call stack, web api, event loop, micro task queue, callback queue

 //steps:
 //js starts exicution in global scope
 //1st line,log(first) pushed to stack
 //poped off
 // 2nd like fetch func pushed to stack, its not js feature, pushed to web api fetch(url)
 //fetch object, leaves behind a promise object in js memory
 //some operation happing for some secs on js memeory and fetch object
 //during this stack is empty, line 3 promise.then() is push back to stack
 //log(second poped)
 // now fetch api have data value , it fills it on the memory
 //callback and value is pushed to micro task queue
 //now queue checks for stack to be empty, it is push on to stack nd popped out

 //async setTimeout and promise code
//  setTimeout(()=>{
//     console.log("first")
//  },0)
//  const promise = fetch('www/udemy.com/vishwas')
//  promise.then(value=>{
//     console.log('promise value is',value)
//  })
//  while(let i=0 ;i<100000;i++)
//  {

//  }
// console.log("second")
//steps
//line 1: 1ms pushed into call stack, setTimeout is web feature, handovered/poped out to web api, time is 0ms, pushed to callback queue
//line 5: 2ms fetcch url is pushed to stack , handovered to web api, promise objects are stored on memory
//line 7: 3ms  promise.then is pushed on to stack 
//line 10 : while loop 
//