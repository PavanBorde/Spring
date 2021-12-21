
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
public class MemberDetailsSubmenu {

    @JsonProperty("AlternativePrimaryCareClinic")
    private String alternativePrimaryCareClinic;
    @JsonProperty("ContractCommencementDate")
    private String contractCommencementDate;
    @JsonProperty("ClientBranch")
    private String clientBranch;
    @JsonProperty("ClientNo")
    private String clientNo;
    @JsonProperty("DOB")
    private String dob;
    @JsonProperty("DateAppointed")
    private String dateAppointed;
    @JsonProperty("EffectiveDate")
    private String effectiveDate;
    @JsonProperty("EmployeeNumber")
    private String employeeNumber;
    @JsonProperty("MemberLevelPlanNo")
    private String memberLevelPlanNo;
    @JsonProperty("OccupationalClass")
    private String occupationalClass;
    @JsonProperty("OccupationCode")
    private String occupationCode;
    @JsonProperty("PrimaryCareClinic")
    private String primaryCareClinic;
    @JsonProperty("PersonCoverage")
    private String personCoverage;
    @JsonProperty("Salary")
    private String salary;
    @JsonProperty("SubStandardLifeIndicator")
    private String subStandardLifeIndicator;
    @JsonProperty("Departement")
    private String departement;
    @JsonProperty("Earning")
    private String earning;
    @JsonProperty("LoanPeriodInMonths")
    private String loanPeriodInMonths;
    @JsonProperty("LoanInterestRate")
    private String loanInterestRate;
    @JsonProperty("Age")
    private String age;
    @JsonProperty("OrderOfBirth")
    private String orderOfBirth;
    @JsonProperty("StaffFlag")
    private String staffFlag;
    @JsonProperty("MemberLevelContriApplicabilityFlag")
    private String memberLevelContriApplicabilityFlag;
    @JsonProperty("MultipleBaseProduct")
    private String multipleBaseProduct;
    @JsonProperty("UnderwritingFlag1")
    private String underwritingFlag1;
    @JsonProperty("UnderwritingFlag2")
    private String underwritingFlag2;
    @JsonProperty("DateOfAttachment1")
    private String dateOfAttachment1;
    @JsonProperty("DateOfAttachment2")
    private String dateOfAttachment2;
    @JsonProperty("DateOfAttachment3")
    private String dateOfAttachment3;
    @JsonProperty("EMLoaging1")
    private String eMLoaging1;
    @JsonProperty("EMLoading2")
    private String eMLoading2;
    @JsonProperty("FamilyCode1")
    private String familyCode1;
    @JsonProperty("FamilyCode2")
    private String familyCode2;
    @JsonProperty("FamilyCode3")
    private String familyCode3;
    @JsonProperty("HeadNo1")
    private String headNo1;
    @JsonProperty("HeadNo2")
    private String headNo2;
    @JsonProperty("ImpairmentCode1")
    private String impairmentCode1;
    @JsonProperty("ImpairmentCode2")
    private String impairmentCode2;
    @JsonProperty("ImpairmentCode3")
    private String impairmentCode3;
    @JsonProperty("ImpairmentCode4")
    private String impairmentCode4;
    @JsonProperty("ImpairmentCode5")
    private String impairmentCode5;
    @JsonProperty("ImpairmentCode6")
    private String impairmentCode6;
    @JsonProperty("UnderWritingHistory")
    private String underWritingHistory;
    @JsonProperty("OccupationalORVocationalLoading1")
    private String occupationalORVocationalLoading1;
    @JsonProperty("OccupationalORVocationalLoading2")
    private String occupationalORVocationalLoading2;
    @JsonProperty("OldDataIndicator")
    private String oldDataIndicator;
    @JsonProperty("PlanNoMemberLeve1")
    private String planNoMemberLeve1;
    @JsonProperty("PlanNoMemberLeve2")
    private String planNoMemberLeve2;
    @JsonProperty("ProductType")
    private String productType;
    @JsonProperty("RIExtraMorality1")
    private String rIExtraMorality1;
    @JsonProperty("RIExtraMorality2")
    private String rIExtraMorality2;
    @JsonProperty("RIExtraMorality3")
    private String rIExtraMorality3;
    @JsonProperty("RIExtraMorality4")
    private String rIExtraMorality4;
    @JsonProperty("MemberLevelAction")
    private String memberLevelAction;
    @JsonProperty("SpecialTerm1")
    private String specialTerm1;
    @JsonProperty("SpecialTerm2")
    private String specialTerm2;
    @JsonProperty("SubStandaredSumInsured")
    private String subStandaredSumInsured;
    @JsonProperty("TransferAllFieldHelpIndicator")
    private String transferAllFieldHelpIndicator;
    @JsonProperty("ExcessSumInsured")
    private String excessSumInsured;
    @JsonProperty("SumInsured1")
    private String sumInsured1;
    @JsonProperty("SumInsured2")
    private String sumInsured2;
    @JsonProperty("SumANDProductType")
    private SumANDProductType sumANDProductType;
    

}
