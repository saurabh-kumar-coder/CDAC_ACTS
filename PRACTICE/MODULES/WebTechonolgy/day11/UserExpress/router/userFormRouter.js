const express = require("express")
const userFormRouter = express.Router()

userFormRouter
    .route("/")
    .get((req, res) => {
        res.render("", "");
    })
    .post((req, res) => {
        res.render("")
    })

module.exports = userFormRouter;