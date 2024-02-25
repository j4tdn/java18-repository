
console.log('=== Ex02. Basic Function ===');

let clickButton = document.querySelector('.btn-game');

clickButton.onclick = function() {
	//alert('hello hello 123');
	let ok = confirm('Hello there, do you want to play the random game?');

	console.log('ok --> ' + ok);

	if (ok) {
		alert(`
			-- Idea of Game --
			We'd like to test your luck today
			+ We will random a number from 1-10
			+ Please fill a number in your mind --> Submit
			+ If the number is correct, we will have a gift for you
			+ If no --> See you
			-- ********* --
			`);

		console.log('result --> ' + random);

		let fname = prompt('Please fill your name');
		let phone = prompt('Please fill your phone');
		let value = +prompt('*** Fill your guess number ***'); // +string --> convert to number

		let random = 1 + Math.floor((Math.random() * 10)); // [0, 9]

		let isCorrect = (value == random);

		if (isCorrect) {
			alert('You are so lucky --> A special gift will send to you next few days');	
		} else {
			alert('Sadly wrong --> Hope to see you next time');
		}
	}
}