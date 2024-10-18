import { useState, useEffect } from 'react';
export const PostList =  () =>{
    const [posts,setposts] = useState([])
    useEffect(()=>{
        fetch('https://jsonplaceholder.typicode.com/posts')
        .then((response)=>response.json())
        .then((data)=>setposts(data))
        .catch((err)=>{
            console.log(err)
        })
    },[])
    return(
        <div>
            <ul>
                {postList.map((post)=>{
                    return <li key={key.id}>{post.title}</li>
                })}
            </ul>
        </div>
    )


}