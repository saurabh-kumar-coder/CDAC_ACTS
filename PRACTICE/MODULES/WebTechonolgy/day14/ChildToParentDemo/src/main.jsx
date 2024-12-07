import { StrictMode } from "react";
import { createRoot } from "react-dom/client";
// import App from "./App.jsx";
import { Routing } from "./routing/Routing.jsx";

createRoot(document.getElementById("root")).render(
	<StrictMode>
		<Routing />
		{/* <App /> */}
	</StrictMode>
);
