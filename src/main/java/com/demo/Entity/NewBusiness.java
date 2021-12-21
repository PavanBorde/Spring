
package com.demo.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@JsonPOJOBuilder
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class NewBusiness {

    @JsonProperty("Action")
    private String action;
    @JsonProperty("FamilyRelation")
    private String familyRelation;
    @JsonProperty("PolicyNo01")
    private String policyNo01;
    @JsonProperty("PolicyNo02")
    private String policyNo02;
    @JsonProperty("EffectiveDate")
    private String effectiveDate;
    @JsonProperty("PolicyType")
    private String policyType;
    @JsonProperty("OriginalCommencementDate")
    private String originalCommencementDate;
    @JsonProperty("SubsidiariesFlag")
    private String subsidiariesFlag;
    @JsonProperty("ValidationFlag")
    private String validationFlag;
    

}
