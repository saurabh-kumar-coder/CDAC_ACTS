import Inner from "./Inner";

const Middle = (props) => {
	return (
		<div className="container">
			<div className="bg-success">
				<div>Middle : counter : {props.counter}</div>
				<div>
					Lorem, ipsum dolor sit amet consectetur adipisicing elit. Laudantium,
					praesentium.
				</div>
				<Inner counter={props.counter} />
				<div>
					Lorem, ipsum dolor sit amet consectetur adipisicing elit. Laudantium,
					praesentium.
				</div>
			</div>
		</div>
	);
};

export default Middle;
