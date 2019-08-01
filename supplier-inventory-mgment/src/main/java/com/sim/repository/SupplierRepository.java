package com.sim.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sim.entity.SupplierModel;

@Repository
public interface SupplierRepository extends JpaRepository<SupplierModel, String>{

}
