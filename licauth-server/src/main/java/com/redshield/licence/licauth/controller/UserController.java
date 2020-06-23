package com.redshield.licence.licauth.controller;

import com.redshield.licence.licauth.request.AddUserByLPRequest;
import com.redshield.licence.licauth.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.Valid;

@Slf4j
@RestController
public class UserController {

//     @Resource
//     UserService userService;

    /**
     * 法人增加人员
     * @return
     */
    @RequestMapping("/addUserByLP")

    public String addUserByLP () {//    @RequestBody @Valid AddUserByLPRequest request


        return "hello";
    }

}
