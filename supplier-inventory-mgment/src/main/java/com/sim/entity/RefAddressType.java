package com.sim.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="ref_address_type")
public class RefAddressType {
	
	@Id
	private String addressTypeCode;
	private String addressTypeDescription;
	
	public RefAddressType() {}

	public RefAddressType(String addressTypeCode, String addressTypeDescription) {
		super();
		this.addressTypeCode = addressTypeCode;
		this.addressTypeDescription = addressTypeDescription;
	}

	public String getAddressTypeCode() {
		return addressTypeCode;
	}

	public void setAddressTypeCode(String addressTypeCode) {
		this.addressTypeCode = addressTypeCode;
	}

	public String getAddressTypeDescription() {
		return addressTypeDescription;
	}

	public void setAddressTypeDescription(String addressTypeDescription) {
		this.addressTypeDescription = addressTypeDescription;
	}

	
	
}
