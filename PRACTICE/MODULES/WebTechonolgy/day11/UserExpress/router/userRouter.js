const express = require("express")
const router = express.Router()

router
    .route("/")
    .get((req, res) => {
        res.send("Hello");
    })
    .post((req, res) => {
        res.send({ message: "success", method: "POST" })
    })
    .put((req, res) => {
        res.send({ message: "success", method: "PUT" })
    })
    .delete((req, res) => {
        res.send({ message: "success", method: "DELETE" })
    })

module.exports = router;
