USE `employee_directory`;

DROP TABLE IF EXISTS `authorities`;
DROP TABLE IF EXISTS `users`;

--
-- Table structure for table `users`
--

-- Criação da tabela 'users' no PostgreSQL
CREATE TABLE users (
  username varchar(50) NOT NULL,
  password varchar(50) NOT NULL,
  enabled smallint NOT NULL,
  PRIMARY KEY (username)
);

-- Inserção de dados na tabela 'users' no PostgreSQL
INSERT INTO users (username, password, enabled)
VALUES
  ('john', '{noop}test123', 1),
  ('mary', '{noop}test123', 1),
  ('susan', '{noop}test123', 1);


-- Criação da tabela 'authorities' no PostgreSQL
CREATE TABLE authorities (
  username varchar(50) NOT NULL,
  authority varchar(50) NOT NULL,
  CONSTRAINT authorities_pk PRIMARY KEY (username, authority),
  CONSTRAINT authorities_fk FOREIGN KEY (username) REFERENCES users (username)
);

-- Inserção de dados na tabela 'authorities' no PostgreSQL
INSERT INTO authorities (username, authority)
VALUES
  ('john', 'ROLE_EMPLOYEE'),
  ('mary', 'ROLE_EMPLOYEE'),
  ('mary', 'ROLE_MANAGER'),
  ('susan', 'ROLE_EMPLOYEE'),
  ('susan', 'ROLE_MANAGER'),
  ('susan', 'ROLE_ADMIN');

