package org.yuxin.trrain.member;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MemberApplication {
    private  static  final Logger log   = LoggerFactory.getLogger(MemberApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(MemberApplication.class,args);
        log.info("Starting....");

    }
}
