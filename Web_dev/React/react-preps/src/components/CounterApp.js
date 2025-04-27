import React from 'react'
import {useState} from 'react'

const CounterApp = () => {
    const [Count,setCount]= useState(0)
  return (
    <div className='container my-5'>
        <div className='card center-text my-5'>
            <div className='card-body'>
                <h1>Counter App</h1>
                <div className='my-5 center-text'> 
                    <h2 className='my-5 center-text '>{Count}</h2>
                    <button className='btn btn mx-3 ' onClick={()=>setCount(Count+1)}>Increment</button>
                    <button className='btn btn mx-3 ' onClick={()=>setCount(Count-1)}>Decrement</button>
                    <button className='btn btn mx-3 'onClick={()=>setCount(0)}>Reset</button>
                </div>

            </div>
        </div>
    </div>
  )
}

export default CounterApp