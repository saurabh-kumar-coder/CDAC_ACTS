import "react-bootstrap";
import Outer from "./WithoutUseContext/Outer";
import OuterWithContext from "./WithUseContext/Outer"
function App() {
	return (
		<>
			<h1>WithoutUseContext</h1>
			<Outer />
			<h1>WithUseContext</h1>
			<OuterWithContext />
		</>
	);
}

export default App;
