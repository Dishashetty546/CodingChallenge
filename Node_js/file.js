//--------file system (fs)------------------------------

//1
// const fs = require("fs");

// //syncronous call
// fs.writeFileSync("./test.text", "hello");

// //asynchronous call
// fs.writeFile("text.txt", "heleel", (err) => {});

//2
//read a file
//synchrounous
// const result = fs.readFileSync("/text.txt", "utf-8");
// console.log(result)

//asyncrnous
// fs.readFile("./content.txt", "utf-8", (err, result) => {
//   if (err) {
//     console.log("error", err);
//   } else {
//     console.log(result);
//   }
// });

//3.
//append
// fs.appendFileSync("./content.txt", "hey there");

//4. copy delete etc other file handling functions

//--------------ARCHITECTURE OF NODE JS--------------------------------------------------

//1. request is sent from the client , it will get stored in a queue, then using event loop it will decide if its a blocking or non-blocking operation
//2. if its a blocking operation , it  will go the thread, thread will decide further process
//3. if its non blocking operation, then it will give nack response msg
//4. thread is like a worker, specific tasks are assigned to differnt workers, then will return result

//ex: file handling

//synchronous - blocking
// const fs = require("fs");
// console.log("1");
// const result = fs.readFileSync("./content.txt", "utf-8");
// console.log(result);

// console.log("2");

//o/p:
// 1
// ehbywrhbFhey there
// 2

//asynchrounous - non-blocking
// const fs = require("fs");
// console.log("1");
// const result = fs.readFile("./content.txt", "utf-8", (err, result) => {
//   if (err) {
//     console.log(err);
//   } else {
//     console.log(result);
//   }
// });
// console.log(result);

// console.log("2");

//o/p:
// 1
// undefined
// 2
// ehbywrhbFhey there

//---------------------------------------------------------------------------
//HTTP SERVER - hyper text transfer protocol
// const http = require("http");
// const myServer = http.createServer((req, res) => {
//   console.log("New req rec");
//   //   res.end("hello");
// });
// myServer.listen(8000, () => console.log("Server started"));

//server started
