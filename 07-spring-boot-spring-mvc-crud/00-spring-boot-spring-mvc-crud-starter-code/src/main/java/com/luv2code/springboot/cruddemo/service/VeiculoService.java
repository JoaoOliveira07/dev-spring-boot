package com.luv2code.springboot.cruddemo.service;


import com.luv2code.springboot.cruddemo.entity.Veiculo;

import java.util.List;

public interface VeiculoService {

    List<Veiculo> findAll();

    Veiculo findById(int theId);

    void save(Veiculo theVeiculo);

    void deleteById(int theId);

}
