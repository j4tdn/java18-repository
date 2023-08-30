CREATE SCHEMA `lesson17-exam` CHARSET utf8mb4;

USE DATA;
DROP TABLE IF EXISTS SIZE;
CREATE TABLE `CLASS`
(
	ID INT NOT NULL,
    `NAME`  VARCHAR(50) NOT NULL,
	TEACHER VARCHAR(50) NOT NULL,
    CONSTRAINT PK_CLASS PRIMARY KEY (ID)
);
DROP TABLE IF EXISTS STUDENT;

CREATE TABLE  STUDENT
(
	ID INT NOT NULL,
    NAME  VARCHAR(50) NOT NULL,
	GENDER VARCHAR(50) NOT NULL,
    class_id INT NOT NULL,
    CONSTRAINT PK_STUDENT PRIMARY KEY (ID),
    CONSTRAINT CHECK_GENDER CHECK (GENDER IN ('Male','Female','male','female')),
    CONSTRAINT FK_STUDENT_CLASS_ID FOREIGN KEY (class_id) REFERENCES `CLASS`(ID)
);

CREATE TABLE RESULT
(
	STUDENT_ID INT NOT NULL,
    `SUBJECT`  VARCHAR(50) NOT NULL,
	SCORE INT NOT NULL,
    CONSTRAINT PK_RESULT PRIMARY KEY (STUDENT_ID),
    CONSTRAINT FK_RESULT_STUDENT_ID FOREIGN KEY (STUDENT_ID) REFERENCES `STUDENT`(ID)
);

ALTER TABLE result
MODIFY COLUMN score DOUBLE;


INSERT INTO `class`(ID,`NAME`,`TEACHER`) 
values
(1,"12A","Ho Cong Trung"),
(2,"12B","Dang Tu Anh"),
(3,"12C","Nguyen Van Tam");


INSERT INTO `student`(ID,`NAME`,`GENDER`,`CLASS_ID`) 
values
(1,"Dinh Thi Ngoc","Female",2),
(2,"Nguyen Thanh Hung","Male",1),
(3,"Tran Mai Hoa","Female",2),
(4,"Doan Quang Vinh","Male",1),
(5,"Cao Anh Dao","Female",3),
(6,"Tran Kim Tuyen","Male",3),
(7,"Nguyen Dac Duc","Male",3),
(8,"Pham Cong Huy","Male",3),
(9,"Phan Huu Thai","Male",3);

INSERT INTO `result`(`STUDENT_ID`,`SUBJECT`,`SCORE`) 
values
(1,"Math",8),
(2,"Literature",7),
(3,"History",9.5),
(4,"Math",6.8),
(5,"Literature",4.9),
(6,"History",8.2),
(7,"Math",9.8),
(8,"Literature",7.2),
(9,"History",8.8);

-- 1. STUDENT_ID
-- 2 . list name, gender and teacher name of students.
SELECT st.`name` `NAME`, st.gender GENDER, cls.teacher TEACHER
  FROM student st
  JOIN class cls
    ON st.class_id = cls.ID;
    
-- 3.
SELECT TEACHER AS TenGiaoVien, COUNT(st.CLASS_ID) AS SoHocSinh
FROM CLASS cl
INNER JOIN STUDENT st
ON cl.ID = st.CLASS_ID
WHERE cl.NAME = '12C'
GROUP BY cl.TEACHER;
    
-- 4 List the class name and number of the students who have good at math (score >= 8)
-- and good Literature (score>=8).
SELECT  c.teacher , count(s.id) as amout_student
from class c 
join student s on c.id = s.class_id
join result r on  s.id = r.student_id
WHERE r.subject like "Math" and r.score >= 8 OR r.subject like "Literature" and r.score >= 8
GROUP BY c.teacher;


