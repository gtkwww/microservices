package com.microservices.customersservice.web;

import com.microservices.customersservice.backend.domain.CustomerService;
import com.microservices.common.customer.ToAccountInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    public void addToAccount(@PathVariable String id, @Validated @RequestBody ToAccountInfo request) {

    }

}
