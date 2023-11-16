package com.luv2code.springboot.cruddemo.dao;


import com.luv2code.springboot.cruddemo.entity.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VeiculoRepository extends JpaRepository<Veiculo, Integer> {

    // that's it ... no need to write any code LOL!

    // add a method to sort by last name
    public List<Veiculo> findAllByOrderByModeloAsc();

}