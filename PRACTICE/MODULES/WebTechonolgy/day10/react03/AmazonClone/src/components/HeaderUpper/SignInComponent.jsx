import { NavDropdown } from "react-bootstrap";

const SignInComponent = () => {
	return (
		<div className="white-text">
			<div className="font-12">Hello, Sign in</div>
			<div>
				<NavDropdown
					id="dropdown-basic-button"
					className="font-14 fw-bold"
					title="Account & List"
				>
					<NavDropdown.Item href="#/action-1">Action</NavDropdown.Item>
					<NavDropdown.Item href="#/action-2">Another action</NavDropdown.Item>
					<NavDropdown.Item href="#/action-3">Something else</NavDropdown.Item>
				</NavDropdown>
			</div>
		</div>
	);
};

export default SignInComponent;
