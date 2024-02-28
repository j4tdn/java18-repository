// ================== declaration =================== //
// thời gian sau bao lâu để dịch chuyển balloon lên 1px
const animatingTimeLevel1 = 10;
const animatingTimeLevel2 = 8;
const animatingTimeLevel3 = 6;
const animatingTimeLevel4 = 4;
const animatingTimeLevel5 = 2;

// thời gian sau bao lâu để tạo 1 balloon
const creatingTimeLevel1 = 300;

const balloonWidth = 100;
const balloonHeight = 200;

let windowWidth = window.innerWidth;
let windowHeight = window.innerHeight;

let colors = ['blue', 'green', 'red', 'violet', 'yellow'];

const body = document.body;

const audio = new Audio('sounds/pop.mp3');

let currentScoreTag = document.querySelector('.current-score');


let totalScore = 10;
let score = 0;
let isGameOver = false;
let balloonId = 0;

// ================== start game - ui methods =================== //

startGame();

function startGame() {
	document.querySelector('.total-score').textContent = totalScore;
	let startGameInterval = setInterval(function() {
		if(isGameOver) {
			// show game over popup
			showPopup();

			// stop generate new balloon
			clearInterval(startGameInterval);
		} else {
			// tiếp tục generate new balloon and run
			initialAndRun();
		}
	}, creatingTimeLevel1);
}

// tạo ra 1 baloon và cho dịch chuyển
function initialAndRun() {
	// random màu sắc để tạo baloon
	let position = random(colors.length);
	let balloon = document.createElement('div');
	balloon.className = `balloon balloon-${colors[position]}` ;
	balloon.id = balloonId++;

	// random vị trí cho baloon
	let bound = windowWidth - balloonWidth;
	position = random(bound);
	balloon.style.left = position + 'px';

	// bắt sự kiện click balloon
	balloon.onclick = () => pop(balloon);

	// thêm vào document body
	body.appendChild(balloon);

	animate(balloon);
}

function animate(balloon) {
	// dịch chuyển balloon từ dưới lên trên
	// sau mỗi ?ms dịch chuyển 1px --> setInterval
	let moved = 0;

	let animateInterval = setInterval(function() {
		let isAvailable = document.querySelector('div[id="' + balloon.id  +'"]') !== null;
		if (isAvailable) {
			// mặc định, cách top = 100vh
			// cứ sau ?ms --> top = top - 1px
			if (moved === windowHeight + balloonHeight + 1) {
				// loose - game over
				isGameOver = true;
				balloon.remove();
				clearInterval(animateInterval);
			} else {
				// continue moving
				balloon.style.top = (windowHeight - moved) + 'px';
				moved++;
			}	
		}
	}, animatingTimeLevel1);
}

// ==================== EVENTS =====================
document.querySelector('.play-again-yes').onclick = function() {
	clearCurrentBalloons();
	
	hidePopup();
	
	score = 0;
	currentScoreTag.textContent = score;
	
	isGameOver = false;

	startGame();
}


// ==================== SUPPORT METHODS ============
function pop(balloon) {
	if (!isGameOver) {
		audio.play();
		balloon.remove();
		currentScoreTag.textContent = ++score;
	}
}

function clearCurrentBalloons() {
	let balloons = document.querySelectorAll('.balloon');
	for (let balloon of balloons) {
		balloon.remove();
	}
}

function showPopup() {
	console.log('show popup');
	document.querySelector('.balloon-shadow-container').style.display = 'flex';
}

function hidePopup() {
	document.querySelector('.balloon-shadow-container').style.display = 'none';
}


// ==================== UTIL METHODS ===============

function random(n) {
	return Math.floor(Math.random() * n);
}

function randomInRage(a, b) {
	return a + Math.floor(Math.random() * (b-a+1));
}