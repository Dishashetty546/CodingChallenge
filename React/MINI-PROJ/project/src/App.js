import "./App.css";
import React, { useEffect, useState } from "react";

function App() {
  const [isStart, setisStart] = useState(false);
  const [isHour, setisHour] = useState(0);
  const [isMinute, setisMinute] = useState(0);
  const [isSec, setisSec] = useState(0);
  const [timeId, settimerId] = useState(null);
  const [isPaused, setIsPaused] = useState(0);
  const handleStart = () => {
    setisStart(true);
  };

  const handleReset = () => {
    setisStart(false);
    setisHour(0);
    setisMinute(0);
    setisSec(0);
    if (timeId) clearInterval(timeId);
  };

  const handlePause = () => {};
  const handleInput = (e) => {
    const value = parseInt(e.target.value) || 0;
    const id = e.target.id;

    if (id === "hours") {
      setisHour(value);
    } else if (id === "minutes") {
      setisMinute(value);
    } else if (id === "seconds") {
      setisSec(value);
    }
  };

  const runtimer = () => {
    setisSec((sec) => {
      if (sec > 0) return sec - 1;
      if (sec === 0 && isMinute > 0) {
        setisMinute((min) => min - 1);
        return 59;
      }
      if (sec === 0 && isMinute === 0 && isHour > 0) {
        setisHour((hour) => hour - 1);
        setisMinute(59);
        return 59;
      }
      if (sec === 0 && isMinute === 0 && isHour === 0) {
        setisHour(0);
        setisMinute(0);
        setisSec(0);
        alert("Timer is finished");
      }
      setisStart(false); // Stop timer when countdown reaches zero
      return 0;
    });
  };

  useEffect(() => {
    if (isStart) {
      const tid = setInterval(runtimer, 1000);
      settimerId(tid);
    } else if (!isStart && timeId) {
      clearInterval(timeId);
      settimerId(null);
    }
    return () => clearInterval(timeId); // Clean up on unmount
  }, [isStart]);

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
            Start
          </button>
        </div>
      )}
      {isStart && (
        <div className="show-container">
          <div className="timer-box">
            <div>{String(isHour).padStart(2, "0")}</div>
            <span>:</span>
            <div>{String(isMinute).padStart(2, "0")}</div>
            <span>:</span>
            <div>{String(isSec).padStart(2, "0")}</div>
          </div>
          <div className="action-box">
            <button className="timer-button" onClick={handlePause}>
              Pause
            </button>
            <button className="timer-button" onClick={() => setisStart(true)}>
              Resume
            </button>
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