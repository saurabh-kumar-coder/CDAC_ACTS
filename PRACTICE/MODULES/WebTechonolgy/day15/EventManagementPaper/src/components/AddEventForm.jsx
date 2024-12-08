import { useState } from "react";
import ShowEventList from "./ShowEventList";
import "../style/style.css";
const AddEventForm = () => {
	const [eventTitle, setEventTitle] = useState("");
	const [description, setDescription] = useState("");
	const [eventOn, setEventOn] = useState("");

	const [eventList, setEventList] = useState([]);

	const options = { eventTitle: "", description: "", eventOn: "" };

	const handleSubmit = (e) => {
		e.preventDefault();
		options.eventTitle = eventTitle;
		options.description = description;
		options.eventOn = eventOn;
		setEventList((prevList) => [...prevList, options]);
		setEventTitle("");
		setDescription("");
		setEventOn("");
		console.log(eventList);
	};
	const handleEventTitle = (e) => {
		setEventTitle(e.target.value);
		// console.log(eventTitle);
	};
	const handleDescription = (e) => {
		setDescription(e.target.value);
		// console.log(description);
	};
	const handleDate = (e) => {
		setEventOn(e.target.value);
		// console.log(eventOn);
	};
	return (
		<div className="divideScreen">
			<div>
				<form>
					<table>
						<tbody>
							<tr>
								<td>
									<input
										type="text"
										value={eventTitle}
										onChange={handleEventTitle}
										placeholder="Event Title"
									/>
								</td>
							</tr>
							<tr>
								<td>
									<textarea
										type="text"
										value={description}
										placeholder="Event Description"
										onChange={handleDescription}
									/>
								</td>
							</tr>
							<tr>
								<td>
									<input
										type="date"
										value={eventOn}
										onChange={handleDate}
										placeholder="Event Date"
									/>
								</td>
							</tr>
							<tr>
								<td>
									<button onClick={handleSubmit}>Add Event</button>
								</td>
							</tr>
						</tbody>
					</table>
				</form>
			</div>
			<div>
				<ShowEventList eventList={eventList} />
			</div>
		</div>
	);
};

export default AddEventForm;
