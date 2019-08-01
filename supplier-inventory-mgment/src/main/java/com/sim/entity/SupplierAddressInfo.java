package com.sim.entity;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "supplier_address_info")
public class SupplierAddressInfo {
	@Id
	private String supplierAddressId;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "address_id")
	private Address address;
	
	@JsonBackReference("supplier-item")
	@ManyToOne
	@JoinColumn(name = "supplier_id")
	private SupplierModel supplierModel;

	@OneToOne
	@JoinColumn(name="address_type_code")
	private RefAddressType refAddressType;
	
	//private String addressTypeCode;
	private Date dateAddressFrom;
	private Date dateAddressTo;
	
	public SupplierAddressInfo() {}
	public SupplierAddressInfo(String supplierAddressId, Address address, SupplierModel supplierModel,
			RefAddressType refAddressType, Date dateAddressFrom, Date dateAddressTo) {
		super();
		this.supplierAddressId = supplierAddressId;
		this.address = address;
		this.supplierModel = supplierModel;
		this.refAddressType = refAddressType;
		this.dateAddressFrom = dateAddressFrom;
		this.dateAddressTo = dateAddressTo;
	}

	public String getSupplierAddressId() {
		return supplierAddressId;
	}

	public void setSupplierAddressId(String supplierAddressId) {
		this.supplierAddressId = supplierAddressId;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public SupplierModel getSupplierModel() {
		return supplierModel;
	}

	public void setSupplierModel(SupplierModel supplierModel) {
		this.supplierModel = supplierModel;
	}

	public RefAddressType getRefAddressType() {
		return refAddressType;
	}

	public void setRefAddressType(RefAddressType refAddressType) {
		this.refAddressType = refAddressType;
	}

	public Date getDateAddressFrom() {
		return dateAddressFrom;
	}

	public void setDateAddressFrom(Date dateAddressFrom) {
		this.dateAddressFrom = dateAddressFrom;
	}

	public Date getDateAddressTo() {
		return dateAddressTo;
	}

	public void setDateAddressTo(Date dateAddressTo) {
		this.dateAddressTo = dateAddressTo;
	}



	
	
	
}
