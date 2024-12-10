import { BrowserRouter, Route, Routes } from "react-router-dom";
import Home from "../pages/Home";
import MyLayout from "../pages/MyLayout";
import UserList from "../pages/UserList";

const Routing = () => {
	return (
		<div>
			<BrowserRouter>
				<Routes>
					<Route path="/" element={<MyLayout />}>
						<Route index element={<Home />} />
						<Route path="/user" element={<UserList />} />
					</Route>
				</Routes>
			</BrowserRouter>
		</div>
	);
};

export default Routing;
