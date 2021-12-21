
package com.demo.Entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

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
public class EsbGroupMemberUploadReq {

	@Id
	private int id;

	@JsonProperty("GroupUploadFlag")
	private String groupUploadFlag;

	@JsonProperty("Client_Details")
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id", referencedColumnName = "id")
	@JsonIgnore
	private ClientDetails clientDetails;

	/*
	 * @JsonProperty("Client_Additional_Details") private ClientAdditionalDetails
	 * clientAdditionalDetails;
	 * 
	 * @JsonProperty("Major_Alteration") private MajorAlteration majorAlteration;
	 * 
	 * @JsonProperty("New_Business") private NewBusiness newBusiness;
	 * 
	 * @JsonProperty("Renewals_Submenu") private RenewalsSubmenu renewalsSubmenu;
	 * 
	 * @JsonProperty("Take_Up_Submenu") private TakeUpSubmenu takeUpSubmenu;
	 * 
	 * @JsonProperty("Qutation_Submenu") private QutationSubmenu qutationSubmenu;
	 * 
	 * @JsonProperty("Member_Select_Submenu") private MemberSelectSubmenu
	 * memberSelectSubmenu;
	 * 
	 * @JsonProperty("Member_Details_Submenu") private MemberDetailsSubmenu
	 * memberDetailsSubmenu;
	 * 
	 * @JsonProperty("Beneficiary_Selection_Submenu") private
	 * BeneficiarySelectionSubmenu beneficiarySelectionSubmenu;
	 * 
	 * @JsonProperty("Termination_Submenu") private TerminationSubmenu
	 * terminationSubmenu;
	 * 
	 * @JsonProperty("Additional_Member_Details") private AdditionalMemberDetails
	 * additionalMemberDetails;
	 * 
	 * @JsonProperty("Additional_Member_Details_1") private AdditionalMemberDetails1
	 * additionalMemberDetails1;
	 * 
	 * @JsonProperty("Additional_Member_Details_2") private AdditionalMemberDetails2
	 * additionalMemberDetails2;
	 * 
	 * @JsonProperty("MRTA_Details") private MRTADetails mRTADetails;
	 * 
	 * @JsonProperty("Investment_Details") private InvestmentDetails
	 * investmentDetails;
	 * 
	 * @JsonProperty("Premium_Rates") private PremiumRates premiumRates;
	 */

}
