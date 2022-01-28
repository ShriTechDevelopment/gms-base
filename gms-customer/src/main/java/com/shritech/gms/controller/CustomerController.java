package com.shritech.gms.controller;

import com.shritech.gms.dto.CustomerDTO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/v1/customers")
public class CustomerController {

    @GetMapping("/get/all")
    public ResponseEntity<List<CustomerDTO>> getAllCustomers(){

        List<CustomerDTO> customerDTOS = List.of(
                new CustomerDTO(101l, "Shrikant Pradhan", "Nagpur", 7769896344l),
                new CustomerDTO(102l, "Sachin Pradhan", "Vilam", 8465896633l),
                new CustomerDTO(103l, "Vishal Pradhan", "Umrer", 8965236699l),
                new CustomerDTO(104l, "Tushar Pradhan", "Bhandara", 9563256699l));

        return new ResponseEntity<List<CustomerDTO>>(customerDTOS, HttpStatus.OK);

    }
}
