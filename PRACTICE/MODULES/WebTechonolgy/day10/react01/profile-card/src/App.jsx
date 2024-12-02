import { useState } from "react";
import CardComponent from "./components/CardComponent";
import HeaderComponent from "./components/HeaderComponent";
import { useEffect } from "react";
function App() {
	const [users, setUsers] = useState([]);
	const [limit, setLimit] = useState(0);
	useEffect(() => {
		if (limit == 0) {
			return;
		}
		fetch(`https://dummyjson.com/users?limit=${limit}`).then(async (data) => {
			let ndata = await data.json();
			setUsers(ndata.users);
		});
	}, [limit]);

	return (
		<>
			<HeaderComponent setLimit={setLimit} />
			{users.map((element) => {
				return <CardComponent key={element.id} user={element} />;
			})}
		</>
	);
}

export default App;
