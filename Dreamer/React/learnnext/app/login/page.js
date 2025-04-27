"use client";

// import React, { useState } from "react";
// import { useRouter } from "next/navigation";
// export default function loginpage() {
//   const [email, setemail] = useState("");
//   const [password, setpassword] = useState("");
//   const router = useRouter();

//   return (
//     <div className="flex flex-col items-center justify-center min-h-screen bg-blue-800 text-white p-4">
//       <div className="p-8 bg-white text-black rounded-2xl flex flex-col justify-center items-center w-[400px] shadow-lg">
//         <h1 className="text-3xl font-bold mb-4">Login Page</h1>
//         <p className="text-lg mb-6">Welcome to my login page !!</p>
//         <form
//           onSubmit={(e) => {
//             e.preventDefault();
//             alert(email);
//             alert(password);
//             router.push("/home");
//           }}
//           className="w-full"
//         >
//           <input
//             onChange={(event) => {
//               setemail(event.target.value);
//             }}
//             type="text"
//             placeholder="Enter your email"
//             className="w-full p-2 mb-4 border border-gray-300 rounded"
//           />
//           <input
//             onChange={(event) => {
//               setpassword(event.target.value);
//             }}
//             type="password"
//             placeholder="Enter your password"
//             className="w-full p-2 mb-6 border border-gray-300 rounded-2xl"
//           />
//           <button
//             type="submit"
//             className="bg-blue-500 text-white hover:bg-amber-300 shadow rounded-2xl p-2 w-full"
//           >
//             Login
//           </button>
//         </form>
//       </div>
//     </div>
//   );
// }
