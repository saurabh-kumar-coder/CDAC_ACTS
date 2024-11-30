const express = require("express")
const path = require("path")
const app = express()

app
    .route("/")
    .get((req, res) => {
        // res.send("Hello Home Page GET")
        res.sendFile(path.join(__dirname, '../html', 'home.html'));
    })
    .post((req, res) => {
        res.json("Hello Home Page POST")
    })

app.get("/user", (req, res) => {
    query = req.query;
    console.log(query.name);
    res.send(`/user called ${query.name}`);
})

app.get("/user/:id", (req, res) => {
    console.log(req.params.id)
    res.send("/user/:id called")
})


app.listen(2000, () => console.log("server up"))