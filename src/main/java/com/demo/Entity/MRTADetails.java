
package com.demo.Entity;

import java.util.List;

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
public class MRTADetails {

    @JsonProperty("ProductType")
    private List<ProductType__1> productType = null;
    @JsonProperty("Middle_of_Loan")
    private List<MiddleOfLoan> middleOfLoan = null;
    @JsonProperty("Decreasing_Freq")
    private List<DecreasingFreq> decreasingFreq = null;
    @JsonProperty("Top_Up_Loan")
    private List<TopUpLoan> topUpLoan = null;
    @JsonProperty("Loan_Acc_No")
    private List<LoanAccNo> loanAccNo = null;
    @JsonProperty("Premium")
    private List<Premium> premium = null;
    @JsonProperty("Loan_Term")
    private List<LoanTerm> loanTerm = null;
    @JsonProperty("Loan_Interest_Rate")
    private List<LoanInterestRate> loanInterestRate = null;
    @JsonProperty("Loan_Amount")
    private List<LoanAmount> loanAmount = null;
    @JsonProperty("Loan_Nature")
    private List<LoanNature> loanNature = null;
    @JsonProperty("Loan_Type")
    private List<LoanType> loanType = null;
    @JsonProperty("Moratorium")
    private List<Moratorium> moratorium = null;
    @JsonProperty("Is_Interest_Rate_Applicable")
    private List<IsInterestRateApplicable> isInterestRateApplicable = null;
    @JsonProperty("Loan_Start_Date")
    private List<LoanStartDate> loanStartDate = null;
    @JsonProperty("Loan_Application_Date")
    private List<LoanApplicationDate> loanApplicationDate = null;
    @JsonProperty("Loan_Disbursed_Date")
    private List<LoanDisbursedDate> loanDisbursedDate = null;
    @JsonProperty("Loan_Approval_Date")
    private List<LoanApprovalDate> loanApprovalDate = null;
    
}
