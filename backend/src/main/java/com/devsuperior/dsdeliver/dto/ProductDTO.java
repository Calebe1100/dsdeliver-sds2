package com.devsuperior.dsdeliver.dto;

import java.io.Serializable;

import com.devsuperior.dsdeliver.entities.Product;

public class ProductDTO implements Serializable {
    private static final long serialVersionUID = 1L;{
    	
    }
    private Long id;
    private String name;
    private String description;
    private Double price;
    private String imageUri;
	
	public ProductDTO() {
		
	}

	public ProductDTO(Long id, String name, String description, Double price, String imageUri) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.imageUri = imageUri;
	}
	public ProductDTO(Product entity) {
		super();
		id = entity.getId();
		name = entity.getName();
		description = entity.getDescription();
		price = entity.getPrice();
		imageUri = entity.getImageUri();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getImageUri() {
		return imageUri;
	}

	public void setImageUri(String imageUri) {
		this.imageUri = imageUri;
	}
	

}
