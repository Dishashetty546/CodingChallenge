//simple stack operations
// class Stack {
//     constructor() {
//         this.items = [];
//     }

//     // Push element into the stack
//     push(element) {
//         this.items.push(element);
//     }

//     // Pop element from the stack
//     pop() {
//         return this.items.pop();
//     }

//     // Peek the top element in the stack
//     peek() {
//         return this.items[this.items.length - 1];
//     }

//     // Check if the stack is empty
//     isEmpty() {
//         return this.items.length === 0;
//     }
// }

// // Test the stack
// const stack = new Stack();
// stack.push('A');
// stack.push('B');
// console.log(stack.peek()); 
// console.log(stack.pop());  
// console.log(stack.peek()); 

//EX:1
//***********************ERRORS HERE****************************** */
// class browser{
//     Constructor()
//     {
//         this.instruction=[];
//     }
//     push(elements)
//     {
//         this.instruction.push(elements);
//     }
//     pop()
//     {
//        return  this.instruction.pop();
//     }
//     isEmpty()
//     {
//         return this.item.length===0;
//     }
// }
// class stck{
//     constructor(){
//         this.backStack= new browser();
//         this.forwardStack= new browser();
//         this.currentpage=null;

//     }
//     back(){
//         if(this.backStack.isEmpty)
//         {
//             console.log("No empty pages!");
//             return;

//         }
//         this.forwardStack.push(element);

//     }
// }
// const stack= new browser;
// stack.push('open_google');
// stack.push('server: www.google.com');
// stack.push('server: www.youtube.com');

// class queue{
//     constructor(){
//         this.items=[];
//     }
//     enqueue(element){
//         this.items.push(element);
//     }
//     dequeue()
//     {
//         return this.items.shift();

//     }
//     peek()
//     {
//         return this.items[0];
//     }
//     isEmpty()
//     {
//         return this.items.length===0;
//     }
// }
// const queue_new = new queue;
// queue.enqueue('request 1');
// queue.enqueue('request 2');
// console.log(queue.peek());
// console.log(queue.pop());

//EX:1
//abulance requesta----4 abulance , 12 patients , solve to finf optimal way to allocate patients into ambulance
//---------------------------------ERRORS---------------------------------------------------------
//  class ambulance{
//     enqueue(request)
//     {
//         this.req.push(request);
//     }
//     dequeue()
//     {
//         if(this.ambulance=0)
//         {
//             this.req= this.req.so

//         }
//     }
//  }

//EX:2

// class auto{
//     constructor()
//     {
//         enqueue(req)
//         {
//             this.queue.push(req);
//         }
//         dequeue(req)
//         {
//             return this.queue.shift();
//         }
//         view()
//         {
//             return this.queue;
    
//         }
//     }
// }
// const neww= new auto()


//-----------------CALL BACK APPROACH--------------------

// function getData() {
//     return new Promise((resolve, reject) => {
//        setTimeout(() => {
//            reject("You got an error");
//        }, 1000);
//     });
// }

// function deliver() {
//     return new Promise((resolve, reject) => {
//         setTimeout(() => {
//             reject("hello");
//         }, 3000);
//     });
// }

// // Example usage
// getData().then(data => {
//     console.log("Data received:", data);
// }).catch(error => {
//     console.error("Error:", error);
// });

// deliver().then(data => {
//     console.log("hellooo", data);
// }).catch(error => {
//     console.error("hehe", error);
// });

//------------------ASYNC AWAIT METHOD-----------------------------

// Define the function as async, used to make code  more readable and easy to understand
// async function getData() {
//     // Use await to wait for the promise to settle, promise is used as an assurance to clear partcilay errors on time
//     try {
//         //const is a datatype in js
//         const data = await new Promise((resolve, reject) => {
//             //timout is to set  time to give deserved output
//             setTimeout(() => {
//                 reject("Order the food");
//             }, 2000);
//         });
//         console.log("Data received:", data);
//     } catch (error) {
//         console.error("Ordering :", error); // Catch any error from the rejected promise
//     }
// }
// async function getprocess() {
//     // Use await to wait for the promise to settle, promise is used as an assurance to clear partcilay errors on time
//     try {
//         //const is a datatype in js
//         const data = await new Promise((resolve, reject) => {
//             //timout is to set  time to give deserved output
//             setTimeout(() => {
//                 reject("process the food");
//             }, 2000);
//         });
//         console.log("Data received:", data);
//     } catch (error) {
//         console.error("Processing:", error); // Catch any error from the rejected promise
//     }
// }
// //consider two functions give output in thr timr diff of 10 sec
// async function deliver() {
//     try {
//         const result = await new Promise((resolve, reject) => {
//             setTimeout(() => {
//                 reject("food delivered");
//             }, 2000);
//         });
//         console.log("hellooo", result);
//     } catch (error) {
//         console.error(" delivery: ", error); // Catch the error if the promise is rejected
//     }
// }

// // Call the async functions
// getData();
// getprocess();
// deliver();

//---------------FILE HANDLING IN JS----------------------
//in built method called file system
//files includes different operations like creating, reading, updating, renaming, and deleting.
//1. file.open()
//fs.open() will throw an error if the file doesn’t exist while opening in reading mode. It will create a new empty file in writing and appending modes
const fs = require("fs");

fs.open("sample.txt", 'w', (err, file) => {
   if (err) throw err;
   console.log(file);  // Logs the file descriptor
});

//2.file.read()
//sed to read the content from a file. It will throw an error if the file doesn’t exist in the given path

const fr = require("fs");

fr.readFile("sample.txt", "utf8", (err, data) => {  // "utf8" specifies the encoding for readable text
    if (err) throw err;
    console.log(data);  // Logs the content of the file
});

//3.file.append()
//used to append the content at the end of the file. If the file doesn’t exist in the given path,

const fb = require("fs");

fb.appendFile("sample.txt", "This is new content.\n", (err) => {
    if (err) throw err;
    console.log("Content appended to file!");
});
