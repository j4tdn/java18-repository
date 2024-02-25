//global object
//excution  context
// scope chain: var,let,const

//Es5: var =  global variable ==>global execution context
// web browser: var --> window
// var name5 = "YaYa Toure";
// var age5 = 36; // ===> tự động được lưu trữ trên global object window(window là một đối tượng có sẵn của web browser,nó giống như kiểu object trong java khi nó là KDL cha của tất cả
// //kiểu dữ liệu còn lại trong js)
// name5 ="YaYa Smith"
// console.log(`${name5}-${age5}`);


//Es6 -Es2015 --> let,const
//excution context : ngữ cảnh thực thi --> dùng let
// const  name6 = "YaYa Toure";
// let age = 36;
// name6 ="YaYa Smith"
// console.log(`${name6}-${age}`);


//let,const:block scope
//var: function scope

//es5 
function driversLisence5(passedTest){
    if(passedTest){
        var firstName = 'John';
        var yearOfBirth = 1998;
         
        console.log(firstName+' born in '+yearOfBirth +' ,now is allowed to drive a car ');
    }
}

//es6
function driversLisence6(passedTest){
    if(passedTest){
        let firstName = 'John';
        const yearOfBirth = 1998;
         
        console.log(firstName+' born in '+yearOfBirth +' ,now is allowed to drive a car ');
    }
}
console.log(firstName)
driversLisence5(true);
driversLisence6(true);