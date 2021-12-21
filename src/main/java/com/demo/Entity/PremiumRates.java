
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
public class PremiumRates {

    @JsonProperty("EffectiveDateOfPremiumRate")
    private String effectiveDateOfPremiumRate;
    @JsonProperty("PolicyType")
    private String policyType;
    @JsonProperty("ProductType")
    private String productType;
    @JsonProperty("PlanNumber")
    private String planNumber;
    @JsonProperty("IndustryCatagory")
    private String industryCatagory;
    @JsonProperty("OccupationalClass")
    private String occupationalClass;
    @JsonProperty("Gender")
    private String gender;
    @JsonProperty("Age")
    private String age;
    @JsonProperty("AdulORChildIndicator")
    private String adulORChildIndicator;
    @JsonProperty("PremiumAmount")
    private String premiumAmount;
    @JsonProperty("RulesAtPlanLevel")
    private String rulesAtPlanLevel;
    @JsonProperty("LoanType")
    private String loanType;
    @JsonProperty("RiskTerm")
    private String riskTerm;
    @JsonProperty("PremiumTerm")
    private String premiumTerm;
    @JsonProperty("PremiumRate")
    private String premiumRate;
    @JsonProperty("Moratorium")
    private String moratorium;
    @JsonProperty("InterestRate")
    private String interestRate;
    @JsonProperty("EnteredElementType")
    private String enteredElementType;
    @JsonProperty("OptionalAdditionalBenefits")
    private String optionalAdditionalBenefits;
    @JsonProperty("InterestPaidInMoratoriumPeriod")
    private String interestPaidInMoratoriumPeriod;
    @JsonProperty("AgeDifference")
    private String ageDifference;
    

}
