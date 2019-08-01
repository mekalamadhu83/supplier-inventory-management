package com.sim.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sim.entity.SupplierModel;
import com.sim.service.SupplierService;

    @RestController
	@RequestMapping("/supplier")
	public class SupplierController {

		@Autowired
		private SupplierService suppliersService;

		@PostMapping("/create")
		public void createSupplier(@RequestBody SupplierModel supplier) {
			this.suppliersService.createSupplier(supplier);
		}

		@PutMapping("/update")
		public void updateSupplier(@RequestBody SupplierModel supplier) {
			this.suppliersService.updateSupplier(supplier);
		}

		@DeleteMapping("/delete")
		public void deleteSupplier(@PathVariable String supplierId) {
			this.suppliersService.deleteSupplier(supplierId);
		}

		@GetMapping("/get/{supplierId}")
		public SupplierModel getBySupplierId(@PathVariable String supplierId) {
			return this.suppliersService.findById(supplierId);
		}

	}


