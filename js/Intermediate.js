//----------Scope of js-----------------------------
//Block scope: var declared inside a pair of curly braces cant be accessed outside
//function scope: var declared inside a func cant be assessed from outside
//global scope: globally scoped var cant be accessed inside a block or func

//Nested function scope - function within the func
// let a =10;
// function outer()
// {
//     let b=10;
//     function inner(){
//         let c= 30;
//         console.log(a,b,c);
//     }
//     inner();
// }outer()


//----------------CLOSURE---------------------------------
//closure is a combination of functions bundled together with refernces to its surrounding states, closure is created every time func is created
// function outer()
// {
//     let counter=0;
//     function inner(){
//         counter++;
//         console.log(counter);          o/p: 1 and 1
//     }
//     inner()
// }
// outer()    //every outer function , will reinitialize counter value to o initially
// outer()
//first the compiler will check for counter in inner function, its not present, then check on outer function , it is presrnt as counter=0, 

//EX: CLOSUREs
// function outer()
// {
//     let counter=0;
//     function inner()
//     {
//         counter++;
//         console.log(counter);         o/p: 1 and 2
//     }
//     return inner;
// }
// const fn= outer()
// fn()
// fn()

//closure
//* returns one of function from another funtion
//* returning combination of func defination nd function scope
//* combination of function and its scope is called as closure.


//---------------Function currying-----------------------
//transform a func with multiple argumnets into a sequence of nested funcs that takes one argument at a time
//EX: f(a,b,c) transformed to f(a)(b)(c)

//noraml function
// function sum(a,b,c)
// {
//    return a+b+c 
// }
//  console.log(sum(1,4,3))

//curried func
// function sum(a, b, c) {
//     return a + b + c;
// }
// function curry(fn)
// {
//     return function(a)
//     {
//         return function(b)
//         {
//             return function(c)
//             {
//                 return fn(a,b,c)
//             }
//         }
//     }
// }
// const curriedsum= curry(sum);
// console.log(curriedsum(1)(4)(5));


//---------------This keyword------------------
//refers to object it belongs to
//makes func more reusable by letting decide the object value
//how func is called
// function myname(name)
// {
//      console.log(`my name is ${name}`)
// }
// myname('disha')

//usage of this keyword to this
//Three methods to identify this keyword
//--IMPLICIT BINDING THIS KEYWORD refernce
// const person={
//     name: 'disha',
//     saymyname:  function()
//     {
//         console.log(`my name is ${this.name}`)
//     },
// }
// person.saymyname(); //here the dot operator before saymyname, refers to person , so this is pointing to person

//EXPLICIT BINDING
// function saymyname(){
//     console.log(`my name is ${this.name}`)
// }
// saymyname.call(person) 

//NEW BINDING - new keyword - by using new js will create a new object foe this keyword will refernce
// function person(name)
// {
//     this.name= name;
// }
// const p1= new person('disha')
// const p2= new person('shetty')
// console.log(p1.name, p2.name)

//order of precedence
//new binding
//explicit binding
//implicit binding
//default binding


//-----------PROTOTYPE----------------
//usage in inheritance
// function person(fname, lname)
// {
//     this.firstname= fname;
//     this.lastname= lname;
// }
// person.prototype.getfullname = function(){
//     return this.fname+ ''+this.lastname
// }
// function superhero(fname,lname)
// {
//     person.call(this, fname,lname)
//     {
//         this.issuperhero= true;
//     }
//     superhero.prototype.fightCrime= function()
//     {
//         console.log('fighting crime')
//     }
//     superhero.prototype = object.create(person.prototype)
//     const batman= new superhero('Bruce', 'wayne')
//     console.log(batman.getfullname())
// }


//-------------------class----------------------------------
//create a class
//Inherite classes
//2 methods
//* using extend keyword
// class superhero extends person{
//     constructor(fname,lname)
//     {
//         super(fname, lname)
//         this.superhero= true;
//     }
//     fightcrime()
//     {
//         console.log("fighing")
//     }
// }
// const batman= new superhero('bruce','hello')
// console.log(batman.saymyname())


//-----------ITERABLES ND ITERATORS--------------------
//iteration in js
//String
// const str= 'disha'
// for(let i=0;i<str.length;i++)
// {
//     console.log(str.charAt(i));
// }

//Arrays
// const arr= ['d','i','s','h','a'];
// for(let i=0;i<arr.length;i++)
// {
//     console.log(arr[i])
// }

//TWO NEW PROTOCOLS
//iterables nd iterators
//object which implements interable protocol is called as iterable
//it should implement a method as a key [Symbol.iterator]
//method should not accept any argument and should return an object
//object must have next() method that returns an object with 2 properties
//* value: which gives current element
//*done: which is a boolean value 

// const obj={
//     //method key
//     [Symbol.iterator] :function()
//     {
//         let step=0;
//         //not accept any argu nd return an object
//         //obj must hv next()
//         const iterator={
//             next: function(){
//                 step++;
//                 if(step==1)
//                 {
//                     return {value:'hello',done:false}
//                 }
//                 else if(step==2)
//                 {
//                     return { value: 'world', done: false}
//                 }
//                 return {value:undefined,done:true}
//             }
//         }
//         return iterator
        
//     }

// }
// for(const word of obj)
// {
//     console.log(word)
// }


//------------GENERATORS--------------------------
//special class functions , whr it creates our own iterators
//normal func
// function normalfunction(){
//     console.log("hello")
//     console.log('hehe')
// }
// normalfunction()
// normalfunction()  //again start exicution from start

//generator function--they were introduced in 2015
//yield is an opertor, everytime if we want to pause the event
// function* generatorfunction(){
//     yield 'hello';
//     yield 'world';  //it yields the value

// }
//  const generatorOnject= generatorfunction();//generator object is an iterattor so we need for loop
// for(const word of generatorOnject)
// {
//     console.log(word);
// }
//advantage of generator over iterator,
//we dont need to create an object and return an argument
//no need of next keyword



