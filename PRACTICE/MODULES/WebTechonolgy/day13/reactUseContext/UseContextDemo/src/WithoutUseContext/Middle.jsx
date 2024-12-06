import Inner from "./Inner";

const Middle = (props) => {
	return (
		<div className="container">
			<div className="bg-success">
				<div>Middle : counter : {props.counter}</div>
				<div>This is middle component</div>
				<Inner counter={props.counter} />
				<div>This is middle component</div>
			</div>
		</div>
	);
};

export default Middle;
