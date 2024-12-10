import { Col, Row } from "react-bootstrap";
import { Link, Outlet } from "react-router-dom";
import "bootstrap/dist/css/bootstrap.min.css";
import "../styles/MyLayoutStyle.css";
const MyLayout = () => {
	return (
		<div>
			<Row className="navbar-text">
				<Col className="navbar-links">
					<Link to="/" className="text-decoration p-3">
						Home
					</Link>
					<Link to="/user" className="text-decoration p-3">
						User List
					</Link>
				</Col>
			</Row>
			<Row>
				<Outlet />
			</Row>
		</div>
	);
};

export default MyLayout;
