import conn from "../utility/db-connect.js"
import env from "../env/env"
const getUserData = () => {
    const getUser = `SELECT * FROM ${env.DB_TABLE}`;
    return new Promise((resolve, reject) => {
        conn.query(getUser, (err, response) => {
            try {
                console.log(response);
                resolve(response);
            } catch (err) {
                console.log(err);
            }
        })
    })
}

const addUserData = ({ uname, city, address }) => {
    const addUser = `INSERT INTO ${env.DB_TABLE} (uname, city, address) values (?, ?, ?)`
    return new Promise((resolve, reject) => {
        conn.query(addUser, [uname, city, address], (err, response) => {
            try {
                resolve(response)
            } catch (error) {
                console.log(error);
            }
        })
    })
}

const findUserById = (userId) => {
    const findUser = `SELECT * FROM ${env.DB_TABLE} WHERE ID = ?`;
    return new Promise((resolve, reject) => {
        conn.query(findUser, userId, (err, response) => {
            try {
                resolve(response)
            } catch (error) {
                console.log(error);
            }
        })
    })
}

const updateUserById = (userId, userDetails) => {

    const updateUser = `update ${env.DB_TABLE} set uname = ?, city = ?, address = ? where id = ?`;
    return new Promise((resolve, reject) => {
        conn.query(updateUser, [userDetails.uname, userDetails.city, userDetails.address, userId], (err, response) => {
            try {
                resolve(response)
            } catch (error) {
                console.log(error);
            }
        })
    })
}

const deleteUserById = (userId) => {
    const deleteUser = `delete from ${env.DB_TABLE} where id = ?`;
    return new Promise((resolve, reject) => {
        conn.query(deleteUser, userId, (err, response) => {
            try {
                resolve(response)
            } catch (error) {
                console.log(error);
            }
        })
    })
}

export { getUserData, addUserData, findUserById, deleteUserById, updateUserById }