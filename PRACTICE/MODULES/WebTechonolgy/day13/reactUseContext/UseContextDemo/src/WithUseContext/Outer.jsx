import "react-bootstrap/dist/react-bootstrap.min.js";
import { Button } from "react-bootstrap";
import "bootstrap/dist/css/bootstrap.min.css";
import MiddleWithContext from "./Middle";
import { createContext, useState } from "react";
export const userContext = createContext();
const Outer = () => {
	const [counter, setCounter] = useState(0);

	const incrementCounter = () => {
		let nctr = counter;
		setCounter(++nctr);
	};
	const decrementCounter = () => {
		let nctr = counter;
		setCounter(--nctr);
	};
	return (
		<>
			<div className="container">
				<div className="bg-primary h-25">
					Outer : Counter : {counter}
					<div>
						Lorem ipsum dolor sit, amet consectetur adipisicing elit. Iure,
						incidunt!
					</div>
					<userContext.Provider value={counter}>
						<MiddleWithContext />
					</userContext.Provider>
					<div>
						Lorem ipsum dolor sit, amet consectetur adipisicing elit. Iure,
						incidunt!
					</div>
				</div>
				<div className="pt-2">
					<Button variant="primary" onClick={incrementCounter}>
						Increment counter
					</Button>
					<span className="px-2"></span>
					<Button variant="primary" onClick={decrementCounter}>
						decrement counter
					</Button>
				</div>
			</div>
		</>
	);
};

export default Outer;