import { Button, Col, Row } from "react-bootstrap";
import { Link, Outlet } from "react-router-dom";
import "bootstrap/dist/css/bootstrap.min.css";
const Navbar = () => {
	return (
		<div>
			<Row className="bg-secondary">
				<Col>
					<Button>
						<Link style={{ color: "white", textDecoration: "none" }} to="/">
							HOME
						</Link>
					</Button>
				</Col>
				<Col>
					<Button>
						<Link
							style={{ color: "white", textDecoration: "none" }}
							to="/aboutus"
						>
							About Us
						</Link>
					</Button>
				</Col>
				<Col>
					<Button>
						<Link
							style={{ color: "white", textDecoration: "none" }}
							to="/carrier"
						>
							Carrier
						</Link>
					</Button>
				</Col>
			</Row>
			<Row>
				<Outlet />
			</Row>
		</div>
	);
};

export default Navbar;
