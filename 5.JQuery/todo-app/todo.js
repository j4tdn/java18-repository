$(document).ready(function() {
	let addButton = $('.btn-add');
	let tasks = $('.tasks');
	let errorTag = $('.todo-error-message');

	addButton.disabled = true;

	let textInput = $('.new-task-content');

	// addButton.onclick = function() {
	// 	let text = textInput.value.trim();
	// 	if (text) {
	// 		// ADD NEW TASK
	// 		tasks.appendChild(createNewTask(text));
	// 		textInput.value = '';
	// 		hideErrorMessage();
	// 	} else {
	// 		// DISPLAY ERROR MESSGAE
	// 		displayErrorMessage();
	// 	}
	// 	addButton.disabled = true;
	// }

	textInput.onkeyup = function(e) {
		let text = textInput.value.trim();
		if (text) {
			hideErrorMessage();
			addButton.disabled = false;
		} else {
			displayErrorMessage();
			addButton.disabled = true;
		}
		if (e.which === 13) {
			// KEY ENTER EVENT
			addButton.click();
		}
	}

	/*
	let cbxDones = document.querySelectorAll('.cbx-done');
	for (let cbxDone of cbxDones) {
		cbxDone.onclick = function(e) {
			let taskContent = e.target.parentElement.nextElementSibling;
			taskContent.style.textDecoration = 'line-through';
		}
	}
	*/

	tasks.onclick = function(e) {
		let component = e.target;

		let parent = component.parentElement;
		let sibling;
		
		// CHECKBOX DONE EVENT
		if (component.classList.contains('cbx-done')) {
			sibling = parent.nextElementSibling;
			sibling.style.textDecoration = 'line-through';
		}

		// BUTTON REMOVE EVENT
		if (component.classList.contains('btn-remove')) {
			sibling = component.previousElementSibling;
			let confirmed = confirm('Are You sure to delete the task "' + sibling.textContent + '" ?');
			if (confirmed) {
				parent.remove();
			}	
		}
	}


	function displayErrorMessage() {
		errorTag.classList.remove('invisible');
	}

	function hideErrorMessage() {
		errorTag.classList.add('invisible');
	}

	function createNewTask(text) {
		let newTask = document.createElement('li');

		// checkbox
		let div = document.createElement('div');
		div.setAttribute('class', 'cbx-block');

		let input = document.createElement('input');
		input.setAttribute('type', 'checkbox');
		input.setAttribute('class', 'cbx-done');

		/*
		input.onclick = function(e) {
			let taskContent = e.target.parentElement.nextElementSibling;
			taskContent.style.textDecoration = 'line-through';
		}
		*/

		div.appendChild(input);

		// content
		let p = document.createElement('p');
		p.setAttribute('class', 'content');
		p.textContent = text;

		// button remove
		let button = document.createElement('button');
		button.setAttribute('class', 'btn-remove');
		button.textContent = 'x';

		newTask.appendChild(div);
		newTask.appendChild(p);
		newTask.appendChild(button);

		return newTask;
	}
		addButton.on('click', function() {
			let text = textInput.value.trim();
			if (text) {
				// ADD NEW TASK
				tasks.appendChild(createNewTask(text));
				textInput.value = '';
				hideErrorMessage();
			} else {
				// DISPLAY ERROR MESSGAE
				displayErrorMessage();
			}
			addButton.disabled = true;

		});


		function createNewTask(text) {
		let newTask = document.createElement('li');

		// checkbox
		let div = document.createElement('div');
		div.setAttribute('class', 'cbx-block');

		let input = document.createElement('input');
		input.setAttribute('type', 'checkbox');
		input.setAttribute('class', 'cbx-done');

		/*
		input.onclick = function(e) {
			let taskContent = e.target.parentElement.nextElementSibling;
			taskContent.style.textDecoration = 'line-through';
		}
		*/

		div.appendChild(input);

		// content
		let p = document.createElement('p');
		p.setAttribute('class', 'content');
		p.textContent = text;

		// button remove
		let button = document.createElement('button');
		button.setAttribute('class', 'btn-remove');
		button.textContent = 'x';

		newTask.appendChild(div);
		newTask.appendChild(p);
		newTask.appendChild(button);

		return newTask;
	}

});