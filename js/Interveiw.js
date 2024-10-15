//----------------------------------STEP 1----------------------------------------------------------------------
//1. JS is used to convert static to dynamic web page, that is because every browser has a js engine inside it ex: JS engine, chrome-V8, firefox- spider monkey, chakra- edge browser, safari etc
//   Js engine - that exicutes js code
//2. Clients - are the application/ softwares kind of local machine which sends the request message to the server,and gets the services provided by server
//   Server - are the high tech softwares, which has capability to manage larger bulk requests, and receives request message from server and provide services,resouces or functionalities to clients
//3. scope of js : - based on declaring and accessibility of variables
//   global scope - var declared above , upside - accessible everywhere
//   functional scope - var declared inside func, curly braces - not accessible outside their func
//   block/local scope - inside a if or else functions - not accessable outside that block
//4. will we get error if we declare any variable without any const,var,let keyword
//   no, it will defaultly take it as var type
//   variable= 19;
//   console.log(variable)
//5. Hoisting in JS - JS use top-down approach
//  whr func and var declaration is taken on the top in the compilation phase
//  x=10
//  console.log(x)
//  var x
//6. JSON - javascript object notation - lightweight data interchange process
//   basically it is language where web and api interact


//--------------------------------STEP 2-------------------------------------------------------------
//7. variables are used to store data, diff b/w var let and const 
//   scope: var - only inside the function
//          let and const - inside block only
// function example(){
//     if(true)
//     {
//         var count=10;
//     }
//     console.log(count);     //o/o:10
// }
// example()

// function example()
// {
//     if(true)
//     {
//         const count=0;
//     }
//     console.log(count)         //[Function: count]
// }
// example()

//8. datatypes in JS: do not need to write datatypes explicitlt, looking at the value JS will identify the datatype of particular value.
//   catagories of datatypes - primitive  - can hold only single values, EX: int, boolean etc
//                             non-primitive - can hold multiple values, EX: array, Object, func
//9. Diff b/w primitive and non-primitive
//   primitive - immutable - once assigmed cant be changed in the memory, simple datatypes
//   non-primitive - they are mutable, can be changed, complex datatypes
//10. diff b/w null nd undefined 
//    when var is declared but value is never assigned is known as null, intentially
//    when we dont have value now, but we might get it over a time
//11. typeof operator - find the type of each variable
// num=10;
// console.log(typeof num)    //o/p: number
//real application used to validate the output received from functions or api's

//12. type coercion in JS - automatic conversion of datatypes of one value to another type
// const Strong= "42"
// const number =42
// console.log(String= number)      //o/p:42
//used- String nd number concatination
//      while using comparition operator

//-----------------------------------STEP 3--------------------------------------------
//13. operator precidence - BODMAS (bracket, division, multiplication , addition, sub)
//14. uninary, binary, ternary operator

