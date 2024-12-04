import { Dropdown, DropdownButton, Form, InputGroup } from "react-bootstrap";

const GlobalSearchComponent = () => {
	return (
		<div className="">
			<InputGroup>
				<DropdownButton
					variant="secondary"
					id="dropdown-basic-button"
					title="All"
				>
					<Dropdown.Item href="#/action-1">Action</Dropdown.Item>
					<Dropdown.Item href="#/action-2">Another action</Dropdown.Item>
					<Dropdown.Item href="#/action-3">Something else</Dropdown.Item>
				</DropdownButton>
				<Form.Control
					type="text"
					placeholder="Search Amazon"
					id=""
					className=""
				/>
			</InputGroup>
		</div>
	);
};

export default GlobalSearchComponent;
