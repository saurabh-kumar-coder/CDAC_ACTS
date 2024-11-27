/*
empData = [
    {
        id: 1, 
        fname: "Saurabh", 
        city: "Delhi"
    },
    {
        id: 2, 
        fname: "Saloni", 
        city: "Pune"
    }
];

*/
empData = [];

class Employee {
    id;
    fname;
    city;
    Employee(id, fname, city) {
        this.id = id;
        this.fname = fname;
        this.city = city;
    }
}

function getCountOfEmployee() {
    if (empData.length === 0) {
        $("#emp-cnt").text("0");
        return;
    }
    $("#emp-cnt").text(empData.length);
}

window.onload = () => {
    $("#id-null").hide();
    $("#already-exists").hide();
    displayTable(empData);
    getCountOfEmployee();
};

function showAlreadyExists() {
    $("#already-exists").show();
    setTimeout(() => {
        $("#already-exists").hide();
    }, 2000);
}

function idNull() {
    $("#id-null").show();
    setTimeout(() => {
        $("#id-null").hide();
    }, 2000);
    clearInputTag();
}

function addEmployee() {
    let cid = $("#id").val();
    let cfname = $("#fname").val();
    let ccity = $("#city").val();
    if (cid === "") {
        idNull();
        return
    }
    e1 = { id: cid, fname: cfname, city: ccity };
    isAvail = checkIfIdAlreadyExists(cid, empData);
    if (isAvail) {
        showAlreadyExists()
        clearInputTag();
        return;
    }
    empData.push(e1);

    getCountOfEmployee();
    clearInputTag();
}

function clearInputTag() {
    $("#id").val("");
    $("#fname").val("");
    $("#city").val("");
}

function displayTableData() {
    $("#tbody").empty();
    displayTable(empData);
}

function displayTable(empData) {
    for (index in empData) {
        let emp = empData[index];
        $("#tbody").append(`
            <tr id="tr-${emp.id}">
                <td class="border border-slate-600">${emp.id}</td>
                <td class="border border-slate-600">${emp.fname}</td>
                <td class="border border-slate-600">${emp.city}</td>
                <td class="border border-slate-600">
                        <button class="rounded-xl border-solid border-2 border-red-300" 
                        type="button" 
                        id='${emp.id}'
                        onclick="deleteCurrentEmp(${emp.id})" 
                        >Delete</button></td>
            </tr>    
        `);
    }
}

checkIfIdAlreadyExists = function (cid, empData) {
    for (let idx in empData) {
        let emp = empData[idx];
        if (emp.id == cid) {
            return true;
        }
    }
    return false;
};

function deleteCurrentEmp(empId) {
    let id = empId.id;
    for (let idx in empData) {
        let emp = empData[idx];
        if (id == emp.id) {
            empData.splice(idx, 1);
            break;
        }
    }
    getCountOfEmployee();
    displayTableData();
}
