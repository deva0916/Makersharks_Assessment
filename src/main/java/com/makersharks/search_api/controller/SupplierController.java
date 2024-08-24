package com.makersharks.search_api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.makersharks.search_api.entity.Supplier;
import com.makersharks.search_api.repository.SupplierRepository;
import com.makersharks.search_api.service.SupplierService;


@RestController
@RequestMapping(value="/api/suppliers", method=RequestMethod.GET)
public class SupplierController {

    @Autowired
    private SupplierRepository supplierRepository;

    @Autowired
    private SupplierService supplierService;

    @PostMapping("/add")
    public Supplier addSupplier(@RequestBody Supplier supplier) {
        System.out.println(supplier);
        return supplierRepository.save(supplier);
    }


    @GetMapping("/search")
    public List<Supplier> searchSuppliers(
            @RequestParam String location,
            @RequestParam String natureOfBusiness,
            @RequestParam String process) {
        return supplierService.searchSuppliers(location, natureOfBusiness, process);
    }
}



