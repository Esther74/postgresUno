/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.postgresUno.controller;

import com.example.postgresUno.model.City;
import com.example.postgresUno.service.ICityService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController; //como JSON

/**
 *
 * @author soporte
 */

//@RestController // si lo muestro com JSON
@Controller
public class MyController {
    
    @Autowired
    private ICityService cityService;
    
    @GetMapping("/showCities")
    //public List<City> findCities(){ //como JSON
    public String findCities(Model model){
        //return cityService.findAll(); //como JSON
        List<City> cities = cityService.findAll();
        
        
        model.addAttribute("cities", cities);
        return "showCities";
    }
    
    //http://localhost:8080/showCities
    
    
}
