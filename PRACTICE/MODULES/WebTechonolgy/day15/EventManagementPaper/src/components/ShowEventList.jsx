import "../style/style.css";
const ShowEventList = (props) => {
	return (
		<div>
			<h1>Event List</h1>
			{props.eventList.length > 0 ? (
				<table>
					<thead>
						<tr>
							<th>Event Name</th>
							<th> Event Description</th>
							<th>Event Date</th>
						</tr>
					</thead>
					<tbody>
						{props.eventList.map((e, idx) => {
							return (
								<tr key={idx}>
									<td className="maxWidth">{e.eventTitle}</td>
									<td className="maxWidth">{e.description}</td>
									<td className="maxWidth">{e.eventOn}</td>
								</tr>
							);
						})}
					</tbody>
				</table>
			) : (
				<div>No Data FOUND</div>
			)}
		</div>
	);
};

export default ShowEventList;
