/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.postgresUno.service;

import com.example.postgresUno.model.City;
import java.util.List;

/**
 *
 * @author soporte
 */
public interface ICityService {
    List<City> findAll();
}
