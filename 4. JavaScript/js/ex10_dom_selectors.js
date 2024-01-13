console.log('====== Ex10 - JS DOM Selectors ======');

let pageH3Tags = document.getElementsByTagName('h3');

console.log(pageH3Tags);

let usersTag = document.getElementsByClassName('user');

console.log(usersTag);

/* using query selector [all] */

console.log('========== using query selector [all] ===========');

pageH3Tags = document.querySelectorAll('h3');

console.log(pageH3Tags);

usersTag = document.querySelector('.user');

console.log(usersTag);



