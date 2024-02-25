let clickButton =document.querySelector('.btn-game');

clickButton.onclick = function(){
    alert('hello');
}


clickButton.onclick = function(){
    let OK =confirm('Hello there,Do you want to play the random gme');
    console.log("ok ===> "+OK);
    if(OK) {
        alert('-- Idea of game-- We`d like to test your luckily today \n we will random a number from 1 - 10 \n Please fill a number in your mind --> submit \n If the number is correct,we will have a gift for You \n If no -->see You \n -- ******** --')
         let  frame = prompt("Please fill your name");
         let phone = prompt("Please fill your phone");
         let value = +prompt("Fill your guess number");//+String --> convert number
         let random = 1+ Math.floor( Math.random() *10);

         let isCorrect = (value=== random);
         if(isCorrect) {
            alert('you are so luck ---> A special gift will send to You next few days');
        }else{
            alert('Sadly wrong --> Hope to see you next time')
        }
    }
}
