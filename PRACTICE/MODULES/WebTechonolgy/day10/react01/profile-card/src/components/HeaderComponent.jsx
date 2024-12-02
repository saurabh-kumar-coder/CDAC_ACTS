import { useState } from "react";
import "../style/style.css";
function HeaderComponent({ setLimit }) {
	const [input, setInput] = useState("");
	function onBtnClick() {
		const limit = parseInt(input, 10);
		setLimit(limit);
	}
	return (
		<>
			<header className="header">Para Generator</header>
			<div className="container">
				<input
					className="iptxt"
					value={input}
					onChange={(e) => {
						setInput(e.target.value);
					}}
					type="text"
				/>
				<span className="space"></span>
				<button className="genbtn" onClick={onBtnClick}>
					generate
				</button>
			</div>
		</>
	);
}

export default HeaderComponent;
