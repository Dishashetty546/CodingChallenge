import "./App.css";
import React from "react";
import FAQItem from "./FAQItem";

function App() {
  // Assign the variable faq
  const faq = [
    {
      question: "What is my name?",
      answer: "My name is Disha.",
    },
    {
      question: "How to drink water?",
      answer: "We drink water by mouth.",
    },
  ];

  return (
    <>
      {/* We'll iterate through this array of FAQ using the map function */}
      {faq.map((item, index) => {
        return <FAQItem key={index} faq={item} />;
      })}
    </>
  );
}

export default App;
c;
