/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.postgresUno.repository;

import com.example.postgresUno.model.City;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author soporte
 */
@Repository
public interface CityRepository extends CrudRepository<City, Long>{
    
}
