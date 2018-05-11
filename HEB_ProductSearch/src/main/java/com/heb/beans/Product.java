package com.heb.beans;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Product {

	@Id
	@GeneratedValue
	private long id;
	private String description;
	private Date lastSold;
	private String shelfLife;
	private String department;
	private double price;
	private String unit;
	private int xFor;
	private double cost;

	public Product() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	public Date getLastSold() {
		return lastSold;
	}

	public void setLastSold(Date lastSold) {
		this.lastSold = lastSold;
	}

	public String getShelfLife() {
		return shelfLife;
	}

	public void setShelfLife(String shelfLife) {
		this.shelfLife = shelfLife;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public int getxFor() {
		return xFor;
	}

	public void setxFor(int xFor) {
		this.xFor = xFor;
	}

	
	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", description=" + description + ", lastSold=" + lastSold + ", shelfLife="
				+ shelfLife + ", department=" + department + ", price=" + price + ", unit=" + unit + ", xFor=" + xFor
				+ ", cost=" + cost + "]";
	}

}
