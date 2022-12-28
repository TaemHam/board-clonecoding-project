package com.practice.board;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@ConfigurationPropertiesScan
@SpringBootApplication
public class BoardCloneCodingApplication {

    public static void main(String[] args) {
        SpringApplication.run(BoardCloneCodingApplication.class, args);
    }

}
