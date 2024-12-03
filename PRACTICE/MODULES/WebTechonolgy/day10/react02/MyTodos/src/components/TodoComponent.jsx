import { Col, Row } from "react-bootstrap";
import PropTypes from "prop-types";
import { FontAwesomeIcon } from "@fortawesome/react-fontawesome";
import { faTrash } from "@fortawesome/free-solid-svg-icons";
const TodoComponent = ({
	todo,
	isChecked,
	handleCheckBox,
	deleteCurrentTodo,
}) => {
	return (
		<div>
			<h3>Task List</h3>
			{todo.length > 0 ? (
				todo.map((element, idx) => (
					<Row key={idx}>
						<Col id="task-list">
							<div>
								<input
									checked={isChecked.includes(idx)}
									onChange={() => handleCheckBox(idx)}
									type="checkbox"
								/>
							</div>
							<div
								className="px-2"
								style={{
									textDecoration: isChecked.includes(idx)
										? "line-through"
										: "none",
								}}
							>
								{element}
							</div>
							<div onClick={() => deleteCurrentTodo(idx)}>
								<FontAwesomeIcon icon={faTrash} />
							</div>
						</Col>
					</Row>
				))
			) : (
				<div>No Task Available</div>
			)}
		</div>
	);
};

TodoComponent.propTypes = {
	todo: PropTypes.array.isRequired,
	isChecked: PropTypes.array.isRequired,
	handleCheckBox: PropTypes.any.isRequired,
	deleteCurrentTodo: PropTypes.any.isRequired,
};
export default TodoComponent;
