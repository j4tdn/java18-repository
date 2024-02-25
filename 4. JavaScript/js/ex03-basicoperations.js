// test for while do while if else 

let numbers = [5, 9, 4, 2, 3];

console.log('numbers --> ' + numbers + ' --> ' + (typeof numbers));

// for index 
for (let i in numbers) {
	console.log('index --> ' + i);
}

console.log('--------------------');

// for each
for (let number of numbers) {
	console.log('value --> ' + number);
}

console.log('--------------------');

numbers.forEach(element => console.log(element));

console.log('--------------------');

function print(e) {
	console.log('aa --> ' + e);
}

// print is callbackFn
numbers.forEach(print);