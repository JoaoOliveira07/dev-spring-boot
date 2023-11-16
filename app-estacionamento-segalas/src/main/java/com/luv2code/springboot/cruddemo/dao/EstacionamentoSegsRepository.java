package com.luv2code.springboot.cruddemo.dao;


import com.luv2code.springboot.cruddemo.entity.EstacionamentoSegs;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EstacionamentoSegsRepository extends JpaRepository<EstacionamentoSegs, Integer> {

    // that's it ... no need to write any code LOL!

    // add a method to sort by last name
    public List<EstacionamentoSegs> findAllByOrderByLastNameAsc();

}