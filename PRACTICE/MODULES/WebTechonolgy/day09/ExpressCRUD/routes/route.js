const { fetchData, addUser } = require("../services/services")

function routing(global) {
    app = global.app;
    app
        .route("/")
        .get(async (req, res) => {
            try {
                const users = await fetchData(global);
                res.send(users)
            } catch (error) {
                console.error("Fetching error " + error);
            }
        })
        .post((req, res) => {
            user = req.body;
            try {
                isAdded = addUser(user, global);
                res.send("post data" + isAdded)
            } catch (error) {
                console.log("adding error" + error);
            }
        })

    app
        .route("/users")
        .get(async (req, res) => {
            const users = await fetchData(global);
            res.send(users);
        })

    app
        .route("/user/:id")
        .get(async (req, res) => {
            try {
                const id = req.params.id;
                const users = await fetchData(global)
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