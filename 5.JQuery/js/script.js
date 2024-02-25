$(document).ready(function() {
	let btnToggle = $('.btn-toggle');
	let blockToggle = $('.block-toggle');

	btnToggle.on('click', function() {
		blockToggle.toggleClass('invisible');
	});

	/*load image for form*/

	let fc = $('.avatar-fc');
	let thumbnail = $('.avatar-thumbnail');

	fc.on('change', function() {

		let fr = new FileReadder();
		let loadingFiles = this.files;
		let selectedFile = loadingFiles[0];
		// load/copy file content 
		if (selectedFile) {
			fr.readAsDataURL(selectedFile);
		}

		fr.onload = function(e) {
			thumbnail.attr('src', e.target.result);
		}
	});

	/*trigger*/
	let trigger = $('.trigger');
	trigger.on('click', function() {
		fc.click();
	});

	let reset = $('.reset');
	reset.on('click', function() {
		thumbnail.attr('src', 'images/defava.png');
	})
})