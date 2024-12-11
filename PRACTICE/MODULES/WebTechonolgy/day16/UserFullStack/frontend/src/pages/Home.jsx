import axios from "axios";
import { useEffect, useState } from "react";
import { Button, Col, Row, Table } from "react-bootstrap";
import "../styles/MyLayoutStyle.css";
const Home = () => {
	const [data, setData] = useState([]);
	const [id, setId] = useState(0);
	const [uname, setUname] = useState("");
	const [city, setCity] = useState("");
	const [address, setAddress] = useState("");
	// const [updateOnPost, setUpdateOnPost] = useState(false);
	const [flagToGetData, setFlagToGetData] = useState(false);
	const [edit, setEdit] = useState(false);
	// useEffect(() => {
	// 	const getUserData = async () => {
	// 		try {
	// 			setUpdateOnPost(false);
	// 			let response = await fetch("http://localhost:3000/user");
	// 			if (!response.ok) throw new Error("Not Fetched");
	// 			const result = await response.json();

	// 			setData(result);
	// 			console.log(result);
	// 		} catch (error) {
	// 			console.log(error);
	// 		}
	// 	};
	// 	getUserData();
	// }, [updateOnPost]);

	useEffect(() => {
		const getUserData = async () => {
			try {
				setFlagToGetData(false);
				let response = await axios.get("http://localhost:3000/user");
				if (!response) throw new Error("Data Not Fetched...");
				const result = response.data;
				setData(result);
			} catch (error) {
				console.log(error);
			}
		};
		getUserData();
	}, [flagToGetData]);

	// const addUser = () => {
	// 	let newUser = { uname: uname, city: city, address: address };
	// 	console.log(newUser);
	// 	const addUser = async () => {
	// 		try {
	// 			const response = await fetch("http://localhost:3000/user", {
	// 				method: "POST",
	// 				headers: {
	// 					"Content-Type": "application/json",
	// 				},
	// 				body: JSON.stringify(newUser),
	// 			});

	// 			if (!response) {
	// 				throw new Error("Unable to add data.");
	// 			}
	// 			const result = await response.json();
	// 			console.log(result);
	// 			setUpdateOnPost(true);
	// 		} catch (error) {
	// 			console.log(error);
	// 		}
	// 	};

	// 	addUser();
	// 	clearInputField();
	// };

	const addUser = () => {
		if (uname === "" || city === "" || address === "") {
			return;
		}
		const newUser = { uname: uname, city: city, address: address };
		const addUser = async () => {
			try {
				const response = await axios.post(
					"http://localhost:3000/user",
					newUser,
					{
						headers: {
							"Content-Type": "application/json",
						},
					}
				);
				if (response.status === 200 || response.status === 201) {
					setFlagToGetData(true);
				} else {
					clearInputField();
					throw new Error("Unable to add data");
				}
			} catch (error) {
				console.log(error);
			}
		};
		setFlagToGetData(true);
		addUser();
		clearInputField();
	};

	const clearInputField = () => {
		setAddress("");
		setCity("");
		setUname("");
	};

	const goToPreviousState = () => {
		clearInputField();
		setEdit(false);
	};

	const editUser = async () => {
		if (uname === "" || city === "" || address === "") {
			setEdit(false);
			clearInputField();
			return;
		}
		const updatedUser = { id: id, uname: uname, city: city, address: address };
		console.log(updatedUser);

		let response = await axios.put(
			`http://localhost:3000/user/${id}`,
			updatedUser
		);
		if (response.status === 200 || response.status === 201) {
			setEdit(false);
			setFlagToGetData(true);
			clearInputField();
		} else {
			throw new Error("data not updated.");
		}
	};

	const getUserById = (e) => {
		setEdit(true);
		let userId = e.target.id;
		setId(userId);
		const getUserById = async () => {
			let response = await axios.get(`http://localhost:3000/user/${userId}`);
			if (response.status !== 200) throw new Error("Data not Found");
			else {
				let user = response.data;
				user = user[0];
				console.log(user);
				setUname(user.uname);
				setCity(user.city);
				setAddress(user.address);
			}
		};
		getUserById();
	};

	const deleteUser = (e) => {
		let currentUser = e.target.id;
		console.log(currentUser);

		const deleteUser = async () => {
			let response = await axios.delete(
				`http://localhost:3000/user/${currentUser}`
			);
			if (!response) {
				throw new Error("user not deleted");
			}
			setFlagToGetData(true);
		};
		setEdit(false);
		clearInputField();
		deleteUser();
	};

	return (
		<div>
			<Row className="w-100">
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
								value={uname}
								placeholder="USERNAME"
								required
							/>
						</Col>
					</Row>
					<Row className="px-5 pt-4">
						<Col>
							<input
								className="form-control"
								onChange={(e) => setCity(e.target.value)}
								type="text"
								value={city}
								placeholder="CITY"
								required
							/>
						</Col>
					</Row>
					<Row className="px-5 pt-4">
						<Col>
							<input
								className="form-control"
								type="text"
								onChange={(e) => setAddress(e.target.value)}
								value={address}
								placeholder="ADDRESS"
								required
							/>
						</Col>
					</Row>
					<Row className="px-5 pt-4">
						<Col>
							{edit === false ? (
								<Button onClick={addUser} className="form-control user-btn">
									ADD USER
								</Button>
							) : (
								<div className="d-flex justify-content-center">
									<Button
										onClick={goToPreviousState}
										className="form-control user-btn"
									>
										cancel
									</Button>
									<span className="px-2"></span>
									<Button onClick={editUser} className="form-control user-btn">
										save User
									</Button>
								</div>
							)}
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
						<Col>
							<div className="table-container">
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
																<Button
																	id={user.id}
																	className="user-btn"
																	onClick={getUserById}
																>
																	EDIT
																</Button>
																<span className="px-2"></span>
																<Button
																	id={user.id}
																	className="user-btn"
																	onClick={deleteUser}
																>
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
							</div>
						</Col>
					</Row>
				</Col>
			</Row>
		</div>
	);
};

export default Home;
