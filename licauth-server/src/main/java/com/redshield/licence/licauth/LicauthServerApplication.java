package com.redshield.licence.licauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@MapperScan({"com.redshield.licence.licmgr.mapper"})
@SpringBootApplication
//@EnableEurekaClient
//@EnableFeignClients(basePackages = {
//        "com.redshield.licence.licuse.feign",
//        "com.redshield.licence.bizsrv.feign"})
class LicauthServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(LicauthServerApplication.class, args);
    }

}
