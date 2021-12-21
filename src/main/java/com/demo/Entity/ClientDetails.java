
package com.demo.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
@Entity
public class ClientDetails {
	
	@Id
	@JsonIgnore
	private int id;
	
    @JsonProperty("Action")
    private String action;
    @JsonProperty("ClientNo")
    private String clientNo;
    @JsonProperty("SocialSecurityNo")
    private String socialSecurityNo;
    @JsonProperty("AddressType")
    private String addressType;
    @JsonProperty("BirthPlace")
    private String birthPlace;
    @JsonProperty("ClientAddress01")
    private String clientAddress01;
    @JsonProperty("ClientAddress02")
    private String clientAddress02;
    @JsonProperty("ClientAddress03")
    private String clientAddress03;
    @JsonProperty("ClientAddress04")
    private String clientAddress04;
    @JsonProperty("ClientAddress05")
    private String clientAddress05;
    @JsonProperty("ClientDOB")
    private String clientDOB;
    @JsonProperty("ClientDOD")
    private String clientDOD;
    @JsonProperty("ClientPincode")
    private String clientPincode;
    @JsonProperty("ClientPhone01")
    private String clientPhone01;
    @JsonProperty("ClientPhone02")
    private String clientPhone02;
    @JsonProperty("ClientGender")
    private String clientGender;
    @JsonProperty("CountryCode")
    private String countryCode;
    @JsonProperty("DirectMailIndicator")
    private String directMailIndicator;
    @JsonProperty("DocumentNo")
    private String documentNo;
    @JsonProperty("Language")
    private String language;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("Surname")
    private String surname;
    @JsonProperty("MailingIndicator")
    private String mailingIndicator;
    @JsonProperty("MarriedIndicator")
    private String marriedIndicator;
    @JsonProperty("Nationality")
    private String nationality;
    @JsonProperty("NameFormat")
    private String nameFormat;
    @JsonProperty("OccupationCode")
    private String occupationCode;
    @JsonProperty("RACRIndicator")
    private String rACRIndicator;
    @JsonProperty("ClientExtraFieldsIndicator")
    private String clientExtraFieldsIndicator;
    @JsonProperty("Salutation")
    private String salutation;
    @JsonProperty("SocialSecurityNumber")
    private String socialSecurityNumber;
    @JsonProperty("ServicingBranch")
    private String servicingBranch;
    @JsonProperty("SourceOfEvidence")
    private String sourceOfEvidence;
    @JsonProperty("StartDate")
    private String startDate;
    @JsonProperty("StatusCode")
    private String statusCode;
    @JsonProperty("StateCode")
    private String stateCode;
    @JsonProperty("UKPensionIndicator")
    private String uKPensionIndicator;
    @JsonProperty("VIPIndicator")
    private String vIPIndicator;
    @JsonProperty("CompanyDoctorIndicator")
    private String companyDoctorIndicator;
}
