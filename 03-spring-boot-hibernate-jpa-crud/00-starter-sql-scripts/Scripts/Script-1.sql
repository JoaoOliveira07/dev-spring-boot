CREATE TABLE registro (
    id SERIAL PRIMARY KEY,
    veiculo_id INT REFERENCES veiculos(veiculo_id) NOT NULL,
    entrada_veiculos TIMESTAMP,
    saida_veiculos TIMESTAMP,
    CONSTRAINT fk_veiculo FOREIGN KEY (veiculo_id) REFERENCES veiculos(veiculo_id)
);

CREATE TABLE veiculos (
  veiculo_id SERIAL PRIMARY KEY,
  placa_veiculo varchar(7),
  modelo_veiculo varchar(30),
  ano_carro varchar(4),
  tipo_veiculo varchar(20)
);

select * from veiculos

select * from registro 

select * from employee