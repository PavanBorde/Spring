
package com.demo.Entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class InvestmentDetails {

    @JsonProperty("Investment_Fund")
    private List<InvestmentFund> investmentFund = null;
    @JsonProperty("Investment_Percentage")
    private List<InvestmentPercentage> investmentPercentage = null;
    
}
