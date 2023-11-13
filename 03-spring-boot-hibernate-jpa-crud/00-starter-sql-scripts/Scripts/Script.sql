select * from employee

select * from users 

select * from authorities

select * from roles

select * from members


CREATE TABLE employee (
  id serial PRIMARY KEY,
  first_name varchar(45),
  last_name varchar(45),
  email varchar(45)
);

INSERT INTO employee (first_name, last_name, email) 
values ('José', 'Fonseca', 'user1@gmail.com'),
('José', 'Fonseca', 'user1@gmail.com'),
('João', 'Paulo', 'user2@gmail.com'),
('Gabriel', 'João', 'user3@gmail.com'),
('Abel', 'Globe', 'user4@gmail.com'),
('Fernanda', 'Paula', 'user5@gmail.com');

