
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
public class AdditionalMemberDetails2 {

    @JsonProperty("Appointee1ForMinor")
    private String appointee1ForMinor;
    @JsonProperty("Appointee2ForMinor")
    private String appointee2ForMinor;
    @JsonProperty("Appointee3ForMinor")
    private String appointee3ForMinor;
    @JsonProperty("BranchName")
    private String branchName;
    @JsonProperty("BranchCode")
    private String branchCode;
    @JsonProperty("PendingReason")
    private String pendingReason;
    @JsonProperty("CorporateAgent")
    private String corporateAgent;
    @JsonProperty("SocialClass")
    private String socialClass;
    @JsonProperty("SourceOfBusiness")
    private String sourceOfBusiness;
    @JsonProperty("BDMCode")
    private String bDMCode;
    @JsonProperty("LoanAccountNo")
    private String loanAccountNo;
    

}
