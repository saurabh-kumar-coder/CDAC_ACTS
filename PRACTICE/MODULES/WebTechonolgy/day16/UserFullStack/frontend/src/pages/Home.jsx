import { Button, Col, Row, Table } from "react-bootstrap";

const Home = () => {
	return (
		<div>
			<Row>
				<Col xs={6} className="pt-3">
					<Row>
						<Col>
							<div className="d-flex justify-content-center fw-bold h3">
								Add User
							</div>
						</Col>
					</Row>
					<Row className="px-5 pt-4">
						<Col>
							<input
								className="form-control"
								type="text"
								placeholder="USERNAME"
							/>
						</Col>
					</Row>
					<Row className="px-5 pt-4">
						<Col>
							<input className="form-control" type="text" placeholder="CITY" />
						</Col>
					</Row>
					<Row className="px-5 pt-4">
						<Col>
							<input
								className="form-control"
								type="text"
								placeholder="ADDRESS"
							/>
						</Col>
					</Row>
					<Row className="px-5 pt-4">
						<Col>
							<Button className="form-control user-btn">ADD USER</Button>
						</Col>
					</Row>
				</Col>
				<Col xs={6} className="pt-4">
					<Row>
						<Col>
							<div className="d-flex justify-content-center fw-bold h3">
								Show Users
							</div>
						</Col>
					</Row>
					<Row className="px-5 pt-3">
						<Col className="">
							<Table responsive>
								<thead>
									<tr className="align-center">
										<th className="w-auto">USER ID</th>
										<th className="w-auto">USERNAME</th>
										<th className="w-auto">CITY</th>
										<th className="w-auto">ADDRESS</th>
										<th className="w-auto">ACTION</th>
									</tr>
								</thead>
								<tbody>
									<tr className="align-center">
										<td className="w-auto">USER ID</td>
										<td className="w-auto">USERNAME</td>
										<td className="w-auto">CITY</td>
										<td className="w-auto">ADDRESS</td>
										<td className="w-auto">
											<Button className="user-btn">EDIT</Button>
											<span className="px-2"></span>
											<Button className="user-btn">DELETE</Button>
										</td>
									</tr>
									<tr className="align-center">
										<td className="w-auto">USER ID</td>
										<td className="w-auto">USERNAME</td>
										<td className="w-auto">CITY</td>
										<td className="w-auto">ADDRESS</td>
										<td className="w-auto">
											<Button className="user-btn">EDIT</Button>
											<span className="px-2"></span>
											<Button className="user-btn">DELETE</Button>
										</td>
									</tr>
								</tbody>
							</Table>
						</Col>
					</Row>
				</Col>
			</Row>
		</div>
	);
};

export default Home;
