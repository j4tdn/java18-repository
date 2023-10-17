const nameInput = document.getElementById('name');
const classInput = document.getElementById('class');
const addBtn = document.getElementById('add-btn');
students = JSON.parse(localStorage.getItem('students')) || [];
function findStudent(name) {
  for (let i = 0; i < students.length; i++) {
    if (students[i].name === name) {
      return i;
    }
  }
  return -1;
}
// Lấy URLSearchParams từ URL hiện tại
var urlParams = new URLSearchParams(window.location.search);

// Lấy giá trị của tham số "?name"
var nameStudent = urlParams.get("name");
if (nameStudent) {
  let index = findStudent(nameStudent);
  if (index !== -1) {
    nameInput.value = students[index].name;
    classInput.value = students[index].class;
  }
}

addBtn.addEventListener('click', function () {
  let nameValue = nameInput.value;
  let classValue = classInput.value;
  if (nameValue === '' || classValue === '') {
    alert('Please fill in all fields');
    return;
  }
  let index = findStudent(nameValue);
  if (index === -1) {
    let student = {
      name: nameValue,
      class: classValue
    };
    students.push(student);
  } else {
    students[index].class = classValue;
  }
  //Sort students by name
  students.sort(function (a, b) {
    return a.name.localeCompare(b.name);
  });

  localStorage.setItem('students', JSON.stringify(students));
  window.location.href = '../homepage/index.html';
});