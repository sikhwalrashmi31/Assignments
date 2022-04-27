package com.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


import com.springrest.entities.zipcode;
import com.springrest.services.zipcodeService;

@RestController
public class MainController {
	
    @Autowired
    private zipcodeService ZipcodeService;

    @GetMapping("/country-details/{id}")
    public zipcode getByZipcode(@PathVariable("id") int id) {
        System.out.println("Zipcode is: " + id);
        return ZipcodeService.getzipcodeByzipcode(id);

    }

    @GetMapping("/country-details")
    public List<zipcode> getAll() {

        for (zipcode z : ZipcodeService.getAll()) {
            System.out.println(z);
        }
        return ZipcodeService.getAll();
    }

}
