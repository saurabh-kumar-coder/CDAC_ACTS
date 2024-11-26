// getting date time using new Date()
function getDate() {
	let x = new Date();
	document.getElementById("date").innerText = x.toLocaleDateString();
	document.getElementById("time").innerText = x.toLocaleTimeString();
}

function getDateTime() {
	setInterval(getDate, 1000);
}

// using event listener
// document.addEventListener("DOMContentLoaded", () => {
// 	let x = new Date();
// 	document.getElementById("date").innerText = x.toLocaleDateString();
// 	document.getElementById("time").innerText = x.toLocaleTimeString();
// });

// change heading to "welcome to the shop" when onmouseover and onmouseout getback the original data

function changeHeader(event, val) {
	element = document.getElementById(val);

	if (event.type === "mouseover") {
		element.setAttribute("data-original", element.innerHTML);
		element.innerHTML = `<h1 style="margin: 0%">Welcome</h1> to the shop`;
	} else if (event.type === "mouseout") {
		element.innerHTML = element.getAttribute("data-original");
	}
}

// on click of nav bar button add different colors to the nav bar background.
