
async function fetchData(global) {
    const dataPath = global.path.join(__dirname, "../dummy/dummyData.json");
    return new Promise((resolve, reject) => {
        global.fs.readFile(dataPath, "utf8", (err, data) => {
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

function addUser(user, global) {
    const dataPath = global.path.join(__dirname, "../dummy/dummyData.json");
    try {
        fileData = global.fs.readFileSync(dataPath, "utf8");
        users = JSON.parse(fileData)
        userId = users[users.length - 1].id;
        console.log("user id ", userId);
        user.id = userId + 1;
        users.push(user);

        global.fs.writeFileSync(dataPath, JSON.stringify(users, null, 2))
        console.log("user added ");
        return true;
    } catch (error) {
        console.log("not added user " + error);
        return false;
    }
}

module.exports = { fetchData, addUser }
