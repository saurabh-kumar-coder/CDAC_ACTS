import { StrictMode } from "react";
import { createRoot } from "react-dom/client";
import App from "./App.jsx";
import AddEventForm from "./components/AddEventForm.jsx";

createRoot(document.getElementById("root")).render(
	<StrictMode>
		<App />
		<AddEventForm />
	</StrictMode>
);
