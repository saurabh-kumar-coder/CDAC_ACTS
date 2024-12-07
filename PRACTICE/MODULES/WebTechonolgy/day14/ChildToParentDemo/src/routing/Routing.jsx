import { BrowserRouter, Route, Routes } from "react-router-dom";
import Home from "./Home";
import AboutUs from "./AboutUs";
import Carrier from "./Carrier";
import Navbar from "./Navbar";

export const Routing = () => {
	return (
		<>
			<BrowserRouter>
				<Routes>
					<Route path="/" element={<Navbar />}>
						<Route index element={<Home />} />
						<Route path="/aboutus" element={<AboutUs />} />
						<Route path="/carrier" element={<Carrier />} />
					</Route>
				</Routes>
			</BrowserRouter>
		</>
	);
};
