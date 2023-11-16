package com.luv2code.springboot.cruddemo.service;

import com.luv2code.springboot.cruddemo.dao.EstacionamentoSegsRepository;
import com.luv2code.springboot.cruddemo.entity.EstacionamentoSegs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstacionamentoSegsServiceImpl implements EstacionamentoSegsService {

    private EstacionamentoSegsRepository estacionamentoSegsRepository;

    @Autowired
    public EstacionamentoSegsServiceImpl(EstacionamentoSegsRepository theEmployeeRepository) {
        estacionamentoSegsRepository = theEmployeeRepository;
    }

    @Override
    public List<EstacionamentoSegs> findAll() {
        return estacionamentoSegsRepository.findAllByOrderByLastNameAsc();
    }

    @Override
    public EstacionamentoSegs findById(int theId) {
        Optional<EstacionamentoSegs> result = estacionamentoSegsRepository.findById(theId);

        EstacionamentoSegs theEmployee = null;

        if (result.isPresent()) {
            theEmployee = result.get();
        } else {
            // we didn't find the employee
            throw new RuntimeException("Did not find employee id - " + theId);
        }

        return theEmployee;
    }

    @Override
    public void save(EstacionamentoSegs theEmployee) {
        estacionamentoSegsRepository.save(theEmployee);
    }

    @Override
    public void deleteById(int theId) {
        estacionamentoSegsRepository.deleteById(theId);
    }

}