// Không cần khai báo KDL của biến trong function 
// Vì mặc định các biến đó hoạt động trong function's scope

// declaration function
function sum(a, b) {
	return a + b;
}

// No return
function print(preText, input) {
	console.log(preText + ": " + input);
}

let result = sum(5, 10);
print("Sum of 5 and 10", result);

// arrow function, anonymous function
// expression function
let sub = (a, b) => a - b;
print("Sub of 12 and 8", sub(12, 8));

console.log("=========================");

// callback function
// predicate : bản thân là hàm, và là tham số của filter()
// => Trong một hàm A, có một tham số là một hàm khác (B) truyền vào, 
// và bên trong hàm A gọi hàm B để sử dụng => gọi là callback function

let numbers = [1,2,3,4,5];
function filter(elements, callback) {
	for (let element of elements) {
		if (callback(element)) {
			console.log("matched element: " + element);
		}
	}
}

function isEven(element) {
	return element % 2 == 0;
}

// filter(numbers, isEven);
/*
filter(numbers, function(element) {
	return element % 2 == 0;
}); 
*/

filter(numbers, element => element % 2 == 0);
