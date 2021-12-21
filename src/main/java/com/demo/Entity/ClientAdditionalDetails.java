
package com.demo.Entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ClientAdditionalDetails {

    @JsonProperty("FAXNo")
    private String fAXNo;
    @JsonProperty("TelephoneNo")
    private String telephoneNo;
    @JsonProperty("EmailID")
    private String emailID;
    @JsonProperty("MobileNo")
    private String mobileNo;
    @JsonProperty("PagerNumber")
    private String pagerNumber;
    @JsonProperty("StaffFlag")
    private String staffFlag;
    @JsonProperty("PANNumber")
    private String pANNumber;
    @JsonProperty("SpecialIndicator")
    private String specialIndicator;
    
}
