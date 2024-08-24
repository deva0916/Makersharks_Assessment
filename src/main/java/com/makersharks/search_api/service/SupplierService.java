package com.makersharks.search_api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.makersharks.search_api.entity.Supplier;
import com.makersharks.search_api.repository.SupplierRepository;

@Service
public class SupplierService {
    @Autowired
    private SupplierRepository supplierRepository;

    public List<Supplier> searchSuppliers(String location, String natureOfBusiness, String process) {
        return supplierRepository.findByLocationAndNatureOfBusinessAndManufacturingProcessesContaining(
                location, natureOfBusiness, process);
    }
}



