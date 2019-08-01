package com.sim.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sim.entity.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, String>{

}
