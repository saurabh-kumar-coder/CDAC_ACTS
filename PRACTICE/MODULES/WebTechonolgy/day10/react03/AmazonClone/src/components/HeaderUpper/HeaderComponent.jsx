import { Col, Row } from "react-bootstrap";
import LogoComponent from "./LogoComponent";
import LocationComponent from "./LocationComponent";
import GlobalSearchComponent from "./GlobalSearchComponent";
import LanguageComponent from "./LanguageComponent";
import SignInComponent from "./SignInComponent";
import ReturnOrderComponent from "./ReturnOrderComponent";
import CartComponent from "./CartComponent";
import "../../style/HeaderUpper/header.css";
const HeaderComponent = () => {
	return (
		<nav id="header-main" className="px-0">
			<Row id="header-row-1 container" className="pt-2 p-0 m-0">
				<Col className="w-auto p-0">
					<LogoComponent />
				</Col>
				<Col>
					<LocationComponent />
				</Col>
				<Col xs={7}>
					<GlobalSearchComponent />
				</Col>
				<Col>
					<LanguageComponent />
				</Col>
				<Col>
					<SignInComponent />
				</Col>
				<Col>
					<ReturnOrderComponent />
				</Col>
				<Col className="p-0 d-flex align-content-end">
					<CartComponent />
				</Col>
			</Row>
		</nav>
	);
};

export default HeaderComponent;
