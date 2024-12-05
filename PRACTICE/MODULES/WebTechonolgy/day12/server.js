const express = require("express")
const { addUserService, getUserByIdService } = require("./service/user_service")
const app = express();
app.use(express.json())

app.post("/newuser", (req, res) => {
    let _uname = req.body.uname;
    let _address = req.body.address;
    console.log(_uname + " -> " + _address);
    addUserService(_uname, _address);
    res.send("Added user")
})

app.get("/user/:id", (req, res) => {
    let userid = req.params.id;

    async function display() {
        try {
            let result = await getUserByIdService(userid);
            res.send(result);
        } catch (error) {
            console.log(error);
        }
    }
    display()
})

app.listen(5000, () => { console.log("server started") })