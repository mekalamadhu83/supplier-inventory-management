package com.sim.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sim.entity.SupplierModel;
import com.sim.repository.SupplierRepository;
import com.sim.service.SupplierService;


@Service
public class SupplierServiceImpl implements SupplierService{
	
	
	
	@Autowired
	private SupplierRepository supplierRepository;

	@Override
	public void createSupplier(SupplierModel supplier) {
		this.supplierRepository.saveAndFlush(supplier);
			
	}

	@Override
	public void updateSupplier(SupplierModel supplier) {
		this.supplierRepository.saveAndFlush(supplier);
	}

	@Override
	public void deleteSupplier(String supplierId) {
		this.supplierRepository.deleteById(supplierId);	
	}

	@Override
	public SupplierModel findById(String supplierId) {
		SupplierModel tmpObj = new SupplierModel();
		tmpObj = this.supplierRepository.getOne(supplierId);
		return tmpObj;
	}

}
