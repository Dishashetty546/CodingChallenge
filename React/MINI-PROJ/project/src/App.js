import "./App.css";
import react, { useEffect, useState } from "react";
function App() {
  const [isStart, setisStart] = useState(false);
  const [isHour, setisHour] = useState(0);
  const [isMinute, setisMinute] = useState(0);
  const [isSec, setisSec] = useState(0);

  const handleStart = () => {
    setisStart(true);
  };
  const handleReset = () => {
    setisStart(false);
  };
  const handleInput = (e) => {
    console.log(e.target.id, e.target.value);
    const value = parseInt(e.target.value);
    const id = e.target.id;
    if (id == "hours") {
      setisHour(value);
    } else if (id == "minutes") {
      setisMinute(value);
    } else id == "seconds";
    {
      setisHour(value);
    }
  };

  useEffect(() => {});

  return (
    <div className="App">
      <h1>CountDown Timer</h1>
      {!isStart && (
        <div className="input-container">
          <div className="input-box">
            <input onChange={handleInput} id="hours" placeholder="HH" />
            <input onChange={handleInput} id="minutes" placeholder="MM" />
            <input onChange={handleInput} id="seconds" placeholder="SS" />
          </div>
          <button className="timer-button" onClick={handleStart}>
            start
          </button>
        </div>
      )}
      {isStart && (
        <div className="show-container">
          <div className="timer-box">
            <div>10</div>
            <span>:</span>
            <div>11</div>
            <span>:</span>
            <div>12</div>
          </div>
          <div className="action-box">
            <button className="timer-button">Pause</button>
            <button className="timer-button">Resume</button>
            <button className="timer-button" onClick={handleReset}>
              Reset
            </button>
          </div>
        </div>
      )}
    </div>
  );
}

export default App;
