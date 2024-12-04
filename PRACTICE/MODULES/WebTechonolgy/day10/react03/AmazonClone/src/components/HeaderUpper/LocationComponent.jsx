import { faLocationDot } from "@fortawesome/free-solid-svg-icons";
import { FontAwesomeIcon } from "@fortawesome/react-fontawesome";
import { Col, Row } from "react-bootstrap";

const LocationComponent = () => {
	return (
		<div className="white-text padding-0">
			<Row>
				<Col xs={2} className="pt-4">
					<FontAwesomeIcon className="white-text" icon={faLocationDot} />
				</Col>
				<Col className="p-0" xs={8}>
					<Row className="m-0 p-0 fw-lighter">Deliver To</Row>
					<Row className="m-0 p-0 fw-bold">India</Row>
				</Col>
			</Row>
		</div>
	);
};

export default LocationComponent;

{
	/* <div id="" className="d-flex">
			<div>
				<FontAwesomeIcon className="white-text" icon={faLocationDot} />
			</div>
			<div className="white-text">Deliver To India</div>
		</div> */
}
