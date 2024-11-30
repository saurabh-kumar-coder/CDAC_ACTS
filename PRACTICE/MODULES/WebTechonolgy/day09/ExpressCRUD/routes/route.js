const { fetchData, addUser } = require("../services/services")

function routing(app, fs, path) {

    app
        .route("/")
        .get(async (req, res) => {
            try {
                const users = await fetchData(fs, path);
                console.log("users : " + users);
                res.send(users)
                // res.send("Hello World!");
            } catch (error) {
                console.error("Fetching error " + error);

            }
        })
        .post((req, res) => {
            user = req.body;
            try {
                isAdded = addUser(user, fs, path);
                res.send("post data" + isAdded)
            } catch (error) {
                console.log("adding error" + error);
            }
        })

    app
        .route("/users")
        .get(async (req, res) => {
            const users = await fetchData(fs, path);
            res.send(users);
        })

    app
        .route("/user/:id")
        .get(async (req, res) => {
            try {
                const id = req.params.id;
                const users = await fetchData(fs, path)
                getUser = users.forEach(element => {
                    if (element.id == id) {
                        res.send(element)
                    }
                });
            } catch (error) {
                console.error("Fetching error " + error);
            }
        })
        .put((req, res) => {
            console.log("user to be updated.");
        })
        .delete((req, res) => {
            console.log("user to be deleted");
        })

}

module.exports = routing