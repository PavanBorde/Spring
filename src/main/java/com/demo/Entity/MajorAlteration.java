
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
public class MajorAlteration {

    @JsonProperty("Action")
    private String action;
    @JsonProperty("PolicyNumber")
    private String policyNumber;
    @JsonProperty("EffectiveDate")
    private String effectiveDate;
    @JsonProperty("ValidationFlag")
    private String validationFlag;
    
}
