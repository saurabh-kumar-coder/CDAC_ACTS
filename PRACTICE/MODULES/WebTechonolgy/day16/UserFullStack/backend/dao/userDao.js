import conn from "../utility/db-connect.js"

const getUserData = () => {
    const getUser = `SELECT * FROM WPT`;
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
    const addUser = `INSERT INTO WPT (uname, city, address) values (?, ?, ?)`
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
    const findUser = `SELECT * FROM WPT WHERE ID = ?`;
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

    const updateUser = `update WPT set uname = ?, city = ?, address = ? where id = ?`;
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
    const deleteUser = `delete from WPT where id = ?`;
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

console.log("in Dao file");

export { getUserData, addUserData, findUserById, deleteUserById, updateUserById }