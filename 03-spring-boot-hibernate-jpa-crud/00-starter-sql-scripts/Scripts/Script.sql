select * from employee

select * from users 

select * from authorities

select * from roles

select * from estacionamento_segs



CREATE TABLE registro (
  id SERIAL PRIMARY KEY,
  placa varchar(7),
  times varchar(30),
  ano_carro varchar(4),
  tipo_automovel varchar(15)
);

-- Insert data
INSERT INTO employee (first_name, last_name, email) VALUES
  ('Leslie', 'Andrews', 'leslie@luv2code.com'),
  ('Emma', 'Baumgarten', 'emma@luv2code.com'),
  ('Avani', 'Gupta', 'avani@luv2code.com'),
  ('Yuri', 'Petrov', 'yuri@luv2code.com'),
  ('Juan', 'Vega', 'juan@luv2code.com');
