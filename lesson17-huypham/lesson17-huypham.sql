CREATE SCHEMA DATA_TEST CHARSET utf8mb4;

USE DATA_TEST;
DROP TABLE IF EXISTS SIZE;

CREATE TABLE `CLASS`
(
	ID INT NOT NULL,
    `NAME`  VARCHAR(50) NOT NULL,
	TEACHER VARCHAR(50) NOT NULL,
    CONSTRAINT PK_CLASS PRIMARY KEY (ID)
);

CREATE TABLE  `STUDENT`
(
	ID INT NOT NULL,
    NAME  VARCHAR(50) NOT NULL,
	GENDER VARCHAR(50) NOT NULL,
    CLASS_ID INT NOT NULL,
    CONSTRAINT PK_STUDENT PRIMARY KEY (ID),
    CONSTRAINT CHECK_GENDER CHECK (GENDER IN ('Male','Female','male','female')),
    CONSTRAINT FK_STUDENT_CLASS_ID FOREIGN KEY (CLASS_ID) REFERENCES `class`(ID)
);
CREATE TABLE  `RESULT`
(
	STUDENT_ID INT NOT NULL,
    SUBJECT  VARCHAR(50) NOT NULL,
	SCORE DOUBLE NOT NULL,
    CONSTRAINT PK_RESULT PRIMARY KEY (STUDENT_ID),
    CONSTRAINT FK_RESULT_STUDENT_ID FOREIGN KEY (STUDENT_ID) REFERENCES `STUDENT`(ID)
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
(6,"Tran Kim Tuyen","Male",3),
(7,"Nguyen Dac Duc","Male",3),
(8,"Pham Cong Huy","Male",3),
(9,"Phan Huu Thai","Male",3);

INSERT INTO `RESULT`(STUDENT_ID,`SUBJECT`,`SCORE`) 
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
;

-- EX01: primarykey of Result table: STUDENT_ID

-- EX02:
SELECT st.`NAME` NAME, st.GENDER GENDER, cl.TEACHER TEACHER
  FROM STUDENT st
  JOIN CLASS cl
    ON st.class_id = cl.ID;
-- EX03: 
SELECT TEACHER AS NAME_TEACHER, COUNT(st.CLASS_ID) AS NUMBER_OF_ALL_ST
FROM CLASS cl
INNER JOIN `STUDENT` st
ON cl.ID = st.CLASS_ID
WHERE cl.NAME = '12C'
GROUP BY cl.TEACHER;

-- EX04:
SELECT  cl.teacher , count(s.id) as amout_student
FROM CLASS cl 
JOIN student s ON cl.id = s.class_id
JOIN result r ON  s.id = r.student_id
WHERE r.SUBJECT LIKE "Math" AND r.score >= 8 OR r.SUBJECT LIKE "Literature" AND r.score >= 8
GROUP BY c.teacher;