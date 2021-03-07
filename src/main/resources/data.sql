

CREATE TABLE IF NOT EXISTS Department (
 
  id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  description  VARCHAR(250) NOT NULL
 
);


CREATE TABLE IF NOT EXISTS Student (
 
  id INT AUTO_INCREMENT  PRIMARY KEY,
  firstname VARCHAR(250) NOT NULL,
  lastname  VARCHAR(250) NOT NULL
 
);


INSERT INTO Department (name, description) VALUES
  ('CSE', 'Computer Science'),
  ('EEE', 'Electronics and Electrical'),
  ('ECE', 'Electronics and Communication');
  
  INSERT INTO Student (firstname, lastname) VALUES
  ('Lova Chittumuri', 'Lova Chittumuri Test Case'),
  ('Ramu Chittumuri', 'Ramu Chittumuri Retest Case'),
  ('Arvind Chittumuri', 'Arvind Chittumuri ReReTest Case');
  
  
  