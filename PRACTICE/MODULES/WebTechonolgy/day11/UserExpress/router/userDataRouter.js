const e = require("express");
const express = require("express")
const userDataRouter = express.Router()

userDataRouter
    .route("/")
    .get((req, res) => {
        res.render("./DummyDataUser/UserForm", {
            id: "",
            first_name: "",
            last_name: "",
            email: "",
            gender: ""
        })
    })
    .post((req, res) => {
        const { id, first_name, last_name, email, gender } = req.body;
        console.log(id, first_name, last_name, email, gender);

        res.render("./DummyDataUser/ResultPage", {
            id,
            first_name,
            last_name,
            email,
            gender
        })
    })

userDataRouter
    .route("/result")
    .get((req, res) => {
        // Handle any default rendering logic
        res.send("hello")
    });

module.exports = userDataRouter