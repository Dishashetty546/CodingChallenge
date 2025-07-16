//Interveiw prepared

//1.
//defining an object
// function fruit() {
//   var name = "apple";
//   let price = 20;
//   console.log(name);
//   console.log(price);
// }
// fruit();

//2.
// for (var i = 0; i < 3; i++) {
//   setTimeout(() => console.log(i), 1);
// }
//var has global scope, thats why it has same value
// o/p:3 3 3

//3.
// for (let i = 0; i < 3; i++) {
//   setTimeout(() => console.log(i, 1));
// }
//o/p:0 1 2
//let has block scope

//4.
// console.warn(+true);
//+ sign convert into numerical value any string, boolean value get converted into numerical
// console.warn(typeof +true);
//typeof is to find the datatype of it

//5
// let birds = "size";
// const bird = {
//   size: "small",
// };
// console.warn(bird[birds]); //small
// console.warn(bird["size"]);
// console.log(bird.size);
// console.log(bird.birds);  //undefined

//6.
// let c = {
//   name: "peter",
// };
// let d = c;
// c.name = "anil";
// console.log(d.name);
//both has same memoory refernce

//7.
// var x;
// var x = 10;
// console.log(x); //will not throw any error, we can declare var any time

//8.
// console.log(a===b); //matching its datatype
// console.log(a==b)  //matching its values

//9.
// function sum(a, b) {
//   return a + b;
// }
// console.log(sum(1, "2"));  //12

//10.
// const add = eval("10*10+5");
// console.log(add);   //105

//11.
// sessionStorage.setItem("cool_secret", 123);
// sessioStorage:it will be acccessable till the tab will get closed, then it will disapper
//localStorage: is one month

//12.
// for (let i = 1; i < 5; i++) {
//   if (i == 3) continue; //when its i==3 it will simply continue
//   console.log(i); //o/p:1 2 4
// }

//13.
// const foo = () => console.log("first");
// const bar = () => setTimeout(() => console.log("second"));
// const baz = () => console.log("third");
// foo();
// bar();
// baz();
//o/p: first third second

//14.
// diff b/w call and bind

// const person = {
//   name: "liya",
// };
// function sayhi(age) {
//   return `${this.name} is ${age}`;
// }
// console.log(sayhi.call(person, 21));
// console.log(sayhi.bind(person, 21)());  //whenever we are binding any func, we have to call the func again

//15.
// function sayhi() {
//   return (() => 0)();
// }
// console.log(sayhi()); //0
// console.log(typeof sayhi()); //number

//16.
// console.log(typeof 1); //number
// console.log(typeof typeof 1);//string

//17.
// const numbers = [1, 2, 3];
// numbers[9] = 11;
// console.log(numbers);  //o/p: [ 1, 2, 3, <6 empty items>, 11 ]

//18. everthing in js is primitive and objects
// console.log(!!null);  //false
// console.log(!!"");    //false
// console.log(!!1);     //true

//19.
//setInterval - return a unique value
// console.warn(setInterval(() => console.log("hi"), 1000)); //print hi fr every one sec

//20.
// console.log([..."null"]); //... this is spread operator, this will break the array for string into minimal parts
//o/p: [ 'n', 'u', 'l', 'l' ]
