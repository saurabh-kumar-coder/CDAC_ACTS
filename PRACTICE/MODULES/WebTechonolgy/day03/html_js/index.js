// Select the <h1> element using its ID and change its text to "Welcome, Saurabh!".
document.getElementById("text1").innerText = "Welcome, Saurabh!";
// Hint: Use document.getElementById() and modify innerText.

// Add a CSS class "highlight" to the <div> with the id="greeting1".
const greeting1 = document.getElementById("greeting1");
greeting1.style.border = "2px solid red";
// Hint: Use classList.add().

// Change the button's text from "Submit" to "Click Me".
const btn1 = document.getElementById("button1");
btn1.innerText = "click me";
// Hint: Select the button using getElementById() and modify its innerText.

// Change the background color of the <div> with id="greeting1" to lightblue.
document.getElementById("greeting1").style.backgroundColor = "lightblue";

// Hint: Modify the style.backgroundColor property.

// Append a new paragraph <p> with the text "DOM Manipulation Example" inside the <div> with id="greeting1".

const newPara = document.createElement("p");
newPara.innerHTML = "DOM Manipulation Example";
document.getElementById("greeting1").appendChild(newPara);

// Hint: Use document.createElement() and appendChild().

// Add a click event listener to the button such that clicking the button changes the text of the <h1> to "Button Clicked!".

document.getElementById("button1").addEventListener("click", () => {
	document.getElementById("greeting1").innerText = "Button Clicked";
});

// Hint: Use addEventListener() with an onclick function.

// Replace the <h1> element inside greeting1 with an <h2> element containing the text "New Heading".

const newH2 = document.createElement("h2");
newH2.innerHTML = "Bye Saurabh";

const oldH1 = document.getElementById("text1");
document.getElementById("greeting1").replaceChild(newH2, oldH1);

// Hint: Use replaceChild() or remove the old <h1> and append the new <h2>.

// Toggle the visibility of the <h1> element each time the button is clicked.

// Hint: Change the style.display property between "none" and "block".
// Add a hover effect on the button that changes its text to "Hovering!" when the mouse is over it, and back to "Submit" when the mouse leaves.

// Hint: Use mouseover and mouseout event listeners.
// Insert a new <div> with the text "New Div Added" after the greeting1 <div> element.

// Hint: Use insertAdjacentHTML() or insertAdjacentElement().
// Bonus Question
// How can you dynamically replace {{Saurabh}} in the <h1> tag with a different name (e.g., "Rahul") using JavaScript?
// Hint: Use textContent or innerHTML and string manipulation methods.
