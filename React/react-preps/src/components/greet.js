const greet=(props)=>{
    return <><h2> {props.name}</h2>
    {props.children}
    </>
}
export default greet