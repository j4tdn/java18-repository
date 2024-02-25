console.log('========= Ex10 - DOM - SELECTOR ===============')
let pageH1Tags = document.getElementsByTagName('h1');
console.log(pageH1Tags);

let usersTags = document.getElementsByClassName('user');
console.log(usersTags);



//using querySelector[all]
console.log("================================");
pageH1Tags = document.querySelectorAll('h1')
console.log(pageH1Tags);
usersTags = document.querySelector('.user');
console.log(usersTags);