const mysql = require("mysql2")
const DATABASE = "wpt"
const TABLE = "user"
const con = mysql.createConnection({
    port: 3306,
    host: "localhost",
    user: "root",
    password: "tiger",
    database: DATABASE
});

con.connect((err) => {
    if (err) throw err;
    console.log("Connection Created");
})

let create_db = `create database if not exists ${DATABASE}`;

con.query(create_db, (err, res) => {
    if (err) throw err;
    console.log("Database created");
})

let use_db = `use ${DATABASE}`

con.query(use_db, (err, res) => {
    if (err) throw err;
    console.log(`using ${DATABASE}`);
})

let create_table = `create table if not exists ${TABLE} (
    id int auto_increment,
    uname varchar(20),
    address varchar(20),
    constraint pk_id primary key(id)
)`

con.query(create_table, (err, res) => {
    if (err) throw err;
    console.log("Table created");
});

module.exports = con;