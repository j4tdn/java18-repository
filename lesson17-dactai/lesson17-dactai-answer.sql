USE LESSON17_DACTAI;

-- Câu 1: Khoá chính của bảng Result là student_id và subject

-- List name, gender, and teacher name of all students
SELECT st.`NAME`, st.GENDER, c.TEACHER FROM student st
		JOIN class c
        ON st.CLASS_ID = c.ID;
        
-- List teacher name and number of all student in class 12C
SELECT st.`NAME`, st.GENDER, c.TEACHER FROM student st
		JOIN class c
        ON st.CLASS_ID = c.ID
        WHERE c.`NAME` LIKE "12C";
        
-- List the class name and number of the students who have good at Math(score >= 8) and good at Literature(score >= 8)
SELECT st.`NAME`, st.GENDER, r.`SUBJECT`, r.SCORE  FROM  result r
		JOIN student st
        ON r.STUDENT_ID = st.ID
        WHERE (r.`SUBJECT` = "Math" OR r.`SUBJECT` = "Literature") AND r.SCORE >= 8;
        
SELECT st.CLASS_ID, COUNT(st.CLASS_ID) AS AMOUNT_OF_STUDENTS FROM class c 
		JOIN student st
        ON st.CLASS_ID = c.ID
        GROUP BY st.CLASS_ID;
        