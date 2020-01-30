CREATE TABLE student(
	id UUID PRIMARY KEY NOT NULL,
	name VARCHAR(255),
	surname VARCHAR(255),
	status VARCHAR(255),
	year INTEGER,
	budget BOOLEAN
);
CREATE TABLE professor(
	id UUID PRIMARY KEY NOT NULL,
	name VARCHAR(255),
	surname VARCHAR(255),
	status VARCHAR(255),
	sallary REAL
);
CREATE TABLE exam(
	id UUID PRIMARY KEY NOT NULL,
	name VARCHAR(255),
	professor_id UUID not null references professor(id)
);
CREATE TABLE student_exam (
   student_id UUID references student(id),
   exam_id UUID references exam(id),
   PRIMARY KEY(student_id, exam_id)
);