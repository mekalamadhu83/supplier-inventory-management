package com.sim.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "supplier")
public class SupplierModel {
	@Id
	private String supplierId;
	private String supplierName;
	private String supplierEmail;
	private int supplierPhone;
	private int supplierCellPhone;
	private String otherSupplierDetails;
	
	public SupplierModel() {}
	
	@JsonManagedReference("supplier-item")
	@OneToMany(mappedBy = "supplierModel", cascade = CascadeType.ALL)
	private List<SupplierAddressInfo> supplierAddressList;
	
	@JsonManagedReference("supplier_itemmm")
	@OneToMany(mappedBy = "supplierModel",cascade = CascadeType.ALL)
	private List<ItemSupplier> itemSupplierList;

	public String getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public String getSupplierEmail() {
		return supplierEmail;
	}

	public void setSupplierEmail(String supplierEmail) {
		this.supplierEmail = supplierEmail;
	}

	public int getSupplierPhone() {
		return supplierPhone;
	}

	public void setSupplierPhone(int supplierPhone) {
		this.supplierPhone = supplierPhone;
	}

	public int getSupplierCellPhone() {
		return supplierCellPhone;
	}

	public void setSupplierCellPhone(int supplierCellPhone) {
		this.supplierCellPhone = supplierCellPhone;
	}

	public String getOtherSupplierDetails() {
		return otherSupplierDetails;
	}

	public void setOtherSupplierDetails(String otherSupplierDetails) {
		this.otherSupplierDetails = otherSupplierDetails;
	}

	public List<SupplierAddressInfo> getSupplierAddressList() {
		return supplierAddressList;
	}

	public void setSupplierAddressList(List<SupplierAddressInfo> supplierAddressList) {
		this.supplierAddressList = supplierAddressList;
	}

	public List<ItemSupplier> getItemSupplierList() {
		return itemSupplierList;
	}

	public void setItemSupplierList(List<ItemSupplier> itemSupplierList) {
		this.itemSupplierList = itemSupplierList;
	}

	public SupplierModel(String supplierId, String supplierName, String supplierEmail, int supplierPhone,
			int supplierCellPhone, String otherSupplierDetails, List<SupplierAddressInfo> supplierAddressList,
			List<ItemSupplier> itemSupplierList) {
		super();
		this.supplierId = supplierId;
		this.supplierName = supplierName;
		this.supplierEmail = supplierEmail;
		this.supplierPhone = supplierPhone;
		this.supplierCellPhone = supplierCellPhone;
		this.otherSupplierDetails = otherSupplierDetails;
		this.supplierAddressList = supplierAddressList;
		this.itemSupplierList = itemSupplierList;
	}
	
	

}
