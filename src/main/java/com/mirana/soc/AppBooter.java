package com.mirana.soc;

import com.mirana.soc.config.ServiceConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(ServiceConfig.class)
public class AppBooter {

    public static void main(String[] args) {
        SpringApplication.run(AppBooter.class, args);
    }

}
