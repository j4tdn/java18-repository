// global object - execution context 
// scope chain: var, let, const

// ES5: var = global variable --> store in global execution context (execution context = ngữ cảnh thực thi)
// web browser: var --> store in a browser object named "window"
// var name5 = 'Yaya Toure';
// var age5 = 36; // ==> age = window.age
// name5 = 'Yaya Smith';
// console.log(`${name5} - ${age5}`);

// ES6 - ES2015 --> let, const
// const name6 = 'Yaya Toure';
// let age6 = 36; // ==> age = window.age
// name6 = 'Yaya Smith';
// console.log(`${name6} - ${age6}`);

// let, const: block scope 
// var: function scope 

// ES5
function driverLicence5(passedTest) {
	if (passedTest) {
		var firstName = 'John';
		var yearOfBirth = 1998;
	}
	console.log(`${firstName} born in ${yearOfBirth},
			now is allowed to drive a car`);
}
driverLicence5(true);

function driverLicence6(passedTest) {
	if (passedTest) {
		let firstName = 'John';
		const yearOfBirth = 1998;

		console.log(`${firstName} born in ${yearOfBirth},
			now is allowed to drive a car`);
	}
	// console.log(`${firstName} born in ${yearOfBirth},
	// 		now is allowed to drive a car`);
	// fail => because it is only OK when put in if{} => block scope
}
driverLicence6(true);

let i = 20;
for (let i = 0; i < 5; i++) {
	console.log('i: ' + i);
}
console.log(i);