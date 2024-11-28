nlist = [];
function showData(){
    req = new XMLHttpRequest();
    req.open("GET", "https://jsonplaceholder.typicode.com/todos?_limit=15;");
    req.onreadystatechange = function () {
        if(req.readyState == 4 && req.status == 200) {
            d = req.responseText;
            d = JSON.parse(d);
            displayData(d);
        }        
    }
    req.send();
}

function displayData(d){
    $("#all-data").html("");
    
    d.forEach(element => {
        $("#all-data").append(`<div><span>${element.id} ${element.userId}${element.title} ${element.completed}</span></div>`);
    });
}