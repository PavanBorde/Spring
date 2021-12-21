
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
public class BeneficiaryPrcntANDCode {

    @JsonProperty("BeneficiaryClientNumber")
    private List<BeneficiaryClientNumber> beneficiaryClientNumber = null;
    @JsonProperty("BeneficiaryORAppointee")
    private List<BeneficiaryORAppointee> beneficiaryORAppointee = null;
    @JsonProperty("BeneficiaryPercentage")
    private List<BeneficiaryPercentage> beneficiaryPercentage = null;
    @JsonProperty("BeneficiaryCode")
    private List<BeneficiaryCode> beneficiaryCode = null;
    @JsonProperty("BeneficiaryRelation")
    private List<BeneficiaryRelation> beneficiaryRelation = null;
    @JsonProperty("BeneficiaryClientDOB")
    private List<BeneficiaryClientDOB> beneficiaryClientDOB = null;
    @JsonProperty("BeneficiaryPinCode")
    private List<BeneficiaryPinCode> beneficiaryPinCode = null;
    @JsonProperty("BeneficiaryGender")
    private List<BeneficiaryGender> beneficiaryGender = null;
    @JsonProperty("BeneficiaryCountry")
    private List<BeneficiaryCountry> beneficiaryCountry = null;
    @JsonProperty("BeneficiaryName")
    private List<BeneficiaryName> beneficiaryName = null;
    @JsonProperty("BeneficiarySurname")
    private List<BeneficiarySurname> beneficiarySurname = null;
    @JsonProperty("BeneficiaryMarriageFlag")
    private List<BeneficiaryMarriageFlag> beneficiaryMarriageFlag = null;
    @JsonProperty("BeneficiarySalutation")
    private List<BeneficiarySalutation> beneficiarySalutation = null;
    @JsonProperty("BeneficiarySecurityNo")
    private List<BeneficiarySecurityNo> beneficiarySecurityNo = null;
    

}
