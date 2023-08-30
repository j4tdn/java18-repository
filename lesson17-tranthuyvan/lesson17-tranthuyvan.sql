CREATE DATABASE lesson17_tranthuyvan CHAR SET utf8mb4;

USE lesson17_tranthuyvan;

CREATE TABLE `CLASS`
(
	ID		   INT, 
    `NAME`     VARCHAR(100) NOT NULL,
    TEACHER   VARCHAR(100) NOT NULL, 
    CONSTRAINT PK_CLASS  PRIMARY KEY (ID)
);

CREATE TABLE `STUDENT`
(
    StudentID     INT, 
    `NAME`        VARCHAR(100) NOT NULL,
    GENDER        VARCHAR(20)  NOT NULL,
    CLASS_ID      INT, 
    CONSTRAINT PK_STUDENT PRIMARY KEY (StudentID),
    CONSTRAINT FK_STUDENT_CLASS FOREIGN KEY (CLASS_ID) REFERENCES CLASS(ID)
);

CREATE TABLE `RESULT`
(
    StudentID    INT,
    `SUBJECT`    VARCHAR(100) NOT NULL,
    SCORE        INT NOT NULL,
    CONSTRAINT FK_RESULT_STUDENT FOREIGN KEY (StudentID) REFERENCES STUDENT(StudentID)
);

INSERT INTO `CLASS` (ID, `NAME`, TEACHER)
VALUES
    (1, '12A', 'Ho Cong Trung'),
    (2, '12B', 'Dang Tu Anh'),
    (3, '12C', 'Nguyen Van Tam');

INSERT INTO `STUDENT` (StudentID, `NAME`, GENDER)
VALUES
    (1, 'Dinh Thi Ngoc', 'Female'),
    (2, 'Nguyen Thanh Hung', 'Male'),
    (3, 'Tran Mai Hoa', 'Female'),
    (4, 'Doan Quang Vinh', 'Male'),
    (5, 'Cao Anh Dao', 'Female'),
    (6, 'Tran Kim Tuyen', 'Male');

INSERT INTO `RESULT` (StudentID, `SUBJECT`, SCORE)
VALUES
    (1, 'Math', 8),
    (2, 'Literature', 7),
    (3, 'History', 9.5),
    (4, 'Math', 6.8),
    (5, 'Literature', 4.9),
    (6, 'History', 8.2);
    
UPDATE STUDENT
SET CLASS_ID = 1
WHERE StudentID IN (2, 4);

UPDATE STUDENT
SET CLASS_ID = 2
WHERE StudentID IN (1, 3);

UPDATE STUDENT
SET CLASS_ID = 3
WHERE StudentID = 5;

UPDATE STUDENT
SET CLASS_ID = 3
WHERE StudentID = 6;

    
-- 1. Primary key of Result table is student_id

-- 2. List name, gender and class name of all students 
SELECT st.`NAME`,
	   st.gender,
	   cl.`NAME`
FROM Student st
JOIN Class cl
  ON st.class_id = cl.id; 
  
-- 3. List teacher name and number of all student in class 12C
SELECT cl.TEACHER AS Teacher_Name,
       COUNT(st.StudentID) AS Number_Of_Students
FROM CLASS cl
JOIN STUDENT st ON cl.ID = st.CLASS_ID
WHERE cl.`NAME` = '12C'
GROUP BY cl.TEACHER;

-- 4. List name and number of students who have good at Math (score >= 8) and good at Literature (score >= 8)
SELECT c.NAME AS Class_Name,
       COUNT(*) AS Number_Of_Students,
       GROUP_CONCAT(s.`NAME`) AS Students_With_Good_Scores
FROM CLASS c
JOIN STUDENT s ON c.ID = s.CLASS_ID
JOIN RESULT r ON s.StudentID = r.StudentID
WHERE (r.`SUBJECT` = 'Math' AND r.SCORE >= 8)
   OR (r.`SUBJECT` = 'Literature' AND r.SCORE >= 8)
GROUP BY c.NAME;







