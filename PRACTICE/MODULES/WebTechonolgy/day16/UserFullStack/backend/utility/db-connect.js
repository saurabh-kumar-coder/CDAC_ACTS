import mysql from "mysql2"
import env from "../env/env"

const conn = mysql.createConnection({
    host: env.DB_HOST,
    user: env.DB_USER,
    password: env.DB_PASSWORD,
    database: env.DB_DATABASE
})

conn.connect((err) => {
    if (err) {
        console.log(err);
    } else {
        // console.log("connection created");
    }
})

const database_creation = `create database if not exists ${env.DB_DATABASE}`

conn.query(database_creation, (err) => {
    if (err) {
        console.log(err);
    } else {
        // console.log("DATABASE CREATED");
    }
})

const use_database = `use ${env.DB_DATABASE}`;

conn.query(use_database, (err) => {
    if (err)
        throw err;
    else {
        // console.log(`USING DATABASE ${env.DB_DATABASE}`);
    }
})

const create_table = `
    create table if not exists wpt 
    (
        id int auto_increment,
        uname varchar(20),
        city varchar(20),
        address varchar(30),
        constraint pk_key primary key(id)
    )
    `;

conn.query(create_table, (err) => {
    if (err)
        throw err;
    else {
        // console.log("TABLE CREATED");
    }
});

export default conn;