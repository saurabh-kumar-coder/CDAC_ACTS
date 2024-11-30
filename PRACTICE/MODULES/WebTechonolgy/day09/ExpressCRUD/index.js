const express = require("express")
const fs = require("fs")
const path = require('path')
const constants = require("./routes/route.js")
console.log("hello");

const app = express();
app.use(express.urlencoded({ extended: true }));
app.use(express.json());
constants(app, fs, path);

app.listen(5000, () => console.log("Listening"))