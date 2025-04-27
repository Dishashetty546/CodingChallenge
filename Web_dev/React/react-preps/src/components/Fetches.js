import React, { useState, useEffect } from 'react';

const FetchData = () => {
    // State to store fetched records
    const [records, setRecords] = useState([]);

    useEffect(() => {
        fetch('https://jsonplaceholder.typicode.com/users')
            .then(response => response.json())
            .then(data => setRecords(data))
            .catch(err => console.log(err));
    }, []);

    return (
        <>
            <ul>
                {records.map((list, index) => (
                    <li key={index}>
                        {list.id} | {list.name}
                    </li>
                ))}
            </ul>
        </>
    );
};

export default FetchData;
