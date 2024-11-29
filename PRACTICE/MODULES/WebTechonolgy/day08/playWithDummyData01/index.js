const express = require("express");
const data = require("./dummyData.json");
const app = express();

app.get("/todos", async (req, res) => {
	const list = await fetch("https://jsonplaceholder.typicode.com/todos/1");
	data = await list.json();
	res.json(data);
});

app.get("/api/users", (req, res) => {
	res.json(data);
});

app.get("/users", (req, res) => {
	const html = `
        <ul>
            ${data.map((d) => `<li> ${d.title}</li>`).join("")}
        </ul>
    `;
	res.send(html);
});

app.get("/api/users/:id", (req, res) => {
	const id = Number(req.params.id);
	const posts = data.find((d) => d.id === id);
	res.json(posts);
});

app.post("/api/users", () => {});

app.patch("/api/users/:id", () => {});

app.delete("/api/users/:id", () => {});

app.listen(5000, () => console.log("server running"));
