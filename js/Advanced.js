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

 //------------PROMISE---------------------------
 
