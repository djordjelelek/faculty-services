CREATE TABLE student(
	id UUID PRIMARY KEY NOT NULL,
	name VARCHAR(255),
	surname VARCHAR(255),
	status VARCHAR(255),
	sex VARCHAR(255),
	year INTEGER,
	budget BOOLEAN
);
CREATE TABLE professor(
	id UUID PRIMARY KEY NOT NULL,
	name VARCHAR(255),
	surname VARCHAR(255),
	status VARCHAR(255),
	sex VARCHAR(255),
	sallary REAL
);