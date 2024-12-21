import React from 'react'
function Conditional(props){
    if(props.isLoggedIn)
    {
        return <h2 className='welcome-message'>Welcome {props.username}</h2>
    }
    else{
        return <h2 className='login-prompt'>please login to continue</h2>
    }
}

export default Conditional