package com.example.springappvalue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringAppValueApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringAppValueApplication.class, args);
        ConfigValues configValues = context.getBean(ConfigValues.class);
        configValues.printConfigValues();
    }
}
