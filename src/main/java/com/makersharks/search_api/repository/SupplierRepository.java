package com.makersharks.search_api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.makersharks.search_api.entity.Supplier;
@Repository
public interface SupplierRepository extends JpaRepository<Supplier, Long> {
    List<Supplier> findByLocationAndNatureOfBusinessAndManufacturingProcessesContaining(
            String location, String natureOfBusiness, String manufacturingProcesses);
}



