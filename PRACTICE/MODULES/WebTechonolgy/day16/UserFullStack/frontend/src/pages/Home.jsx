import { useEffect, useState } from "react";
import { Button, Col, Row, Table } from "react-bootstrap";

const Home = () => {
	const [data, setData] = useState([]);
	const [uname, setUname] = useState("");
	const [city, setCity] = useState("");
	const [address, setAddress] = useState("");
	const [updateOnPost, setUpdateOnPost] = useState(false);
	useEffect(() => {
		const getUserData = async () => {
			try {
				setUpdateOnPost(false);
				let response = await fetch("http://localhost:3000/user");
				if (!response.ok) throw new Error("Not Fetched");
				const result = await response.json();

				setData(result);
				console.log(result);
			} catch (error) {
				console.log(error);
			}
		};
		getUserData();
	}, [updateOnPost]);

	const addUser = () => {
		let newUser = { uname: uname, city: city, address: address };
		console.log(newUser);
		const addUser = async () => {
			try {
				const response = await fetch("http://localhost:3000/user", {
					method: "POST",
					headers: {
						"Content-Type": "application/json",
					},
					body: JSON.stringify(newUser),
				});

				if (!response) {
					throw new Error("Unable to add data.");
				}
				const result = await response.json();
				console.log(result);
				setUpdateOnPost(true);
			} catch (error) {
				console.log(error);
			}
		};

		addUser();
	};

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
								onChange={(e) => setUname(e.target.value)}
								placeholder="USERNAME"
							/>
						</Col>
					</Row>
					<Row className="px-5 pt-4">
						<Col>
							<input
								className="form-control"
								onChange={(e) => setCity(e.target.value)}
								type="text"
								placeholder="CITY"
							/>
						</Col>
					</Row>
					<Row className="px-5 pt-4">
						<Col>
							<input
								className="form-control"
								type="text"
								onChange={(e) => setAddress(e.target.value)}
								placeholder="ADDRESS"
							/>
						</Col>
					</Row>
					<Row className="px-5 pt-4">
						<Col>
							<Button onClick={addUser} className="form-control user-btn">
								ADD USER
							</Button>
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
									{data.length > 0 ? (
										data.map((user, idx) => {
											{
												return (
													<tr className="align-center" key={idx}>
														<td className="w-auto">{user.id}</td>
														<td className="w-auto">{user.uname}</td>
														<td className="w-auto">{user.city}</td>
														<td className="w-auto">{user.address}</td>
														<td className="w-auto">
															<Button id={user.id} className="user-btn">
																EDIT
															</Button>
															<span className="px-2"></span>
															<Button id={user.id} className="user-btn">
																DELETE
															</Button>
														</td>
													</tr>
												);
											}
										})
									) : (
										<tr>
											<td colSpan="5">No Data FOUND</td>
										</tr>
									)}
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