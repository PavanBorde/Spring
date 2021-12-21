package com.demo.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@JsonPOJOBuilder
@JsonIgnoreProperties(ignoreUnknown = true)
public class Client_Additional_Details  {

	
	 private int FAXNo;
	 private int  TelephoneNo;
	 private String EmailID;
	 private int  MobileNo;
	 private int PagerNumber;
	 private String  StaffFlag;
	 private int  PANNumber;
	 private String  SpecialIndicator;
	
}
