import { useContext } from "react";
import { userContext } from "./Outer";

const Inner = (props) => {
	const counter = useContext(userContext);
	return (
		<div className="container">
			<div className="bg-danger">
				<div>
					Lorem, ipsum dolor sit amet consectetur adipisicing elit. Repellat
					beatae
				</div>
				<div className="d-flex justify-content-center">
					Inner : counter : {counter}
				</div>
				<div>
					Lorem, ipsum dolor sit amet consectetur adipisicing elit. Repellat
					beatae
				</div>
			</div>
		</div>
	);
};
export default Inner;
