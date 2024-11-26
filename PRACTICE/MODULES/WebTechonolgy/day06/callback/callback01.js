// case 1
/*
function dispatcher() {
	console.log("hello");
}

function callOne() {
	dispatcher();
}

function callTwo() {
	dispatcher();
}

callOne();
callTwo();
*/
// -------------------------------------------------------------

// case 2
/*
function dispatcher() {
	console.log("hello");
}

function callOne() {
	dispatcher();
}

function callTwo() {
	dispatcher();
}

callTwo();
callOne();
*/
// -------------------------------------------------------------
// case 3
/*
// show sum
function dispatcher(sum) {
	console.log(sum);
}
// manipulate data and send to dispatcher
function callOne(a, b) {
	sum = a + b;
	dispatcher(sum);
	return sum;
}
// call callOne
let res = callOne(5, 5);
// call dispatcher
dispatcher();
*/
// -------------------------------------------------------------
// case 4
/*
function dispatcher(sum) {
	console.log(sum);
}

function callOne(a, b) {
	sum = a + b;
	dispatcher(sum);
}

callOne(2, 4);
*/
// -------------------------------------------------------------
// case 5
/*
function dispatcher(sum) {
	console.log(sum);
}

function callOne(a, b, callback) {
	sum = a + b;
	callback(sum);
}

callOne(5, 5, dispatcher);
*/
// -------------------------------------------------------------
// case 6
/*
function callOne(a, b, callback) {
	sum = a + b;
	console.log("bye");
	callback(sum);
	console.log("bye");
}

callOne(4, 5, (sum) => {
	console.log("hello : " + sum);
});
*/

// -------------------------------------------------------
// case 7
/*
function callOne(a, b, callback) {
	sum = a + b;
	console.log("bye");
	setTimeout(() => callback(sum), 3000);
	console.log("bye");
}

callOne(4, 5, function callback(sum) {
	console.log("hello : " + sum);
	return sum;
});
*/
