package com.luv2code.springboot.cruddemo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.springframework.web.bind.annotation.PostMapping;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

@Entity
@Table(name="veiculos")
public class Veiculo {

    // define fields

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="placa")
    private String placa;

    @Column(name="modelo")
    private String modelo;

    @Column(name="ano")
    private String ano;

    @Column(name="tipo")
    private String tipo;

    @Column(name = "entrada")
    private LocalDateTime entrada;

    @Column(name = "saida")
    private LocalDateTime saida;

    @Column(name = "valor")
    private double valor;

    // define constructors

    public Veiculo() {

    }

    public Veiculo(String placa, String modelo, String ano, String tipo) {
        this.placa = placa;
        this.modelo = modelo;
        this.ano = ano;
        this.tipo = tipo;
    }

    // define getter/setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public LocalDateTime getEntrada() {
        return entrada;
    }

    public void setEntrada(LocalDateTime entrada) {
        this.entrada = entrada;
    }

    public LocalDateTime getSaida() {
        return saida;
    }

    public void setSaida(LocalDateTime saida) {
        this.saida = saida;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "id=" + id +
                ", placa='" + placa + '\'' +
                ", modelo='" + modelo + '\'' +
                ", ano='" + ano + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }

    @PostMapping("/valor")
    public Double calcularValor(Veiculo theVeiculo) {
        long tempoEstacionado = ChronoUnit.HOURS.between(saida, entrada); // em horas

        if (tempoEstacionado <= 1) {
            valor = 2.0;
        } else if (tempoEstacionado <= 2) {
            valor = 3.0;
        } else if (tempoEstacionado <= 3) {
            valor = 5.0;
        } else {
            valor = 5.0 + 2.0 * (tempoEstacionado - 3);
        }
        return valor;
    }
}