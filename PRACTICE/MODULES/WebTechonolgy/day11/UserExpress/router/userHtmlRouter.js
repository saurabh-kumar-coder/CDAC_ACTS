const express = require("express")
const userHtmlRouter = express.Router();

userHtmlRouter
    .route("/")
    .get((req, res) => {
        res.render("index", { userlist: "SAURABH" })
    })
    .post((req, res) => {
        res.render("index", { userlist: "KUMAR" })
    })

module.exports = userHtmlRouter;