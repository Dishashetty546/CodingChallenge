import React,{useEffect} from 'react'
import axios from 'axios';

const fetchData=()=>{
    return axios.get('https://www.google.co.in/maps')
    .then((res)=>{
        console.log(res);
    })
    .catch((err)=>{
        console.log(err);
    })
}

export default function App(){
    useEffect(()=>{
        fetchData();
    },[])
    return (
    <div className='App'>
        <h1>hello</h1>
        <h1>start a new table</h1>

    </div>
    )
}