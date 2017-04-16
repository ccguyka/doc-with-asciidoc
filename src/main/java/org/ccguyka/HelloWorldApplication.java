package org.ccguyka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@EnableAutoConfiguration
@SpringBootApplication
public class HelloWorldApplication {



    public static void main(String[] args) throws Exception {
        SpringApplication.run(HelloWorldApplication.class, args);
    }
}
