import { Col, Row } from "react-bootstrap";
const TaskComponent = ({ todo, checkedItems, handleCheckboxChange }) => {
	return (
		<div>
			<h3>Task List</h3>
			{todo.length > 0 ? (
				todo.map((element, idx) => (
					<Row key={idx}>
						<Col id="task-list">
							<div>
								<input
									type="checkbox"
									onChange={() => handleCheckboxChange(idx)}
									checked={checkedItems.includes(idx)}
								/>
							</div>
							<div
								className="px-2"
								style={{
									textDecoration: checkedItems.includes(idx)
										? "line-through"
										: "none",
								}}
							>
								{element}
							</div>
						</Col>
					</Row>
				))
			) : (
				<div>No tasks to display.</div>
			)}
		</div>
	);
};

export default TaskComponent;
