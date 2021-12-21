
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
public class AdditionalMemberDetails {

    @JsonProperty("OccupationCode")
    private String occupationCode;
    @JsonProperty("SmokingORNonSmokingIndicator")
    private String smokingORNonSmokingIndicator;
    @JsonProperty("EthnicOrigin")
    private String ethnicOrigin;
    @JsonProperty("Height")
    private String height;
    @JsonProperty("Weight")
    private String weight;
    @JsonProperty("HeightUnit")
    private String heightUnit;
    @JsonProperty("WeightUnit")
    private String weightUnit;
    @JsonProperty("DefaultClaimPayeeRule")
    private String defaultClaimPayeeRule;
    @JsonProperty("PaymentMethod")
    private String paymentMethod;
    @JsonProperty("DateJoinedPreviousPolicy")
    private String dateJoinedPreviousPolicy;
    @JsonProperty("ContributionAmount")
    private String contributionAmount;
    @JsonProperty("ContributionPercentage")
    private String contributionPercentage;
    @JsonProperty("BankAccountNo")
    private String bankAccountNo;
    @JsonProperty("CertificateNumber")
    private String certificateNumber;
    @JsonProperty("ApplicationNo")
    private String applicationNo;
   
    
    
}
