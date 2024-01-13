$(document).ready(function() {
	let btnToggle = $('.btn-toggle');
	let blockToggle = $('.block-toggle');

	let thumnail = $('.avatar-thumbnail');

	btnToggle.on('click', function() {
		blockToggle.toggleClass('invisible');
	});

	/*load image for form*/
	let fc = $('.avatar-fc');
	fc.on('change', function() {
		
		let fr = new FileReader();
		let loadingFiles = this.files;
		let selectedFile = loadingFiles[0];
		
		// load/copy file content from local to web browser
		if (selectedFile) {
			fr.readAsDataURL(selectedFile);
		}

		// after loading success
		// set to thumbnail
		fr.onload = function(e) {
			thumnail.attr('src', e.target.result);
		}
	});

	let trigger = $('.trigger');
	trigger.on('click', function() {
		fc.click();
	})

	let reset = $('.reset');
	reset.on('click', function() {
		thumnail.attr('src', 'images/defava.png');
	})

})
