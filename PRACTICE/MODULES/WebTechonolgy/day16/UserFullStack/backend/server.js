import express from "express"
import env from "./env/env"
import cors from "cors"
import { getUserDataService, addUserDataService, findUserByIdService, deleteUserByIdService, updateUserByIdService } from "./services/userServices.js"
const app = express();
app.use(cors({
    origin: env.REACT_URL
}))
app.use(express.json())
app.use(express.urlencoded({ extended: true }))
app
    .route("/user")
    // get all users
    .get((req, res) => {
        console.log("get called");

        getUserDataService()
            .then((result) => {
                res.send(result);
            }).catch((err) => {
                res.send(err);
            });
    })
    // add single user
    .post((req, res) => {
        let uname = req.body.uname
        let city = req.body.city
        let address = req.body.address
        addUserDataService(uname, city, address)
            .then((result) => {
                res.send(result);
            })
            .catch((err) => {
                res.send(err)
            })
    })

app
    .route("/user/:id")
    // find user by userId
    .get((req, res) => {
        let userId = req.params.id;
        findUserByIdService(userId)
            .then((result) => {
                res.send(result)
            })
            .catch((err) => {
                res.send(err);
            })
    })
    // update user
    .put((req, res) => {
        let userId = req.params.id;
        let uname = req.body.uname;
        let city = req.body.city;
        let address = req.body.address;
        let userDetails = { uname: uname, city: city, address: address }
        updateUserByIdService(userId, userDetails)
            .then((result) => {
                res.send(result);
            })
            .catch((error) => {
                res.send(error);
            })
    })
    // delete the particular user
    .delete((req, res) => {
        let userId = req.params.id;
        deleteUserByIdService(userId)
            .then((result) => {
                res.send(result);
            })
            .catch((error) => {
                console.log(error);
            })
    })

app.listen(env.SERVER_PORT, () => { console.log("LISTENING TO PORT") })