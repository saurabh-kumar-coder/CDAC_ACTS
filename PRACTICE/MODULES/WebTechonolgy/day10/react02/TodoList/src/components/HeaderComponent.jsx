import { FontAwesomeIcon } from "@fortawesome/react-fontawesome";
import {
	faArrowLeft,
	faMagnifyingGlass,
} from "@fortawesome/free-solid-svg-icons";
import { faGear } from "@fortawesome/free-solid-svg-icons";
import "../style/header-style.css";
import { useState } from "react";
import { Button, Row, Col, InputGroup, FormControl } from "react-bootstrap";
import "bootstrap/dist/css/bootstrap.min.css";
import "react-bootstrap/dist/react-bootstrap.min.js";
import TaskComponent from "./TaskComponent";
const HeaderComponent = () => {
	const [todo, setTodo] = useState([]);
	const [inputValue, setInputValue] = useState("");
	function handleAddTodo() {
		setTodo((prevTodos) => [...prevTodos, inputValue]);
		setInputValue("");
		console.log("todo's : " + todo);
	}
	const handleInputChange = (e) => {
		setInputValue(e.target.value);
		console.log(inputValue);
	};
	return (
		<div>
			<div className="container">
				<Row>
					<Col xs={4}></Col>
					<Col xs={4}>
						<Row>
							<Col xs={4}>
								<FontAwesomeIcon icon={faArrowLeft} />
							</Col>
							<Col xs={4} id="heading">
								TODO Manager
							</Col>
							<Col xs={4} id="icon-gear">
								<FontAwesomeIcon icon={faGear} />
							</Col>
						</Row>
						<Row className="pt-2">
							<InputGroup>
								<InputGroup.Text>
									<FontAwesomeIcon icon={faMagnifyingGlass} />
								</InputGroup.Text>
								<FormControl type="text" placeholder="Search" />
							</InputGroup>
						</Row>
						<Row className="pt-2">
							<InputGroup>
								<FormControl
									type="text"
									value={inputValue || ""}
									onChange={handleInputChange}
									placeholder="Enter Todo's"
								/>
							</InputGroup>
						</Row>
						<Row>
							<Col xs={3}></Col>
							<Col className="d-grid pt-2" xs={6}>
								<Button onClick={handleAddTodo}>Add Todo</Button>
							</Col>
							<Col xs={3}></Col>
						</Row>
						<Row className="pt-4">
							<TaskComponent todo={todo} />
						</Row>
					</Col>
					<Col xs={4}></Col>
				</Row>
			</div>
		</div>
	);
};

export default HeaderComponent;

{
	/* <div>
							
						</div>

						<div></div>
						<div>
							
						</div> */
}
