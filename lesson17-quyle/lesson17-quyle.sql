CREATE SCHEMA lesson17_jdbc_test CHAR SET utf8mb4;
USE lesson17_jdbc_test;

CREATE TABLE CLASS
(
	ID INT,
    `NAME` VARCHAR(20),
    TEACHER VARCHAR(20),
    CONSTRAINT PK_CLASS PRIMARY KEY (ID)
);

CREATE TABLE STUDENT
(
	ID INT,
    `NAME` VARCHAR(20),
    GENDER VARCHAR(20),
    CLASS_ID INT,
    CONSTRAINT PK_STUDENT PRIMARY KEY (ID),
    CONSTRAINT FK_STUDENT FOREIGN KEY (CLASS_ID) REFERENCES CLASS(ID)
);

CREATE TABLE RESULT
(
	STUDENT_ID INT,
    `SUBJECT` VARCHAR(20),
    SCORE FLOAT,
    CONSTRAINT PK_RESULT PRIMARY KEY (STUDENT_ID ,`SUBJECT`),
    CONSTRAINT RESULT_STUDENT FOREIGN KEY (STUDENT_ID) REFERENCES STUDENT(ID)
);


INSERT INTO CLASS(ID, `NAME`, TEACHER)
VALUES(1, "12A", "Ho Cong Trung"),
	  (2, "12B", "Dang Tu Anh"),
	  (3, "12C", "Nguyen Van Tam");
      
INSERT INTO STUDENT(ID, `NAME`, GENDER, CLASS_ID)
VALUES(1, "Dinh Thi Ngoc", "Female", 2),
	  (2, "Nguyen Thanh Hung", "Male", 1),
	  (3, "Tran Mai Hoa", "Female", 2),
	  (4, "Doan Quang Vinh", "Male", 1),
	  (5, "Cao Anh Dao", "Female", 3),
	  (6, "Tran Kim Tuyen", "Male", 3),
      (7, "Le Anh Tuan", "Female", 2),
      (8, "Tran Kim Nguyet", "Male", 1),
      (9, "Tran Kim Quan", "Male", 3);
      
INSERT INTO RESULT(STUDENT_ID, `SUBJECT`, SCORE)
VALUES(1, "Math", 8),
	  (2, "Literature", 7),
      (3, "History", 9.5),
      (4, "Math", 6.8),
      (5, "Literature", 4.9),
      (6, "History", 8.2),
      (7, "Math", 9.8),
      (8, "Literature", 7.2),
      (9, "History", 8.8);
      
SELECT * FROM CLASS;
SELECT * FROM STUDENT;
SELECT * FROM result;

-- cau 2
SELECT st.`NAME`,
	   st.GENDER,
       cl.TEACHER
  FROM student st
  JOIN class cl
    ON st.CLASS_ID = cl.ID;
-- cau 3
SELECT cl.`name` , sum(cl.id) numberOfstuden 
  FROM class cl
  JOIN student st
    ON cl.ID = st.CLASS_ID
 WHERE cl.`NAME` LIKE '%12A%'
 GROUP BY cl.`NAME` ;
 
 -- cau 4
 SELECT st.`NAME`,
		re.`subject`,
        re.SCORE
  FROM class cl
  JOIN student st
    ON cl.ID = st.CLASS_ID
  JOIN result re
	ON re.STUDENT_ID = st.ID
 WHERE (re.`SUBJECT` = 'Math' AND re.SCORE >= 8) OR  (re.`SUBJECT` = 'Literature' AND re.SCORE >= 8);
-- test jdbc
SELECT cl.`name` ,COUNT(*) AS numberOfStuden
  FROM STUDENT st
  JOIN class cl
    ON cl.ID = st.CLASS_ID
GROUP BY st.CLASS_ID;

SELECT st.`NAME`,
		re.`subject`,
        re.SCORE
  FROM class cl
  JOIN student st
    ON cl.ID = st.CLASS_ID
  JOIN result re
	ON re.STUDENT_ID = st.ID
 WHERE re.SCORE = (SELECT max(SCORE) FROM result);


    
