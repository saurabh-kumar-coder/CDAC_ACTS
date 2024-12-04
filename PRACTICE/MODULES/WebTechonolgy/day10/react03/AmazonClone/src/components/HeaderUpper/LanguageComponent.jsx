// import { faFlagUsa } from "@fortawesome/free-solid-svg-icons";
// import { FontAwesomeIcon } from "@fortawesome/react-fontawesome";
import { InputGroup, NavDropdown } from "react-bootstrap";
import { US } from "country-flag-icons/react/1x1";
import "../../style/HeaderUpper/header.css";
const LanguageComponent = () => {
	return (
		<div>
			<div className="white-text">
				<InputGroup className="gap-2">
					{/* <FontAwesomeIcon icon={faFlagUsa} /> */}
					<US id="logo-country" title="United States" />
					<div className="d-flex align-items-center">
						<NavDropdown
							className=""
							variant="secondary"
							id="dropdown-basic-button"
							title="EN"
						>
							<NavDropdown.Item href="#/action-1">Action</NavDropdown.Item>
							<NavDropdown.Item href="#/action-2">
								Another action
							</NavDropdown.Item>
							<NavDropdown.Item href="#/action-3">
								Something else
							</NavDropdown.Item>
						</NavDropdown>
					</div>
				</InputGroup>
			</div>
		</div>
	);
};

export default LanguageComponent;
