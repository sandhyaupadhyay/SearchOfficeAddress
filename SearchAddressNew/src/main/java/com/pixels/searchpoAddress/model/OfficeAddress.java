package com.pixels.searchpoAddress.model;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document(collection = "postofficelist")
public class OfficeAddress {

	
	@Field("officename")
	private String officeName;
	private long pincode;
	@Field("Districtname")
	private String districtname;
	private String statename;
	
	
}
