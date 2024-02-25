$(document).ready(function() {
    let addButton = $(".btn-add");
    let textInput = $(".new-task-content");
    let task = $('.tasks');
    let errorMessage = $('.todo-error-message')
    addButton.attr('disabled', true);
    addButton.on('click', function() {
        let text = textInput.val().trim();
        if(text){
            task.append(createNewTask(text));
            textInput.val("") ;
            hiddenErrorMessage();
        }
        else{
           displayErrorMessage();
        }
        addButton.attr('disabled', true);
    }) 
    //onkeyup
    //onkeydown
    textInput.on('keyup',function(e){
        let text = textInput.val().trim();
        if(text){
            hiddenErrorMessage();
            addButton.attr('disabled', false);
        }
        else{
           displayErrorMessage();
           addButton.attr('disabled', true);
        }
        if(e.which ===13){
            //key enter event
            addButton.click();
        }
    }) 
    task.on('click',function(e){
        let component = $(e.target);
        //check done event
        if(component.hasClass("cbx-done")){
            if(component.prop('checked')){
                component.parent().next().css ("text-decoration", "line-through red");
            }
            else{
                component.parent().next().css ("text-decoration", "none");
            }
        }
        // check remove
        if(component.hasClass('btn-remove')){
            let taskValue = component.prev().text();
            let comfirmed = confirm('Are you sure to delete task "'+ taskValue +'" ?');
            //confirm return boolean
            if(comfirmed){
                component.parent().remove();
            }
        }
    }) 
    function displayErrorMessage(){
        errorMessage.removeClass('invisible');
    }
    function hiddenErrorMessage(){
        errorMessage.addClass('invisible');
    }
    function createNewTask(text) {
        let newTask = $('<li>');
        //checkbox
        let checkBoxBlock = $('<div>');
        checkBoxBlock.attr('class','cbx-block')
        let checkBox = $('<input>');
        checkBox.attr('class','cbx-done')
        checkBox.attr ('type','checkbox');
        checkBoxBlock.append(checkBox);
        newTask.append(checkBoxBlock)
        //content
        let content = $('<p>');
        content.attr('class','content')
        content.text ( text);
        newTask.append(content);
        //btn remove
        let removeButton = $('<button>');
        removeButton.attr('class','btn-remove')
        removeButton.text('x');
        newTask.append(removeButton);   
        $('.tasks').append(newTask);
        return newTask;
    }
});







