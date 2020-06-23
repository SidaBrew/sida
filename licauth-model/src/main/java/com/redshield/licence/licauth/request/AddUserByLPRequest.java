package com.redshield.licence.licauth.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.redshield.licence.licauth.request.content.AddUserByLPContent;
import com.redshield.licence.licauth.request.header.AddUserByLPHeader;
import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * 请求基类
 *
 * @author wudongdong
 * @date 2020/05/10
 */
@Data
public class AddUserByLPRequest {
    @Valid
    @NotNull
    @JsonProperty("message_header")
    private AddUserByLPHeader header;

    @Valid
    @NotNull
    @JsonProperty("message_content")
    private AddUserByLPContent content;
}
