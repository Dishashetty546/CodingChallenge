import React from "react";

const Home = () => {
  return (
    <div className="App">
      <h1>CountDown Timer</h1>
      <div className="input-container">
        <div className="input-box">
          <input id="hours" placeholder="HH" />
          <input id="min" placeholder="HH" />
          <input id="src" placeholder="HH" />
        </div>
        <button className="timer-button">start</button>
      </div>
    </div>
  );
};

export default Home;
