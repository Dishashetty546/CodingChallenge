//------------------Cron job - he frequency or interval at which the job runs (e.g., daily, weekly),is to schedule the events , here ***** , each star indicates, 1st one days of week(0-6), then months, thenday of  month hour, min
//runs files based on fixeds schedule
//ex: data cleanup everynight, old data discarting, etc
//ex:
// const cron = require("node-cron");

// cron.schedule("* * * * *", () => {
//   console.log("Running a task every minute");
// });
// cron.schedule("*/5****", () => {
//   console.log("hello");
// });

//o/p:running a task every minute
// Running a task every minute
// Running a task every minute
// Running a task every minute
// Running a task every minute

//---------------------------------------------------------------------------------------------------------------------------------------------
//--------Triggers---------------------------------------------------------------------------------------------------------------------------
//A trigger is a procedural code that is automatically executed in response to certain events on a particular table or view in a database.
// ex: auto update mechanism
//ex:algo trading, chatbot, flood trigerring, accident detection

//ex:
// const EventEmitter = require("events");
// const eventEmitter = new EventEmitter();

// //instance is added to userSignnup
// eventEmitter.on("userSignup", (user) => {
//   console.log(`welcome to this MR ${user}`); // Use the `user` parameter correctly
// });
// eventEmitter.emit("userSignup", "John Doe");

//differece b/w cron and trigger - examples use cases

//a chotbot for food place
// const EventEmitter = require("events");
// const eventEmitter = new EventEmitter();
// const { stdin, stdout } = require("process");
// const readline = require("readline");

// const rl = new readline.createInterface({
//   input: stdin,
//   output: stdout,
// });

// rl.question("Type 'option' to get started with the food bot: ", (answer) => {
//   if (answer.toLowerCase() === "option") {
//     eventEmitter.emit("option");
//   } else {
//     console.log("Invalid input. Please type 'option' to get started.");
//     rl.close();
//   }
// });

// eventEmitter.on("option", () => {
//   console.log("Your available options are:");
//   console.log("1. View menu");
//   console.log("2. Order food");
//   console.log("3. Order beverages");
//   console.log("4. Exit");

//   rl.question("Pick an option: ", (option) => {
//     if (option === "1") {
//       eventEmitter.emit("viewMenu");
//     } else if (option === "2") {
//       eventEmitter.emit("orderFood");
//     } else if (option === "3") {
//       eventEmitter.emit("orderBeverages");
//     } else if (option === "4") {
//       eventEmitter.emit("exit");
//     } else {
//       console.log("Invalid option. Please try again.");
//       rl.close();
//     }
//   });
// });

// eventEmitter.on("viewMenu", () => {
//   console.log("Here is the menu: \n- Pizza\n- Burger\n- Pasta");
//   rl.close();
// });

// eventEmitter.on("orderFood", () => {
//   console.log("You chose to order food.");
//   rl.close();
// });

// eventEmitter.on("orderBeverages", () => {
//   console.log("You chose to order beverages.");
//   rl.close();
// });

// eventEmitter.on("exit", () => {const
//   console.log("Thank you for using the food bot. Goodbye!");
//   rl.close();
// });

//-------------------------------------web socket server----------------------------------------------------------------

// const WebSocketServer = require("ws");
// const wss = new WebSocketServer.Server({ port: 1234 });

// wss.on("connection", (ws) => {
//   ws.on("message", (data) => {
//     console.log("received message:%s", data);
//     ws.send("Thank you for the kind message");
//   });
//   ws.send("heeelllooooooooo");
// });
