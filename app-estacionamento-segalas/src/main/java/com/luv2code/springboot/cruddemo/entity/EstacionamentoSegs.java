package com.luv2code.springboot.cruddemo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="estacionamento_segs")
public class EstacionamentoSegs {

    // define fields

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="placa")
    private String placa;

    @Column(name="modelo")
    private String modelo;

    @Column(name="ano_carro")
    private String ano;

    @Column(name="tipo_automovel")
    private String tipoAutomovel;

    public EstacionamentoSegs() {

    }

    public EstacionamentoSegs(int id, String placa, String modelo, String ano, String tipoAutomovel) {
        this.id = id;
        this.placa = placa;
        this.modelo = modelo;
        this.ano = ano;
        this.tipoAutomovel = tipoAutomovel;
    }

    public EstacionamentoSegs(String placa, String modelo, String ano, String tipoAutomovel) {
        this.placa = placa;
        this.modelo = modelo;
        this.ano = ano;
        this.tipoAutomovel = tipoAutomovel;
    }

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

    public String getTipoAutomovel() {
        return tipoAutomovel;
    }

    public void setTipoAutomovel(String tipoAutomovel) {
        this.tipoAutomovel = tipoAutomovel;
    }

    @Override
    public String toString() {
        return "EstacionamentoSegs{" +
                "id=" + id +
                ", placa='" + placa + '\'' +
                ", modelo='" + modelo + '\'' +
                ", ano='" + ano + '\'' +
                ", tipoAutomovel='" + tipoAutomovel + '\'' +
                '}';
    }
}