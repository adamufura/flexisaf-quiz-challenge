package com.flexisaf.flexisafquiz;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@EnableEncryptableProperties
public class FlexisafquizApplication {
    public static void main(String[] args) {
		SpringApplication.run(FlexisafquizApplication.class, args);
        //        HTTP RESPONSES ✅
        //        Why and How everything works ✅
        //        ANNOTATIONS ✅
        //        Security Config ✅
        //        ID generation ✅
        //        SAVING JWT secret   with JASYPT library ✅
        //        Refactor project ✅
        //        Lombok ✅
        //        Validation ✅
        //        Transactions ✅
        //        TESTS ✔️
    }
}
