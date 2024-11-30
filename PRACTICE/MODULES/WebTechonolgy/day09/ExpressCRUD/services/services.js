// const fetch = require("node-fetch")
// const fs = require('fs')
// const path = require('path')

async function fetchData(fs, path) {
    const dataPath = path.join(__dirname, "../dummy/dummyData.json");
    return new Promise((resolve, reject) => {
        fs.readFile(dataPath, "utf8", (err, data) => {
            if (err) {
                reject(err)
            } else {
                try {
                    const users = JSON.parse(data);
                    resolve(users)
                } catch (error) {
                    reject("parseError");
                }
            }
        })
    })
}

function addUser(user, fs, path) {
    const dataPath = path.join(__dirname, "../dummy/dummyData.json");
    try {
        fileData = fs.readFileSync(dataPath, "utf8");
        users = JSON.parse(fileData)
        userId = users[users.length - 1].id;
        console.log("user id ", userId);
        user.id = userId + 1;
        users.push(user);

        fs.writeFileSync(dataPath, JSON.stringify(users, null, 2))
        console.log("user added ");
        return true;
    } catch (error) {
        console.log("not added user " + error);
        return false;
    }
}

module.exports = { fetchData, addUser }
// const dataPath = path.join(__dirname, "../dummy/dummyData.json")
// const fileData = fs.readFile(dataPath, "utf8");
// const users = JSON.parse(fileData)
// return users;