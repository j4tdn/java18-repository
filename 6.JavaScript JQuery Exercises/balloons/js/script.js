// thời gian sau bao lâu để dịch chuyển balloon lên 1px
const animatingTimeLevel1 = 10;
const animatingTimeLevel2 = 8;
const animatingTimeLevel3 = 6;
const animatingTimeLevel4 = 4;
const animatingTimeLevel5 = 2;

// thời gian sau bao lâu đêr tạo ra 1 balloon
const createTimeLevel1 = 500;

const balloonWith = 100;
const balloonHeight = 200;

let windowWith = window.innerWidth;
let windowHeight = window.innerHeight;

let colors = ['blue', 'green', 'red', 'violet', 'yellow'];

const body = document.body;

const audio = new Audio('sounds/pop.mp3');

let currentScoreTag = document.querySelector('.current-score');

let totalScore = 10;
let score = 0;

let isGameOver = false;

startGame();


function startGame() {
	document.querySelector('.total-score').textContent = totalScore;
	let startGameInterval = setInterval(function() {
		if (isGameOver) {
			// stop gểnate new balloon
			showPopup();
			clearInterval(startGameInterval);
		} else {
			// tiếp tục gểnate new balloon and run
			initialAndRun();

		}
	},createTimeLevel1);
}

// tạo ra 1 balloon và cho dịch chuyển
function initialAndRun() {
	// random mau sắc để tạo balloon
	let position = random(colors.length);
	let balloon = document.createElement('div');
	balloon.className = `balloon balloon-${colors[position]}`;

	// random vị trí cho balloon
	let bound = windowWith - balloonWith;
	position = random(bound);
	balloon.style.left = position + 'px';


	// bắt sự kiện click balloon
	balloon.onclick = () => pop(balloon);

	body.appendChild(balloon);

	animate(balloon);
}

function animate(balloon) {
	// dịch chuyển balloon từ dưới lên trên
	// sau mỗi ?ms dịch chuyển 1px --> setInterval

	let moved = 0;

	let animateInterval = setInterval(function() {
		let isAvailabel = document.querySelector('div[id="' + balloon.id + '"]') !== null;
		// mặc định, cách top = 100vh
		// cứ sau ?ms --> top = top -1px
		if (moved === windowHeight + balloonHeight + 1) {
			// loose
			isGameOver = true;
			balloon.remove();
			clearInterval(animateInterval);
		} else {
			// continue moving
			balloon.style.top = (windowHeight - moved) + 'px';
			moved++;
		}
	}, animatingTimeLevel1);
}

document.querySelector('.play-again-yes').onclick = function() {
	clearCurrentBalloons();
	hidePopup();
	score = 0;
	currentScoreTag.textContent = score;
	isGameOver = false;
	startGame();


}

// =================================== SUPPORT METHODS ==============================

function pop(balloon) {

	if (!isGameOver) {
		//1. Phát audio -> pop9noor)
		audio.play();
		//2. remove balloon khỏi document
		balloon.remove();
		//3. tăng 1 điểm
		currentScoreTag.textContent = ++score;
	}
}

function clearCurrentBalloons() {
	let balloons = document.querySelectorAll('.balloon');
	for (let balloon of balloons) {
		balloon.remove();
	}
	// body...
}

function showPopup() {
	document.querySelector('.balloon-shadow-container').style.display = 'flex';
}

function hidePopup() {
	document.querySelector('.balloon-shadow-container').style.display = 'none';
	document.querySelector('.loose').style.display = 'none';
}

// ====================================UTIL METHODS ================================
function random(n) {
	return Math.floor(Math.random() * n);
}
function randomInRage(a, b) {
	return a + Math.floor(Math.random() * (b-a+1));
}