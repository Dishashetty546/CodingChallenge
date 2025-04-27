import {useState} from 'react';

export const Forms=()=>
    {
        const handlesubmit=(event)=>
        {
            event.preventDefault()
            alert(`form data is ${username}`)
            alert(`form data is ${discription}`)
        }
        const [username, setUsername]  = useState('')
        const[discription, setDescriptiom]= useState('')
        return <form onSubmit={handlesubmit}>
            <div>
                <label>UserName</label>
                <input type='text' value={username}  onChange={(event)=>setUsername(event.target.value)}/>
            </div>
            <button type='submit'>Submit</button>

            <div>
                <label>Descriptiom</label>
                <input type='text' value={discription} onChange={(event)=>setDescriptiom(event.target.value)}/>
            </div>
            <button type='submit'>Submit</button>

        </form>
    }