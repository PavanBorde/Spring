
package com.demo.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
public class AdditionalMemberDetails1 {

    @JsonProperty("JointBorrowerOption")
    private String jointBorrowerOption;
    @JsonProperty("PremiumType")
    private String premiumType;
    @JsonProperty("ApplicationNo")
    private String applicationNo;
    @JsonProperty("BillingChannel")
    private String billingChannel;
    @JsonProperty("BillingFrequency")
    private String billingFrequency;
    @JsonProperty("RiskTerm")
    private String riskTerm;
    @JsonProperty("PremiumTerm")
    private String premiumTerm;
    @JsonProperty("ContributionFrequency")
    private String contributionFrequency;
    @JsonProperty("RiskStartDate")
    private String riskStartDate;
    @JsonProperty("AdjustmentFrequency")
    private String adjustmentFrequency;
    @JsonProperty("Height")
    private String height;
    @JsonProperty("Weight")
    private String weight;
    @JsonProperty("HeightUnit")
    private String heightUnit;
    @JsonProperty("WeightUnit")
    private String weightUnit;
    @JsonProperty("ProposalDate")
    private String proposalDate;
    @JsonProperty("SalesLeadNo")
    private String salesLeadNo;
    @JsonProperty("UnderWritingComplatedDate")
    private String underWritingComplatedDate;
    @JsonProperty("UnderWritingDesicionDate")
    private String underWritingDesicionDate;
    

}
