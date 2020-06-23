package com.redshield.licence.licauth.request.content;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class AddUserByLPContent {

    /**
     * 授权ID
     */
    @NotEmpty
    private String authId;
    /**
     * 证件类型
     */
    @NotEmpty
    private String holderCardType;
    /**
     * 身份证号
     */
    @NotEmpty
    private String idCardNum;
    /**
     * 人员姓名
     */
    @NotEmpty
    private String userName;

    /**
     * 手机号码
     */
    @NotEmpty
    private String telephone;


}
