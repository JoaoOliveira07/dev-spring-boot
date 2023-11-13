USE `employee_directory`;

DROP TABLE IF EXISTS `roles`;
DROP TABLE IF EXISTS `members`;

--
-- Table structure for table `members`
--
-- Criação da tabela 'members' no PostgreSQL
CREATE TABLE members (
  user_id varchar(50) NOT NULL,
  pw char(68) NOT NULL,
  active smallint NOT NULL,
  PRIMARY KEY (user_id)
);

-- Inserção de dados na tabela 'members' no PostgreSQL
INSERT INTO members (user_id, pw, active)
VALUES
('john', '$2a$10$qeS0HEh7urweMojsnwNAR.vcXJeXR1UcMRZ2WcGQl9YeuspUdgF.q', 1),
('mary', '$2a$10$qeS0HEh7urweMojsnwNAR.vcXJeXR1UcMRZ2WcGQl9YeuspUdgF.q', 1),
('susan', '$2a$10$qeS0HEh7urweMojsnwNAR.vcXJeXR1UcMRZ2WcGQl9YeuspUdgF.q', 1);

-- Criação da tabela 'roles' no PostgreSQL
CREATE TABLE roles (
  user_id varchar(50) NOT NULL,
  role varchar(50) NOT NULL,
  CONSTRAINT roles_pk PRIMARY KEY (user_id, role),
  CONSTRAINT roles_fk FOREIGN KEY (user_id) REFERENCES members (user_id)
);

-- Inserção de dados na tabela 'roles' no PostgreSQL
INSERT INTO roles (user_id, role)
VALUES
('john', 'ROLE_EMPLOYEE'),
('mary', 'ROLE_EMPLOYEE'),
('mary', 'ROLE_MANAGER'),
('susan', 'ROLE_EMPLOYEE'),
('susan', 'ROLE_MANAGER'),
('susan', 'ROLE_ADMIN');
