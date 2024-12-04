const express = require("express")

const userRouter = require("./router/userRouter")

const app = express();

app.use(express.json())
app.use(express.urlencoded({ extended: true }))
app.use("/", userRouter)

app.listen(2000, () => { console.log("welcome users") })
