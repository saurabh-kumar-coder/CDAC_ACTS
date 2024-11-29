const express = require("express");
const users = require("./dummyData.json");
const fs = require("fs")

const app = express();

app.use(express.urlencoded({ extended: false }));

app.get("/users", (req, res) => {
    const html = `
            <ul>   
                ${users
            .map(
                (user) =>
                    `
                                <li>
                                    ${user.title} 
                                </li>
                            `).join("")}
            </ul>
        `;
    res.send(html);
});

app.get("/api/users", (req, res) => {
    res.json(users);
})

app.post("/api/users", (req, res) => {
    const body = req.body;
    console.log("body", body);
    users.push({ ...body, id: users.length + 1 });
    fs.writeFile("./dummyData.json", JSON.stringify(users), (err, data) => {
        return res.json({ status: "success", id: users.length })
    });
})

app.route("/api/users/:id").get((req, res) => {
    const id = Number(req.params.id);
    const user = users.find(user => user.id === id);
    res.json(user);
}).patch(() => { }).delete(() => { })

app.listen(5000, () => console.log("server is running on port 5000"));
