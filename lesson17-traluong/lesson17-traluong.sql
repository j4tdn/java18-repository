-- create table student
DROP TABLE IF EXISTS `Student`;
CREATE TABLE `Student` (
	ID 			INT,
    `NAME` 		VARCHAR(100) 	NOT NULL,
    `GENDER` 	BIT,
    CLASS_ID	INT,
    
    CONSTRAINT PK_STUDENT PRIMARY KEY (ID)
);

-- create table class
DROP TABLE IF EXISTS `Class`;
CREATE TABLE `Class` (
	ID			INT,
    `NAME`		VARCHAR(100) NOT NULL,
	`TEACHER`	VARCHAR(100) NOT NULL,    
    CONSTRAINT PK_CLASS PRIMARY KEY (ID)

);

-- create table result
DROP TABLE IF EXISTS `result`;

CREATE TABLE `result` (
	STUDENT_ID 		INT,
    `SUBJECT`		VARCHAR(100),
    SCORE			DOUBLE,
    
	CONSTRAINT PK_RESULT PRIMARY KEY (STUDENT_ID, `SUBJECT`)
);


-- add foreign key for table student
ALTER TABLE `Student` 
ADD CONSTRAINT FK_STUDENT_CLASS FOREIGN KEY (ID) REFERENCES CLASS(ID);

-- add foreign key for table result
ALTER TABLE `result`
ADD CONSTRAINT FK_RESULT_STUDENT FOREIGN KEY (STUDENT_ID) REFERENCES STUDENT(ID);

-- insert data to table class

INSERT INTO `class` (ID, `NAME`, TEACHER) 
VALUES 	(1, '12A', 'Ho Cong Trung'),
		(2, '12B', 'Dang Tu Anh'),
        (3, '12C', 'Nguyen Van Tam');
-- insert data to table student

-- Adjust  FK_STUDENT_CLASS

ALTER TABLE STUDENT
DROP CONSTRAINT  FK_STUDENT_CLASS;
ALTER TABLE `Student` 
ADD CONSTRAINT FK_STUDENT_CLASS FOREIGN KEY (CLASS_ID) REFERENCES CLASS(ID);

	

INSERT INTO `student`(ID, `NAME`, GENDER, CLASS_ID)
VALUES	(1, 'Dinh Thi Ngoc', 		0, 2),
		(2, 'Nguyen Thanh Hung', 	1, 1),	
        (3, 'Tran Mai Hoa', 		0, 2),
        (4, 'Doan Quang Vinh', 		1, 1 ),
        (5, 'Cao Anh Dao', 			0, 3),
        (6, 'Tran Kim Tuyen', 		1, 3);

-- insert data into result

INSERT INTO result(STUDENT_ID, `SUBJECT`, SCORE)
VALUES 	(1, 'Math',			8.0),
		(2, 'Literature',	7.0),
        (3, 'History', 		9.5),
        (4, 'Math',			6.8),
        (5, 'Literature',	4.9),
        (6, 'History', 		8.2);
        
 -- 2. List name, gender and teacher name of all student
 
 SELECT	st.`NAME`, st.GENDER, cl.TEACHER
   FROM student st
   JOIN	class cl ON st.CLASS_ID = cl.id;
   
-- 3. List teacher name and number of all student in class 12C

SELECT * 
  FROM student st
   JOIN class cl ON st.CLASS_ID = cl.ID
  WHERE st.CLASS_ID IN (SELECT ID FROM class
				WHERE `NAME` = '12C');
 
-- 4. List class name and number of students who have good at Math (score >= 8) and good at Literature (score >= 8)

SELECT * 
  FROM student st
  JOIN result rs ON st.ID = rs.STUDENT_ID
 WHERE rs.`SUBJECT` = 'Math' AND rs.SCORE >= 8
	OR rs.`SUBJECT` = 'Literature' AND rs.SCORE >= 8;
 

