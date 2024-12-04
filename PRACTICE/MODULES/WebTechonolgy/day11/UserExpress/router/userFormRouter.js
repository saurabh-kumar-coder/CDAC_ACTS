const express = require("express")
const userFormRouter = express.Router()

userFormRouter
    .route("/")
    .get((req, res) => {
        res.render("./userForm/form");
    })
    .post((req, res) => {
        res.send("Hello Bacho");
    })

module.exports = userFormRouter;