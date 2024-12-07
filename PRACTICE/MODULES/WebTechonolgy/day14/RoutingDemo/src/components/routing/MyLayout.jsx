import React from "react";
import "react-bootstrap";
import "bootstrap/dist/css/bootstrap.min.css";
import { Col, Row } from "react-bootstrap";
import { Link, Outlet } from "react-router-dom";
const MyLayout = () => {
	return (
		<div>
			<Row>
				<Col>
					<Link className="fw-bolder" to="/">
						Home
					</Link>
				</Col>
				<Col>
					<Link to="/aboutus">About Us</Link>
				</Col>
				<Col>
					<Link to="/career">Career</Link>
				</Col>
			</Row>
			<Outlet />
		</div>
	);
};

export default MyLayout;
