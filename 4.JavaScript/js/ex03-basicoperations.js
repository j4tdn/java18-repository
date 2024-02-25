// test  for while do while  if else

let numbers = [1, 2, 3, 4, 5, 6, 7];
console.log('numbers ---> '+numbers + ' --> ' + typeof(numbers))

//for index
for(let i in numbers){
    console.log('index --> '+i)
}


//for each
for(let number of numbers){
    console.log('value --> '+number)
}
console.log('---------------');
numbers.forEach(element => {
    console.log('element --> '+element)
});
console.log('---------------');
numbers.forEach(function(e){
    console.log('e --> '+e)
}
);
function print(e){
    console.log('ep --> '+e)
}
console.log('---------------');
//print is callback function
numbers.forEach(print)
