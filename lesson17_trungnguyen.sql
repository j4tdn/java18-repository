-- create tables

CREATE TABLE CLASS	
(
    ID INT,
    `NAME`   VARCHAR(100)  NOT NULL,
    TEACHER  VARCHAR(100)  NOT NULL,
    CONSTRAINT PK_CLASS PRIMARY KEY (ID)
);

CREATE TABLE STUDENT
(
    ID INT,
    `NAME`   VARCHAR(100)  NOT NULL,
    GENDER   VARCHAR(100)  NOT NULL,
    CLASS_ID INT NOT NULL,
	CONSTRAINT PK_STUDENT PRIMARY KEY (ID),
    CONSTRAINT FK_STUDENT_CLASS FOREIGN KEY (CLASS_ID) REFERENCES `CLASS` (ID)
);
CREATE TABLE  RESULT
(
	STUDENT_ID INT,
    `SUBJECT` VARCHAR(100),
    SCORE INT NOT NULL,
	CONSTRAINT PK_RESULT PRIMARY KEY (STUDENT_ID,`SUBJECT`),
    CONSTRAINT FK_RESULT_STUDENT FOREIGN KEY (STUDENT_ID) REFERENCES `STUDENT` (ID)
);
ALTER TABLE RESULT
MODIFY COLUMN SCORE DOUBLE NOT NULL;

-- insert values
SET FOREIGN_KEY_CHECKS = 0;

INSERT INTO class(ID, `NAME`,TEACHER)
VALUES(1,'12A','Ho Cong Trung'),
	  (2,'12B', 'Dang Tu Anh'),
      (3,'12C','Nguyen Van Tam');

INSERT INTO STUDENT(ID, `NAME`,GENDER,CLASS_ID)
VALUES(1, 'Dinh Thi Ngoc','FEMALE',2),
	  (2, 'Nguyen Thanh Hung','MALE',1),
      (3, 'Tran Mai Hoa','FEMALE',2),
      (4, 'Doan Quang Vinh','MALE',1),
      (5, 'Cao Anh Dao','FEMALE',3),
      (6, 'Tran Kim Tuyen','MALE',3);
INSERT INTO STUDENT(ID, `NAME`,GENDER,CLASS_ID)
VALUES(7,'Nguyen Thanh Trung','MALE',2),
       (8,'Luong Thanh Tra','MALE',1),
       (9,'Dao Du Don','FEMALE',3);
INSERT INTO RESULT(STUDENT_ID,`SUBJECT`,SCORE)
VALUES(1, 'MATH',8),
	  (2, 'LITERATURE',7),
      (3, 'History',9.5),
      (4, 'Math',6.8),
      (5, 'Literature',4.9),
      (6, 'History',8.2),
      (7, 'Math',9.8), 
      (8, 'Literature',7.2),
	  (9,'History',8.8);
INSERT INTO RESULT(STUDENT_ID,`SUBJECT`,SCORE)
VALUES(7, 'Literature',9);
-- query

-- 1
SELECT st.`NAME`,
       st.GENDER,
       cl.TEACHER
FROM STUDENT st
JOIN CLASS cl
ON st.CLASS_ID=cl.ID;

-- 2

SELECT cl.TEACHER,
       COUNT(st.ID) NUMBEROFSTUDENT
FROM STUDENT st
JOIN CLASS cl
ON st.CLASS_ID=cl.ID
WHERE cl.`NAME`='12C'
GROUP BY cl.ID;

-- 3
SELECT cl.`NAME`,
       COUNT(st.ID) NUMBEROFSTUDENT
FROM STUDENT st
JOIN CLASS cl
ON st.CLASS_ID=cl.ID
JOIN RESULT rs
ON rs.STUDENT_ID=st.ID
WHERE (`SUBJECT`='Math' AND SCORE>8)

GROUP BY cl.ID;

 
     
      