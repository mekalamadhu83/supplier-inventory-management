package com.sim.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name ="item_supplier")

public class ItemSupplier {
	
	@Id
	private String itemId;
	
	@JsonBackReference("supplier_itemmm")
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "supplier_id")
	private SupplierModel supplierModel;
	
	private int valueSuppliedToDate;
	private int totalQuantitySuppliedToDate;
	private int minimumOrderQuantity;
	private int maximumOrderQuantity;
	
	public ItemSupplier() {}

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public SupplierModel getSupplierModel() {
		return supplierModel;
	}

	public void setSupplierModel(SupplierModel supplierModel) {
		this.supplierModel = supplierModel;
	}

	public int getValueSuppliedToDate() {
		return valueSuppliedToDate;
	}

	public void setValueSuppliedToDate(int valueSuppliedToDate) {
		this.valueSuppliedToDate = valueSuppliedToDate;
	}

	public int getTotalQuantitySuppliedToDate() {
		return totalQuantitySuppliedToDate;
	}

	public void setTotalQuantitySuppliedToDate(int totalQuantitySuppliedToDate) {
		this.totalQuantitySuppliedToDate = totalQuantitySuppliedToDate;
	}

	public int getMinimumOrderQuantity() {
		return minimumOrderQuantity;
	}

	public void setMinimumOrderQuantity(int minimumOrderQuantity) {
		this.minimumOrderQuantity = minimumOrderQuantity;
	}

	public int getMaximumOrderQuantity() {
		return maximumOrderQuantity;
	}

	public void setMaximumOrderQuantity(int maximumOrderQuantity) {
		this.maximumOrderQuantity = maximumOrderQuantity;
	}

	public ItemSupplier(String itemId, SupplierModel supplierInfo, int valueSuppliedToDate,
			int totalQuantitySuppliedToDate, int minimumOrderQuantity, int maximumOrderQuantity) {
		super();
		this.itemId = itemId;
	this.supplierModel = supplierModel;
		this.valueSuppliedToDate = valueSuppliedToDate;
		this.totalQuantitySuppliedToDate = totalQuantitySuppliedToDate;
		this.minimumOrderQuantity = minimumOrderQuantity;
		this.maximumOrderQuantity = maximumOrderQuantity;
	}

	
}
