export const ChildComponent=(props)=>{
     return (
        <div>
        <button onClick={()=>props.greetHandler('child')}>h1</button>
        </div>
     )
}
