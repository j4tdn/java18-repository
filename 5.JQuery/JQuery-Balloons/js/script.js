let balloonHeight = 203;
let windowWith = window.innerWidth;
let windowHeight = window.innerHeight;
let score ;
let balloonID ;
let intervalGame;


let scoreElement = document.querySelector('.score');
let totalShadowElement = document.querySelector('.total-shadow')
let winElement = document.querySelector('.win');
let loseElement = document.querySelector('.lose');
const balloonsClass = [
    "red",
    "yellow",
    "blue",
    "violet",
    "green",
  ];
function createBalloon(){
    let balloonWidth = 100;
    let move = 0;
    let indexBalloon = random(0, balloonsClass.length - 1);
    let balloon = document.createElement("div");
    balloon.setAttribute("class", balloon balloon-${balloonsClass[indexBalloon]});
    balloon.setAttribute("id", balloonID);
    balloonID++;
    let positionLeft = random(0,windowWith-balloonWidth);
    balloon.style.left = random(0,positionLeft)+"px";
    let intervalPosition ;
    balloon.onclick = function(e){
        e.target.remove();
        clearInterval(intervalPosition);
        score++;
        updateScore();
        stop();
    }
    //check cham luoi tren
    intervalPosition=runner(balloon,move);
    document.body.append(balloon);
}
window.onload = () => {
    score = 0;
    balloonID = 0;
    intervalGame = setInterval(() => {createBalloon()},1000);
    createBalloon()
};
function runner(balloon, move) {
    setInterval(() => {
        move++;
        let element = document.querySelector('div[id="' + balloon.id + '"]');
        if (element) {
            element.style.top = 100 - move + "vh";
            if (move >= 100) {
                let elements = document.querySelectorAll(".balloon");
                for (let element of elements) {
                    element.remove();
                }
                clearInterval(intervalGame);
                totalShadowElement.style.display = 'block';
                loseElement.style.display = 'block';
            }
        }
    }, 30)
}
function updateScore(){
    scoreElement.textContent = score;
}
function random(min, max) {
    return Math.floor(Math.random() * (max - min + 1) + min);
} 
function stop(){
    if(score == 5){
        totalShadowElement.style.display='block';
        winElement.style.display='block';
        console.log("stopped");
        let elements = document.querySelectorAll(".balloon");
        for(let element of elements){
            element.remove();  
        } 
        clearInterval(intervalGame);
    }
}