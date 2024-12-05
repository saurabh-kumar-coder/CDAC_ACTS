const { addUserDetails, getUserByUserId } = require("../dao/user_dao")

const addUserService = (uname, address) => {
    console.log("service called");
    console.log(uname + " -> " + address);

    let n_uname = uname.toUpperCase();
    let n_address = address.toUpperCase();
    nUser = { uname: n_uname, address: n_address }
    addUserDetails(nUser);
}

const getUserByIdService = (userid) => {
    return getUserByUserId(userid)
}

module.exports = { addUserService, getUserByIdService }