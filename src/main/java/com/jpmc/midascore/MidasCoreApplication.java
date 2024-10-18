package com.jpmc.midascore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class }, scanBasePackages = {"component", "entity", "foundation", "repository"})
public class MidasCoreApplication {

    public static void main(String[] args) {

        SpringApplication.run(MidasCoreApplication.class, args);
    }

}
