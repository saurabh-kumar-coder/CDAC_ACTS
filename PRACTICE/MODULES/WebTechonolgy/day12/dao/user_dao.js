// import con from "../utility/db_connection";
const con = require("../utility/db_connection")
console.log("inside dao");

const addUserDetails = ({ uname, address }) => {
    let addUser = `insert into user (uname, address) values (?, ?)`;
    con.query(addUser, [uname, address], (err, res) => {
        if (err) throw err;
        console.log("User Inserted");
    })
}

const getUserByUserId = (userid) => {
    return new Promise((resolve, reject) => {
        let getUser = `select * from user where id = ?`

        con.query(getUser, [userid], (err, res) => {
            if (err)
                reject(err)
            else
                resolve(res);
        })
    })
}

module.exports = { addUserDetails, getUserByUserId }