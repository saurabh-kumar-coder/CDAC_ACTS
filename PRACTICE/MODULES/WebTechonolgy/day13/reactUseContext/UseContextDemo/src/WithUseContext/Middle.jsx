import InnerWithContext from "./Inner";

const Middle = () => {
	return (
		<div className="container">
			<div className="bg-success">
				<div>Middle : counter : Using useContext</div>
				<div>
					Lorem, ipsum dolor sit amet consectetur adipisicing elit. Laudantium,
					praesentium.
				</div>
				<InnerWithContext />
				<div>
					Lorem, ipsum dolor sit amet consectetur adipisicing elit. Laudantium,
					praesentium.
				</div>
			</div>
		</div>
	);
};

export default Middle;
