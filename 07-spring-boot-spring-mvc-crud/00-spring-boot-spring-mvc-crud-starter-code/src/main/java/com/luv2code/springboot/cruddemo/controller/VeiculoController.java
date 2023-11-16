package com.luv2code.springboot.cruddemo.controller;



import com.luv2code.springboot.cruddemo.entity.Veiculo;
import com.luv2code.springboot.cruddemo.service.VeiculoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/veiculos")
public class VeiculoController {

    private VeiculoService veiculoService;

    public VeiculoController(VeiculoService theVeiculoService) {
        veiculoService = theVeiculoService;
    }

    // add mapping for "/list"

    @GetMapping("/list")
    public String listVeiculos(Model theModel) {

        // get the employees from db
        List<Veiculo> theVeiculos = veiculoService.findAll();

        // add to the spring model
        theModel.addAttribute("veiculos", theVeiculos);

        return "veiculos/list-veiculos";
    }

    @GetMapping("/showFormForAdd")
    public String showFormForAdd(Model theModel) {

        // create model attribute to bind form data
        Veiculo theVeiculos = new Veiculo();

        theModel.addAttribute("veiculo", theVeiculos);

        return "veiculos/veiculo-form";
    }

    @PostMapping("/showFormForUpdate")
    public String showFormForUpdate(@RequestParam("veiculoId") int theId,
                                    Model theModel) {

        // get the employee from the service
        Veiculo theVeiculos = veiculoService.findById(theId);

        // set employee as a model attribute to pre-populate the form
        theModel.addAttribute("veiculo", theVeiculos);

        // send over to our form
        return "veiculos/veiculo-form";
    }

    @PostMapping("/save")
    public String saveVeiculo(@ModelAttribute("veiculo") Veiculo theVeiculos) {

        // save the employee
        veiculoService.save(theVeiculos);

        // use a redirect to prevent duplicate submissions
        return "redirect:/veiculos/list";
    }

    @PostMapping("/delete")
    public String delete(@RequestParam("veiculoId") int theId) {

        // delete the employee
        veiculoService.deleteById(theId);

        // redirect to /employees/list
        return "redirect:/veiculos/list";

    }
}