const Inner = (props) => {
	return (
		<div className="container">
			<div className="bg-danger">
				<div>
					Lorem, ipsum dolor sit amet consectetur adipisicing elit. Repellat
					beatae
				</div>
				<div className="d-flex justify-content-center">
					Inner : counter : {props.counter}
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
