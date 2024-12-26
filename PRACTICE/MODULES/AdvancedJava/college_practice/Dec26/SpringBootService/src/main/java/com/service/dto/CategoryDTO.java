package com.service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CategoryDTO {

	private int categoryId;
	
	private String categoryName;
	
	private String categoryDescription;
	
	private String categoryImageUrl;
	
}