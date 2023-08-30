USE java18_lesson17_exam;

CREATE TABLE student
(
	ID         INT,
    `NAME`     VARCHAR(100),
    GENDER     VARCHAR(10) ,
    CLASS_ID   INT ,
    CONSTRAINT PK_STUDENT PRIMARY KEY (ID),
    CONSTRAINT FK_STUDENT_CLASS FOREIGN KEY (CLASS_ID) REFERENCES CLASS(ID)
);

CREATE TABLE result
(
	STUDENT_ID INT,
    `SUBJECT` VARCHAR(50),
    SCORE FLOAT,
    CONSTRAINT FK_RESULT_STUDENT FOREIGN KEY (STUDENT_ID) REFERENCES STUDENT(ID)
);

CREATE TABLE class
(
	ID INT,
    `NAME` VARCHAR(100),
    TEACHER VARCHAR(100),
    CONSTRAINT PK_CLASS PRIMARY KEY (ID)
);

INSERT INTO class (ID, `NAME`, TEACHER)
VALUES (1, '12A', 'Ho Cong Trung'),
	   (2, '12B', 'Dang Tu Anh'),
       (3, '12C', 'Nguyen Van Tam');

INSERT INTO student (ID, `NAME`, GENDER, CLASS_ID)
VALUES (1, 'Dinh Thi Ngoc', 'Female', 2),
	   (2, 'Nguyen Thanh Hung', 'Male', 1),
       (3, 'Tran Mai Hoa', 'Female', 2),
       (4, 'Doan Quang Vinh', 'Male', 1),
       (5, 'Cao Anh Dao', 'Female', 3),
       (6, 'Tran Kim Tuyet', 'Male', 3);
       
INSERT INTO result (STUDENT_ID, `SUBJECT`, SCORE)
VALUES (1, 'Math', 8),
	   (2, 'Literature', 7),
       (3, 'History', 8),
       (4, 'Math', 8),
       (5, 'Literature', 8),
       (6, 'History', 8);
       
SELECT std.`name`, std.gender, cls.teacher
FROM (class cls JOIN student std ON cls.id = std.class_id);

SELECT cls.teacher, COUNT(*)
FROM (class cls JOIN student std ON cls.id = std.class_id)
WHERE cls.`name` = '12C';

SELECT cls.`name` AS class, COUNT(*) AS quantity
FROM (class cls JOIN student std ON cls.id = std.class_id JOIN result rs ON std.id = rs.student_id)
WHERE rs.score >= 8
GROUP BY cls.id;


