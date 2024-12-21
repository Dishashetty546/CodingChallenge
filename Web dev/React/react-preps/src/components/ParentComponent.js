import { ChildComponent } from "./ChildComponent"

export const ParentComponent =()=>{
        const greetparent=(childName)=>{
    alert(`hello ${childName}`)
        }
     return <ChildComponent greetHandler={greetparent}/>

}