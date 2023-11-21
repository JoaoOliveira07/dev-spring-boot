package com.luv2code.springboot.cruddemo.service;

import com.luv2code.springboot.cruddemo.dao.VeiculoRepository;
import com.luv2code.springboot.cruddemo.entity.Veiculo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.expression.ParseException;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class VeiculoServiceImpl implements VeiculoService {

    private VeiculoRepository veiculoRepository;

    @Autowired
    public VeiculoServiceImpl(VeiculoRepository theVeiculoRepository) {
        veiculoRepository = theVeiculoRepository;
    }

    @Override
    public List<Veiculo> findAll() {
        return veiculoRepository.findAllByOrderByModeloAsc();
    }

    @Override
    public Veiculo findById(int theId) {
        Optional<Veiculo> result = veiculoRepository.findById(theId);

        Veiculo theVeiculo = null;

        if (result.isPresent()) {
            theVeiculo = result.get();
        }
        else {
            // we didn't find the employee
            throw new RuntimeException("Não foi encontrado ID- " + theId);
        }

        return theVeiculo;
    }

    @Override
    public void save(Veiculo theVeiculo) {
        veiculoRepository.save(theVeiculo);
        theVeiculo.calcularValor(theVeiculo);
    }

    @Override
    public void deleteById(int theId) {
        veiculoRepository.deleteById(theId);
    }



}