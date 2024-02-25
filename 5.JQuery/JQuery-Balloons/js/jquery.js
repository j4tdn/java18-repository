$(document).ready(function () {
  let scoreBalloons = $(".score");
  let win = $(".win");
  let lose = $(".lose");
  let scoreStart = 0;
  let timeStart = 0;
  const runningBallTime = 5;
  let windowWith = window.innerWidth;
    let windowHeight = window.innerHeight;
  
let balloonId = 0;
  let gameInterval;
  const ballonsClass = [
    "balloon-red",
    "balloon-yellow",
    "balloon-blue",
    "balloon-violet",
    "balloon-green",
  ];
  $(window).on("load", function () {
    
    startGame();
    stopGame();
  });
  function startGame() {
    score = 0;
    time = 60;
    gameInterval = setInterval(createBalloon, 1000);
  }
  function createBalloon() {
    let indexBalloon = random(0, ballonsClass.length - 1);
    let ballonCurrentClass = ballonsClass[indexBalloon];
    let ballonCurrent = $("<div></div>");
    ballonCurrent.addClass( ballonCurrentClass);
    ballonCurrent.addClass('balloon');
    ballonCurrent.css('left',random(0,windowWith-balloonWidth))
    ballonCurrent.attr('id',balloonId++);
    ballonCurrent.on("click",function() {
      scoreStart+=1;
      updateScore();
     $(this).remove();
    });
    $("body").append(ballonCurrent);
    animate(ballonCurrent);
  }
  function animate(balloon) {
	let moved = 0;
	// move top every 10ms
	let animateInterval = setInterval(function() {
		moved++;

		// balloon is poped(removed), isn't it ? How to know
		// >> check current balloon is exist in body or not
		let isPoped = document.querySelector('div[id="' + balloon.id + '"]') === null;

		if (!isPoped) {
			if (moved >= windowHeight + balloonHeight) {
				// stop moving balloon if balloon bottom position touched window top
				clearInterval(animateInterval);
				isGameOver = true;
				
				// test with balloon has id=0. Poped
				// removed from body but still keep a reference to poped baloon >> moved still increase
				console.log("FAILED");
				console.log(balloon);
			} else {
				balloon.style.top = windowHeight - moved + 'px';
			}
		}
	}, runningBallTime);
}
  function random(min, max) {
    return Math.floor(Math.random() * (max - min + 1) + min);
  }

  function stopGame() {
    if (scoreStart == 100) {
      $("body").append(win);
    } 
    clearInterval(gameInterval);
  }
  function updateScore() {
    scoreBalloons.text(scoreStart);
  }
});
