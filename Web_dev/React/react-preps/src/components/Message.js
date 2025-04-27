import { useState } from 'react'
const Message=(props)=>{
    const [message,setMessage]=useState('welcome vistor')
    return <><h2>{message}</h2>
    <button onClick={()=> setMessage('thank you for subscribing')}>Subscribe</button>
    
    </>
}
export default Message