/*
1. Simple Arithmetic Callback
Write a function performOperation(a, b, callback) that takes two numbers and a callback. Use the callback to perform different arithmetic operations like addition, subtraction, multiplication, and division.
example : 
performOperation(10, 5, (result) => {
    console.log("The sum is:", result);
});
*/

// case 1
/*
function performOperation(a, b, callback) {
	setTimeout(() => {
		let sum = a + b;
		callback("sum is : " + sum);
	}, 2000);
	setTimeout(() => {
		let sub = a - b;
		callback("sub is : " + sub);
	}, 1000);
	setTimeout(() => {
		let mul = a * b;
		callback("mul is : " + mul);
	}, 3000);
	setTimeout(() => {
		let div = a / b;
		callback("div is : " + div);
	}, 2000);
}

performOperation(9, 7, (result) => {
	console.log(result);
});
*/

// ------------------------------- OR --------------------------------------------

// case 2 callback with 2 args
/*
function performOperation01(a, b, callback) {
	let sum = a + b;
	callback("sum is : ", sum);

	let sub = a - b;
	callback("sub is : ", sub);

	let mul = a * b;
	callback("mul is : ", mul);

	let div = a / b;
	callback("div is : ", div);
}

performOperation01(9, 7, (text, result) => {
	console.log(text + result);
});
*/

// ----------------------------------------- OR -----------------------------------------

// case 3 setTimeout inside setTimeout
/*
function performOperation03(a, b, callback) {
	setTimeout(() => {
		let sum = a + b;
		callback(sum);

		setTimeout(() => {
			let sub = a - b;
			callback(sub);

			setTimeout(() => {
				let mul = a * b;
				callback(mul);

				setTimeout(() => {
					let div = a / b;
					callback(div);
				}, 2000);
			}, 2000);
		}, 2000);
	}, 2000);
}

performOperation03(9, 7, (res) => {
	console.log(res);
});
*/

// ===========================================================================================================

/*
2. Delayed Greeting
Create a function delayedGreeting(name, delay, callback) that takes a name, a delay in milliseconds, and a callback. Use the callback to log a greeting message like Hello, <name>! after the specified delay.

Example:

delayedGreeting("Alice", 2000, (message) => {
    console.log(message);
});
*/

// case 1
/*
function delayedGreeting(name, delay, callback) {
	setTimeout(() => {
		let msg = "Hello " + name + "!";
		callback(msg);
	}, delay);
}

delayedGreeting("Alice", 2000, (message) => {
	console.log(message);
});
*/

// ===========================================================================================================

/*
3. Filter Array
Write a function filterArray(arr, callback) that takes an array and a callback function. Use the callback to filter out elements based on a condition (e.g., keep only even numbers).

Example:

filterArray([1, 2, 3, 4, 5, 6], (filteredArr) => {
    console.log(filteredArr); // Should print: [2, 4, 6]
});
*/

// case 1
/*
function filterArray(fa, callback) {
	setTimeout(() => {
		let nfa = [];
		fa.forEach((e) => {
			if (e % 2 == 0) {
				nfa.push(e);
			}
		});
		callback(nfa);
	}, 3000);
}
filterArray([1, 2, 3, 4, 5, 6], (filteredArray) => {
	console.log(filteredArray);
});
*/

// ===========================================================================================================

/*4. Simulated API Request
Create a function fetchData(callback) that simulates fetching data from a server using setTimeout. After 2 seconds, pass an array of user data (e.g., ["Alice", "Bob", "Charlie"]) to the callback.

Example:

fetchData((users) => {
    console.log("Fetched users:", users);
});
*/

/*



*/

// ===========================================================================================================

/*
5. File Processing
Write a function processFile(fileName, callback) that simulates reading a file (use setTimeout to mimic a delay). The callback should log a message like File <fileName> processed!.

Example:
processFile("data.txt", (message) => {
    console.log(message);
});

*/
// case 1
/*
function processFile(fileName, callback) {
	// Simulate file processing with a 2-second delay
	setTimeout(() => {
		// Create a message indicating the file has been processed
		const message = `File ${fileName} processed!`;

		// Call the callback function with the message
		callback(message);
	}, 2000); // 2000ms = 2 seconds delay to simulate processing time
}

// Using the processFile function
processFile("data.txt", (message) => {
	console.log(message);
});
*/

// =================================================================================================

/*
Bonus Challenge:
Combine callbacks: Write a function calculateAndGreet(a, b, operationCallback, greetingCallback) that first performs an arithmetic operation on a and b using operationCallback, and then passes the result to greetingCallback.

Example:

calculateAndGreet(
    5, 
    10, 
    (result) => result * 2, // Double the result
    (finalResult) => console.log(`The final result is ${finalResult}`)
);
*/
// case 1
/*
function calculateAndGreet(a, b, operationCallback, greetingCallback) {
    // Simulate delay for operation using setTimeout
    setTimeout(() => {
        const result = operationCallback(a, b);  // Perform the operation on a and b
        // Simulate delay for greeting after operation
        setTimeout(() => {
            greetingCallback(result);  // Pass the result to the greetingCallback
        }, 1000);  // 1 second delay for greeting
    }, 1000);  // 1 second delay for operation
}

// Example usage:
calculateAndGreet(
    5, 
    10, 
    (a, b) => a + b, // Perform addition
    (finalResult) => console.log(`The final result is ${finalResult}`)
);
*/
