/*window.innerWidth --> current width of web browser*/

window.onload = function() {
	window.document.querySelector('.wpx').textContent = window.innerWidth + 'px';
}

window.onresize = function() {
	window.document.querySelector('.wpx').textContent = window.innerWidth + 'px';
}