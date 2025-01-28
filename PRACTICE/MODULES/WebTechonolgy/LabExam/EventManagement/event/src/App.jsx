import { useState } from "react";
import EventForm from "./Components/EventFormComponent"
import ShowEventList from "./Components/ShowEventListComponent"

function App() {
  const [EventList, setEventList] = useState([]);

  return (
    <>
      <EventForm updateEventList={setEventList}/>
      <div style={{"paddingTop":"10px"}}></div>
      <ShowEventList EventList={EventList} />
    </>
  )
}

export default App
