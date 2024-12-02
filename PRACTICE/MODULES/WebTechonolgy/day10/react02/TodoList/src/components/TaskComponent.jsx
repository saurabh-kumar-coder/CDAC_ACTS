import { Col, Row } from "react-bootstrap";
const TaskComponent = ({ todo }) => {
	return (
		<div>
			<h3>Task List</h3>
			{todo.length > 0 ? (
				todo.map((element, idx) => (
					<Row key={idx}>
						<Col id="task-list">
							<div>
								<input type="checkbox" />
							</div>
							<div className="px-2">{element}</div>
						</Col>
					</Row>
				))
			) : (
				<div>No tasks to display.</div>
			)}
			{/* {options.forEach((element) => (
				<Row>
					<Col id="task-list">
						<div>
							<input type="checkbox" />
						</div>
						<div className="px-2">{element}</div>
					</Col>
				</Row>
			))} */}

			{/* {options.map((element, idx) => (
				<Row key={idx}>
					<Col id="task-list">
						<div>
							<input type="checkbox" />
						</div>
						<div className="px-2">{element}</div>
					</Col>
				</Row>
			))} */}

			{/* {options.for((ele, idx) => {
				<Row key={idx}>
					<Col id="task-list">
						<div>
							<input type="checkbox" />
						</div>
						<div className="px-2">{options}</div>
					</Col>
				</Row>;
			})} */}
			{/* <Row>
				<Col id="task-list">
					<div>
						<input type="checkbox" />
					</div>
					<div className="px-2">
						Lorem ipsum dolor sit amet consectetur adipisicing elit. Sapiente,
						recusandae.
					</div>
				</Col>
			</Row>
			<Row>
				<Col id="task-list">
					<div>
						<input type="checkbox" />
					</div>
					<div className="px-2">
						Lorem ipsum adipisicing elit. Sapiente, recusandae.
					</div>
				</Col>
			</Row> */}
		</div>
	);
};

export default TaskComponent;
