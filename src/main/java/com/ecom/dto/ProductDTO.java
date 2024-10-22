package com.ecom.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ProductDTO {

	private String title;

	private String description;

	private String category;

	private Double price;

	private int stock;

	private String image;

	private int discount;
	
	private Double discountPrice;
	
	private Boolean isActive;

}
