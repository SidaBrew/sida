package com.redshield.licence.licauth.request.header;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
@Data
public class AddUserByLPHeader {

    @NotEmpty
    @JsonProperty("App_id")
    private String appId;

    @NotEmpty
    private String appCode;

    @NotEmpty
    private String areaCode;
}
