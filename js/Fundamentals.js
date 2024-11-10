// // variable declaration in javascript
// var usn = "123"
// console.log(usn)

//----------Variables---------------------------- is used  to store info/data in memory, they are given with a name, so that program is more readable------------------
// var variablename= 'welcome'
// console.log(variablename)

//After new version of Javascript - ES13 --2022
//2 ways to declare variable
//1. let--declare a variable to something and reassign with something else
//  let variablename = "w";
//  variablename="g"
//  console.log(variablename)   //o/p:g
//2. const--you'll get errors when you reassign
// variable name shouldnt be any valid keyword ex: let, var
// const var= "hello"
//we can use underscore in b/w variable, but not special characters: EX:/,*

//---------Datatypes in JS-----------------
//primitive datatypes - int, float, boolean,Strings
//complex datatypes- object, Symbol, null, undefined

//Strings
//primitive Strings
// const singlequotes='hello';
// const doublequotes="hello";
//complex strings - using ` --we can embed doller symbol
// const name= 'jam';
// const backticks=`hello,${name}`;
// console.log(singlequotes);
// console.log(doublequotes)
// console.log(backticks);

//numbers
// const wholeNumbers= 3;
// const decimalnumbers= 0.5;
// console.log(decimalnumbers);
// console.log(wholeNumbers)

//use of typeof keyword - find the datatype of the result
// const first=3;
// const second=5;
// const result= first/second;
// console.log( typeof result);  //o/p: number
//typeof whenever we want to find datatype of specific value

//boolean
//null
//undefined
// let x;
// console.log(x);

//diff b/w null nd undefined: variable has been declared but has not yet been assigned valu, null is an assigned value, assigned to null value

//objects
// const name= 'john';
// const age=25;        //these two entities r nt related any way

// const person = {     //to make them related, we do an object named person
// name:'john',
// age:'25',
// }
// console.log(person);  //o/p: {name: 'john', age: '25'}
// //use of dot operator
// console.log(person.name); //john

//arrays
// const arr= [1,2,4];
// console.log(arr)
// //to get current date nd time
// const date= new Date();
// console.log(date); //o/p: 3:39 GMT+0530 (India Standard Time)
//this is also an object
// const date = new Date();
// console.log(date);

//statically typed
// int number=5;
// number= 's';   //THIS SHOWS ERROR

//dynamically typed
// let message= 'hello';
// console.log(message);  //hello
// message=5;
// console.log(message)   //5

//-------------Operators and  equality--------------
//true or false
// == , !=, <=,>=,
//assignment nd logical operator, similar to the one we learnt in java

//-------------Decision making code---------------------
//if else condition
//while condition
//for loop

//-------------------------functions-------------------------
//js function -  a block of a code performs a task
//function declaration(defining a function)
//function call (calling/excicuting a func)
//function is a js keyword
//steps:

//step1: function declaration
// function square(x)
// {
//     return x*x;
// }

//step2: function call
//const result=square(5);
//console.log(result)

//Three types of function declarations
//used when we want this keyword
//1. function declaration
// function name(params)
// {
// //statements
// }

// //2.function expressions
// const name= function(params){
//     //statements
// }

// //most used --- 99.99% times
// //3. an arrow function
// //shorter way to declare a function , more modern way of func
// const name= (params)=>{
//     //statements*
// }

//invocking or call func
// function sayhi(name)
// {
//     console.log(`hi, ${name}`)
// }
// sayhi('joe');                                //hi,joe

// function add(a,b)
// {
//     return a*b;

// }
// const sum= add(3,5);
// console.log(sum)

//Arrow functions - do not have access to usage of this keyword
// const square =(number)=>
// {
//     return number *number;

// }
// const result= square(10);
// console.log(result);
