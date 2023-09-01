CREATE SCHEMA CLASS_APP_DB CHARSET utf8mb4;

USE CLASS_APP_DB;

CREATE TABLE CLASS
(
	ID INT NOT NULL,
    `NAME`  VARCHAR(50) NOT NULL,
	TEACHER VARCHAR(50) NOT NULL,
    CONSTRAINT PK_CLASS PRIMARY KEY (ID)
);

CREATE TABLE STUDENT
(
	ID INT NOT NULL,
    NAME  VARCHAR(50) NOT NULL,
	GENDER VARCHAR(50) NOT NULL,
    CLASS_ID INT NOT NULL,
    CONSTRAINT PK_STUDENT PRIMARY KEY (ID),
    CONSTRAINT CHECK_GENDER CHECK (GENDER IN ('Male','Female','male','female')),
    CONSTRAINT FK_STUDENT_CLASS_ID FOREIGN KEY (CLASS_ID) REFERENCES CLASS(ID)
);
CREATE TABLE RESULT
(
	STUDENT_ID INT NOT NULL,
    SUBJECT VARCHAR(50) NOT NULL,
	SCORE DOUBLE NOT NULL,
    CONSTRAINT PK_RESULT PRIMARY KEY (STUDENT_ID),
    CONSTRAINT FK_RESULT_STUDENT_ID FOREIGN KEY (STUDENT_ID) REFERENCES STUDENT(ID)
);


INSERT INTO `CLASS` (ID, `NAME`,`TEACHER`) 
values
(1,"12A","Ho Cong Trung"),
(2,"12B","Dang Tu Anh"),
(3,"12C","Nguyen Van Tam");


INSERT INTO `STUDENT`(ID,`NAME`,`GENDER`,CLASS_ID) 
values
(1,"Dinh Thi Ngoc","Female",2),
(2,"Nguyen Thanh Hung","Male",1),
(3,"Tran Mai Hoa","Female",2),
(4,"Doan Quang Vinh","Male",1),
(5,"Cao Anh Dao","Female",3),
(6,"Tran Kim Tuyen","Male",3);

INSERT INTO `RESULT`(STUDENT_ID,`SUBJECT`,`SCORE`) 
values
(1,"Math",8),
(2,"Literature",7),
(3,"History",9.5),
(4,"Math",6.8),
(5,"Literature",4.9),
(6,"History",8.2);

SELECT * FROM STUDENT
WHERE CLASS_ID = 2;

SELECT st.`NAME`,
	   st.gender,
	   cl.`NAME`
FROM Student st
JOIN Class cl
  ON st.class_id = cl.id; 

SELECT cl.TEACHER AS Teacher_Name,
       COUNT(st.StudentID) AS Number_Of_Students
FROM CLASS cl
JOIN STUDENT st ON cl.ID = st.CLASS_ID
WHERE cl.`NAME` = '12C'
GROUP BY cl.TEACHER;

SELECT c.NAME AS Class_Name,
COUNT(*) AS Number_Of_Students,
GROUP_CONCAT(s.`NAME`) AS Students_With_Scores_Over_8
FROM CLASS c 
JOIN STUDENT s 
ON c.ID = s.CLASS_ID
JOIN RESULT r 
ON s.ID = r.STUDENT_ID
WHERE (r.`SUBJECT` = 'Math' AND r.SCORE >= 8)
OR (r.`SUBJECT` = 'Literature' AND r.SCORE >= 8)
GROUP BY c.NAME


