import React, { useState } from 'react'

const EventFormComponent = ({updateEventList}) => {
    const [eventName, setEventName] = useState  ("");
    const [eventDescription, setDescription] = useState("");
    const [eventDate, setDate] = useState("");
    const addEventDetails = () => {
        updateEventList((prevList) => [
            ...prevList, 
            { eventName, eventDescription, eventDate }
        ]);
        console.log("Event Name:", eventName);
        console.log("Description:", eventDescription);
        console.log("Event Date:", eventDate);
        console.log("submit");
    }
    return (
        <div>
            <input type='text' name='eventName' placeholder='Event Name' onChange={(e) => {setEventName(e.target.value)}} /><br />
            <input type='text' name='description' placeholder='Description' onChange={(e) => {setDescription(e.target.value)}} /><br />
            <input type='date' name='date' placeholder='Event Date' onChange={(e) => {setDate(e.target.value)}} /><br />
            <button type='submit' onClick={addEventDetails}>Add Event</button>
        </div>
    )
}

export default EventFormComponent