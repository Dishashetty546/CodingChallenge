const greet=(props)=>{
    return <><h2>hello {props.name}</h2>
    {props.children}
    </>
}
export default greet