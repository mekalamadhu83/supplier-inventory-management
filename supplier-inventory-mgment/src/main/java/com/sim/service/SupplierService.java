package com.sim.service;

import com.sim.entity.SupplierModel;

public interface SupplierService {
	
	public void createSupplier(SupplierModel supplier);

	public void updateSupplier(SupplierModel supplier);

	public void deleteSupplier(String supplierId);

	public SupplierModel findById(String supplierId);

}
