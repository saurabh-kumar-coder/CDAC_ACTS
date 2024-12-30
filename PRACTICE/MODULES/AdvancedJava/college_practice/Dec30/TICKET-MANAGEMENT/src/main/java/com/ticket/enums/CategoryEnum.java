package com.ticket.enums;

public enum CategoryEnum {
	SIM("SIM"),
	CALLING("CALLING"),
	BROADBAND("BROADBAND");
	
	private final String categoryEnum;
	
	private CategoryEnum(String categoryEnum) {
		// TODO Auto-generated constructor stub
		this.categoryEnum = categoryEnum;
	}
	
	public String getValue() {
		return this.categoryEnum;
	}
	
	@Override
    public String toString() {
        return this.categoryEnum;
    }
	
//	public CategoryEnum valueOf(String value) {
//		for (CategoryEnum category : CategoryEnum.values()) {
//            if (category.getValue().equalsIgnoreCase(value)) {
//                return category;
//            }
//        }
//        return null; // Or throw an exception if not found
//	}
	
}
