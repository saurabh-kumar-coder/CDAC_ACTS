const express = require("express");
const app = express();

app.get("/about", (req, res) => {
	console.log(req.query.name);
	return res.send("<H1>Hello " + req.query.name + "</H1>");
});

app.listen(5000, () => console.log("running server at port 5000"));
