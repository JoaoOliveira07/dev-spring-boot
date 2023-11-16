package com.luv2code.springboot.cruddemo.service;


import com.luv2code.springboot.cruddemo.entity.EstacionamentoSegs;

import java.util.List;

public interface EstacionamentoSegsService {

    List<EstacionamentoSegs> findAll();

    EstacionamentoSegs findById(int theId);

    void save(EstacionamentoSegs theEmployee);

    void deleteById(int theId);

}
