export const NameList=()=>{
    const names=['disha','shetty','benn']
    return <div>
        {
            names.map((name)=>{
                return <h2 key={name}>{name}</h2>
            })
        }
    </div>
}