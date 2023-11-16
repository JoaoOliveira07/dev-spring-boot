CREATE DATABASE  IF NOT EXISTS `employee_directory`;
USE `employee_directory`;

--
-- Table structure for table `employee`
--

-- Drop table if exists
DROP TABLE IF EXISTS employee;

-- Create table
CREATE TABLE employee (
  id SERIAL PRIMARY KEY,
  first_name varchar(45),
  last_name varchar(45),
  email varchar(45)
);

-- Insert data
INSERT INTO employee (first_name, last_name, email) VALUES
  ('Leslie', 'Andrews', 'leslie@luv2code.com'),
  ('Emma', 'Baumgarten', 'emma@luv2code.com'),
  ('Avani', 'Gupta', 'avani@luv2code.com'),
  ('Yuri', 'Petrov', 'yuri@luv2code.com'),
  ('Juan', 'Vega', 'juan@luv2code.com');


