export const ClickHandler=()=>{
    //function inside anther function
    const clickHandler=(event, count=0)=>{
        console.log("button clicked");
    }

    return(
        <div>
            <button onClick={clickHandler}>click</button>
            <button onClick={(event)=> clickHandler(event,5)}>click 5</button>
        </div>
    )
}