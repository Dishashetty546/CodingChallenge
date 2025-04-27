import { link } from 'fs';
import React,{useState} from 'react';
function Todolist()
{  
    const [tasks, setTasks] = useState(['wake up early','brush teeth','eat something healthy'])
    const [newTask, setNewTask] = useState([])

    function handleInputChange(event)
    {
        setNewTask(event.target.value); //this function to display the changes or typed words on search bar

    }
    function addTask()
    {

    }
    function deleteTask(index)
    {

    }
    function moveTaskUp()
    {

    }
    function moveTaskDown(index)
    {

    }
    return(
        <div className='to-do-list'>
            <h1>To-do-list</h1>
            <div>
                <input 
                type="text"
                placeholder='enter a task' 
                value={newTask}
                onChange={handleInputChange}/>
                 <button
             className='add-button'
             onClick={addTask}>Add</button>
            </div>
            <ol>
                {tasks.map((element,index)=>
                <li key={index}>
                    <span className='text'>{tasks}</span>

                </li> )}
            </ol>
           
        </div>
    );

}
export default Todolist