$(document).ready(function() {

	let addButton = $('.btn-add');
	let tasks = $('.tasks');
	let errorTag = $('.todo-error-message');
	let textInput = $('.new-task-content');

	addButton.prop('disabled', true);

	addButton.on('click', function() {
		let text = textInput.val().trim();
		if (text) {
			tasks.append(createNewTask(text));
			textInput.val('');
		} else {
			displayErrorMessage();
		}
		addButton.prop('disabled', true);
	});

	textInput.on('keyup', function(e) {
		let text = textInput.val().trim();
		if (text) {
			hideErrorMessage();
			addButton.prop('disabled', false);
		} else {
			displayErrorMessage();
			addButton.prop('disabled', true);
		}
		if (e.which === 13) {
			addButton.click();
		}
	});

	tasks.on('click', '.cbx-done', function() {
		$(this).parent().next().toggleClass('task-done');
	})

	tasks.on('click', '.btn-remove', function() {
		let taskVal = $(this).parent().next().val();
		let confirmed = confirm('Are You sure to delete the task "' + taskVal + '" ?');
		if (confirmed) {
			$(this).parent().remove();
		}
	})

	function displayErrorMessage() {
		errorTag.removeClass('invisible');
	}

	function hideErrorMessage() {
		errorTag.addClass('invisible');
	}

	function createNewTask(text) {
		let newTask = `<li>
							<div class="cbx-block">
								<input type="checkbox" class="cbx-done">
							</div>
							<p class="content">${text}</p>
							<button class="btn-remove">x</button>
					   </li>`;
		return newTask;
	}

	$("#unsorted-list").sortable();

})