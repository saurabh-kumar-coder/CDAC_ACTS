function getName() {
    fname = new XMLHttpRequest();
    console.log(fname.readyState);
    fname.open("GET", "data.json");
    console.log(fname.readyState);
    fname.onreadystatechange = function () {
        console.log(fname.readyState);
        if(fname.readyState == 4) {
            let data = JSON.parse(fname.responseText);            
            cName = data.fname;
            $("#fname").text(cName);
        }
    }
    fname.send();
}