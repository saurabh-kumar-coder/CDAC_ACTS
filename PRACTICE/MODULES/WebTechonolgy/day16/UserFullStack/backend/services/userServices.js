import { getUserData, addUserData, findUserById, deleteUserById, updateUserById } from "../dao/userDao.js"
const getUserDataService = () => {
    return getUserData();
}

const addUserDataService = (uname, city, address) => {
    let manipulatedUser = { uname: uname, city: city, address: address }
    return addUserData(manipulatedUser);
}

const findUserByIdService = (userId) => {
    return findUserById(userId);
}

const deleteUserByIdService = (userId) => {
    return deleteUserById(userId)
}

const updateUserByIdService = (userId, userDetails) => {
    return updateUserById(userId, userDetails);
}
export { getUserDataService, addUserDataService, findUserByIdService, deleteUserByIdService, updateUserByIdService }