CREATE TABLE students (
    id INT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    full_name VARCHAR(101) NOT NULL,
    birth_date DATE NOT NULL,
    email VARCHAR(254) NOT NULL UNIQUE,
    phone VARCHAR(30),
    admission_year INT NOT NULL
);

CREATE TABLE disciplines (
    id INT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    title VARCHAR(101) NOT NULL,
    description VARCHAR(767),
    credits INT NOT NULL,
    hours INT NOT NULL
);

CREATE TABLE student_disciplines (
    student_id INT NOT NULL REFERENCES students(id) ON DELETE CASCADE,
    discipline_id INT NOT NULL REFERENCES disciplines(id) ON DELETE CASCADE,
    group_number INT NOT NULL,
    PRIMARY KEY (student_id, discipline_id)
);

SELECT student.full_name, student.email
FROM students 
JOIN student_disciplines ON students.id = student_disciplines.student_id
JOIN disciplines ON student_disciplines.discipline_id = disciplines.id
WHERE disciplines.title = 'Програмування' AND student_disciplines.group_number = 5;