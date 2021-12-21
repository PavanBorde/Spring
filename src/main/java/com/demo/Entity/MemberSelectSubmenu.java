
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
public class MemberSelectSubmenu {

    @JsonProperty("AccountNo")
    private String accountNo;
    @JsonProperty("ClientNo")
    private String clientNo;
    @JsonProperty("EffectiveDate")
    private String effectiveDate;
    @JsonProperty("SubsidiaryNo")
    private String subsidiaryNo;
    @JsonProperty("ShortNameForBEXTReport")
    private String shortNameForBEXTReport;
    @JsonProperty("ScreenIndicator")
    private String screenIndicator;
    
}
