/*
hoisting có 2 loại :hoisting function và hoisting variable 
    +hoisting function:
       có idea scan code từ trên xuống dưới phát hiện những function declaration thì nó sẽ tạo 1 cái biến để lưu trữ function này bên tỏng variable object của excution  context ,sau đó 
       lúc gọi thực sự thì mới xuống function đó thực thi cho mình>
    +
*/

//functions
//var calculateAge = function(yearOfBirth) ;

calculateAge(1999)

//function declaration
function calculateAge (yearOfBirth){
    console.log('Age: '+(new Date().getFullYear() -yearOfBirth));
}

//function expression
//retirement(1995)
var retirement = function(yearOfBirth){
    console.log('Retirement: '+( 65-(new Date().getFullYear() -yearOfBirth)));
}
 retirement(1995);

 //variables
 //var age = undefined;
 console.log(age);
 var age = 36;
 console.log(age);
 
