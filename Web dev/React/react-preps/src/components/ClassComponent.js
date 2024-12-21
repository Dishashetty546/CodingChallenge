import React, { Component } from 'react'
import useState from 'react'

export default class ClassComponent extends Component {
    //before loading some page,we want to initialize somethings
constructor(){
    super();
    this.state={
        Count:0
    }
}
increment()
{
    this.setState({count:this.state.Count+1})
}
//first time rendering something ,then componentDidMount runs
componentDidMount(){
    console.log("componentDidMount : when component render first time")
}
//render is one of componet lifecycle method
//browser doesnt understand jsx as a lang, so we need transpiler - EX: babel
  render() {
    return (
      <div>
        <h1>{this.state.Count}</h1> 
        <button onClick={()=>{ this.increment()}}>click me</button>
        <h1>disha</h1>
      </div>
    )
  }
}
