
$(document).ready(function () {
    let addButton = $('.btn-add');
    let textInput = $('.new-task-content');
    let task = $('.tasks');
    let errorMessage = $('.todo-error-message')
    addButton.prop('disabled', true);
    //onkeyup
    //onkeydown
    addButton.on('click', function() {
        let text = textInput.val().trim();
        if(text){
            task.append(createNewTask(text));
            textInput.val("");
        }
        else{
           displayErrorMessage();
        }
        addButton.prop('disabled', true);
    });


    textInput.on('keyup', function(e){
        let text = textInput.value.trim();
        if(text){
            hiddenErrorMessage();
            addButton.prop('disabled', false);
        }
        else{
           displayErrorMessage();
           addButton.prop('disabled', true);
        }
        if(e.which ===13){
            //key enter event
            addButton.click();
        }
    });

    task.on('click', '.cbx-done', function() {
        $(this).parent().next().toggleClass('task-done');
    })

    task.on('click', '.btn-remove', function() {
        function(e){
            let component = e.target;
            //check done event
            
            // check remove
            if(component.classList.contains('btn-remove')){
                let taskValue = component.previousElementSibling.textContent;
                let comfirmed = confirm('Are you sure to delete task "'+ taskValue +'" ?');
                //confirm return boolean
                if(comfirmed){
                    component.parentElement.remove();
                }
                
            }
        }
    })


    function displayErrorMessage(){
        errorTag.addClass('invisible');
    }

    function hiddenErrorMessage(){
        errorTag.removeClass('invisible')
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
})


