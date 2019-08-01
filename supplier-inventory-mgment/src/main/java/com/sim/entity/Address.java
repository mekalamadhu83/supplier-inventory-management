package com.sim.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="address")

public class Address 
{
	@Id
	private String addressId;
	private String line1;
	private String line2;
	private String city;
	private int zipOrPostalCode;
	private String stateProvince;
	private String country;
	private String otherAddressDetails;
	public String getAddressId() {
		return addressId;
	}
	public void setAddressId(String addressId) {
		this.addressId = addressId;
	}
	public String getLine1() {
		return line1;
	}
	public void setLine1(String line1) {
		this.line1 = line1;
	}
	public String getLine2() {
		return line2;
	}
	public void setLine2(String line2) {
		this.line2 = line2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getZipOrPostalCode() {
		return zipOrPostalCode;
	}
	public void setZipOrPostalCode(int zipOrPostalCode) {
		this.zipOrPostalCode = zipOrPostalCode;
	}
	public String getStateProvince() {
		return stateProvince;
	}
	public void setStateProvince(String stateProvince) {
		this.stateProvince = stateProvince;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getOtherAddressDetails() {
		return otherAddressDetails;
	}
	public void setOtherAddressDetails(String otherAddressDetails) {
		this.otherAddressDetails = otherAddressDetails;
	}
	public Address(String addressId, String line1, String line2, String city, int zipOrPostalCode, String stateProvince,
			String country, String otherAddressDetails) {
		super();
		this.addressId = addressId;
		this.line1 = line1;
		this.line2 = line2;
		this.city = city;
		this.zipOrPostalCode = zipOrPostalCode;
		this.stateProvince = stateProvince;
		this.country = country;
		this.otherAddressDetails = otherAddressDetails;
	}
	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", line1=" + line1 + ", line2=" + line2 + ", city=" + city
				+ ", zipOrPostalCode=" + zipOrPostalCode + ", stateProvince=" + stateProvince + ", country=" + country
				+ ", otherAddressDetails=" + otherAddressDetails + "]";
	}
	
	public Address() {}

}
