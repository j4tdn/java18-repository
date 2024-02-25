let addButton = document.querySelector('.btn-add');
let textInput = document.querySelector('.new-task-content');
let task = document.querySelector('.tasks');
let errorMessage = document.querySelector('.todo-error-message')
addButton.disabled=true;
//onkeyup
//onkeydown
addButton.onclick = function() {
    let text = textInput.value.trim();
    if(text){
        task.appendChild(createNewTask(text));
        textInput.value = "";
        hiddenErrorMessage();
    }
    else{
       displayErrorMessage();
    }
    addButton.disabled=true;
}
textInput.onkeyup= function(e){
    let text = textInput.value.trim();
    if(text){
        hiddenErrorMessage();
        addButton.disabled=false;
    }
    else{
       displayErrorMessage();
       addButton.disabled=true;
    }
    if(e.which ===13){
        //key enter event
        addButton.click();
    }
}

// let checkBoxs = document.querySelectorAll(".cbx-done");
// for(let checkBox of checkBoxs){
//     checkBox.onclick = function(e){
//         if(e.target.checked){
//             e.target.parentElement.nextElementSibling.style.textDecoration = "line-through red";
//         }
//         else{
//             e.target.parentElement.nextElementSibling.style.textDecoration = "none";
//         }
//     }
// }
task.onclick = function(e){
    let component = e.target;
    //check done event
    if(component.classList.contains("cbx-done")){
        if(component.checked){
            component.parentElement.nextElementSibling.style.textDecoration = "line-through red";
        }
        else{
            component.parentElement.nextElementSibling.style.textDecoration = "none";
        }
    }
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


function displayErrorMessage(){
    errorMessage.classList.remove('invisible');
}
function hiddenErrorMessage(){
    errorMessage.classList.add('invisible');
}
function createNewTask(text) {
    let newTask = document.createElement('li');
    //checkbox
    let checkBoxBlock = document.createElement('div');
    checkBoxBlock.setAttribute('class','cbx-block')
    let checkBox = document.createElement('input');
    checkBox.setAttribute('class','cbx-done')
    checkBox.type = 'checkbox';
    checkBoxBlock.appendChild(checkBox);
    newTask.appendChild(checkBoxBlock)
    //content
    let content = document.createElement('p');
    content.setAttribute('class','content')
    content.textContent = text;
    newTask.appendChild(content);
    //btn remove
    let removeButton = document.createElement('button');
    removeButton.setAttribute('class','btn-remove')
    removeButton.textContent = 'x';
    newTask.appendChild(removeButton);
    document.querySelector('.tasks').appendChild(newTask);
    return newTask;
}
