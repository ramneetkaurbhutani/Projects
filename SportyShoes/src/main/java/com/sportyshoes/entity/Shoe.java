package com.sportyshoes.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;


@Entity
@Table(name = "shoes")
public class Shoe {
	
	@Id
	@GeneratedValue
	private int shoeId;
	private String shoeName;

	private int shoeSize; 
	
	@Enumerated(EnumType.STRING)
	private Category shoeCategory;
	private String shoeBrand;
	private float shoePrice;
	
	@CreationTimestamp
	private LocalDateTime addedDate;

	public int getShoeId() {
		return shoeId;
	}

	public void setShoeId(int shoeId) {
		this.shoeId = shoeId;
	}

	public String getShoeName() {
		return shoeName;
	}

	public void setShoeName(String shoeName) {
		this.shoeName = shoeName;
	}

	public int getShoeSize() {
		return shoeSize;
	}

	public void setShoeSize(int shoeSize) {
		this.shoeSize = shoeSize;
	}

	public Category getShoeCategory() {
		return shoeCategory;
	}

	public void setShoeCategory(Category shoeCategory) {
		this.shoeCategory = shoeCategory;
	}

	public String getShoeBrand() {
		return shoeBrand;
	}

	public void setShoeBrand(String shoeBrand) {
		this.shoeBrand = shoeBrand;
	}

	public float getShoePrice() {
		return shoePrice;
	}

	public void setShoePrice(float shoePrice) {
		this.shoePrice = shoePrice;
	}

	public LocalDateTime getAddedDate() {
		return addedDate;
	}

	public void setAddedDate(LocalDateTime addedDate) {
		this.addedDate = addedDate;
	}

	public Shoe() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Shoe(String shoeName, int shoeSize, Category shoeCategory, String shoeBrand, float shoePrice) {
		super();
		this.shoeName = shoeName;
		this.shoeSize = shoeSize;
		this.shoeCategory = shoeCategory;
		this.shoeBrand = shoeBrand;
		this.shoePrice = shoePrice;
	}

	@Override
	public String toString() {
		return "Shoe [shoeId=" + shoeId + ", shoeName=" + shoeName + ", shoeSize=" + shoeSize + ", shoeCategory="
				+ shoeCategory + ", shoeBrand=" + shoeBrand + ", shoePrice=" + shoePrice + ", addedDate=" + addedDate
				+ "]";
	}

	
	
	
}
