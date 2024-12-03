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
import TodoComponent from "./TodoComponent";
const HeaderComponent = () => {
	const [todo, setTodo] = useState([]);
	const [inputValue, setInputValue] = useState();
	const [isChecked, setIsChecked] = useState([]);
	const [searchValue, setSearchValue] = useState();
	const [searchFilter, setSearchFilter] = useState([]);
	const getInputValue = (e) => {
		setInputValue(e.target.value);
	};

	const addTodo = () => {
		if (inputValue !== "") {
			setTodo((prevTodo) => [...prevTodo, inputValue]);
			setInputValue("");
		}
	};

	const handleCheckBox = (idx) => {
		setIsChecked((prevIsChecked) => {
			if (prevIsChecked.includes(idx)) {
				return prevIsChecked.filter((item) => item !== idx);
			} else {
				return [...prevIsChecked, idx];
			}
		});
	};

	const deleteCurrentTodo = (idx) => {
		const updatedTodo = todo.filter((_, index) => index !== idx);
		const updatedIsChecked = todo.filter((_, index) => index !== idx);
		setTodo(updatedTodo);
		setIsChecked(updatedIsChecked);
	};
	const handleSearchTodo = (e) => {
		setSearchValue(e.target.value);
		searchTodo();
	};
	const searchTodo = () => {
		const searchTerm = searchValue ? searchValue.toLowerCase() : "";
		if (searchTerm === "") {
			setTodo(todo);
			setSearchFilter([]);
			setSearchValue("");
			return;
		}
		const filterTodo = todo.filter(
			(text) =>
				text &&
				typeof text === "string" &&
				text.toLowerCase().includes(searchTerm)
		);
		setSearchFilter(filterTodo);
	};

	return (
		<div>
			<div className="container pt-3">
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
								<FormControl
									value={searchValue || ""}
									onChange={handleSearchTodo}
									type="text"
									placeholder="Search"
								/>
							</InputGroup>
						</Row>
						<Row className="pt-2">
							<InputGroup>
								<FormControl
									type="text"
									value={inputValue || ""}
									onInput={getInputValue}
									placeholder="Enter Todo's"
								/>
							</InputGroup>
						</Row>
						<Row>
							<Col xs={3}></Col>
							<Col className="d-grid pt-2" xs={6}>
								<Button onClick={addTodo}>Add Todo</Button>
							</Col>
							<Col xs={3}></Col>
						</Row>
						<Row className="pt-4">
							<TodoComponent
								todo={searchFilter.length !== 0 ? searchFilter : todo}
								isChecked={isChecked}
								handleCheckBox={handleCheckBox}
								deleteCurrentTodo={deleteCurrentTodo}
							/>
						</Row>
					</Col>
					<Col xs={4}></Col>
				</Row>
			</div>
		</div>
	);
};

export default HeaderComponent;
