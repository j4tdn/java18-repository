const studentList = document.querySelector(".student-list");
let studentsFull = JSON.parse(localStorage.getItem("students")) || [];
let students = studentsFull
let studentsPerPage = 5;
let currentPage = 1;
let totalPages = Math.ceil(students.length / studentsPerPage);
// SEARCH
const searchInput = document.querySelector(".search-input");
searchInput.addEventListener("input", function () {
    if (searchInput.value === "") {
        students = studentsFull;
        currentPage = 1;
        totalPages = Math.ceil(students.length / studentsPerPage);
        initializePage();
    }
    else {
        students = studentsFull.filter(function (student) {
            return student.name.toLowerCase().includes(searchInput.value.toLowerCase());
        });
        currentPage = 1;
        totalPages = Math.ceil(students.length / studentsPerPage);
        initializePage();
    }
});
// SHOW LIST STUDENTS
function showPage(page) {
    function findStudent(name) {
        for (let i = 0; i < students.length; i++) {
            if (students[i].name === name) {
                return i;
            }
        }
        return -1;
    }
    studentList.innerHTML = "";
    if (totalPages === 0) {
        return;
    }
    const pageBtns = document.querySelectorAll(".page-btn");
    pageBtns.forEach(function (pageBtn) {
        pageBtn.classList.remove("active");
    });
    pageBtns[page - 1].classList.toggle("active");
    let start = (page - 1) * studentsPerPage;
    let end = start + studentsPerPage;
    let pageStudents = students.slice(start, end);
    pageStudents.forEach(function (student) {
        const tr = document.createElement("tr");
        const td1 = document.createElement("td");
        const input = document.createElement("input");
        input.type = "checkbox";
        td1.appendChild(input);
        const td2 = document.createElement("td");
        td2.textContent = student.name;
        const td3 = document.createElement("td");
        td3.textContent = student.class;
        const td4 = document.createElement("td");
        const i1 = document.createElement("i");
        i1.className = "fa-regular fa-pen-to-square";
        i1.addEventListener("click", function () {
            window.location.href = "../addpage/index.html?name=" + student.name;
        });
        const i2 = document.createElement("i");
        i2.addEventListener("click", function () {
            let index = findStudent(student.name);
            students.splice(index, 1);
            localStorage.setItem("students", JSON.stringify(students));
            window.location.href = "../homepage/index.html";
        });
        i2.className = "fa-solid fa-trash";
        td4.appendChild(i1);
        td4.appendChild(i2);
        tr.appendChild(td1);
        tr.appendChild(td2);
        tr.appendChild(td3);
        tr.appendChild(td4);
        studentList.appendChild(tr);
    });
}

// SHOW PAGINATION BUTTONS
function initializePaginationButtons() {
    function handlePageButtonClick() {
        currentPage = parseInt(this.textContent);
        showPage(currentPage);
    }

    function goToPreviousPage() {
        if (currentPage > 1) {
            currentPage--;
            showPage(currentPage);
        }
    }

    function goToNextPage() {
        if (currentPage < totalPages) {
            currentPage++;
            showPage(currentPage);
        }
    }
    const paginationContainer = document.querySelector(".pagination-container");
    const pagesContainer = document.querySelector(".pages-container");
    const prevBtn = document.querySelector(".fa-angle-left");
    const nextBtn = document.querySelector(".fa-angle-right");

    pagesContainer.innerHTML = "";
    for (let i = 1; i <= totalPages; i++) {
        const pageBtn = document.createElement("button");
        pageBtn.className = "page-btn";
        pageBtn.textContent = i;
        pagesContainer.appendChild(pageBtn);
        pageBtn.addEventListener("click", handlePageButtonClick);
    }

    prevBtn.addEventListener("click", goToPreviousPage);
    nextBtn.addEventListener("click", goToNextPage);
}

function initializePage() {
    initializePaginationButtons();
    showPage(currentPage);
}

initializePage();
