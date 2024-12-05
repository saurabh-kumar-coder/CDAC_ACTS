const express = require("express")

const userRouter = require("./router/userRouter")
const userHtmlRouter = require("./router/userHtmlRouter");
const userFormRouter = require("./router/userFormRouter");
const userDataRouter = require("./router/userDataRouter");
const app = express();
app.set("view engine", "ejs")
app.use(express.json())
app.use(express.urlencoded({ extended: true }))
app.use("/user", userRouter)
app.use("/userhtml", userHtmlRouter)
app.use("/userrtr", userFormRouter)
app.use("/userdata", userDataRouter)
app.listen(2000, () => { console.log("welcome users") })
