package com.chrylis.sprboot2811;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.chrylis.sprboot2811.web.NumberPrinterController;

@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackageClasses = NumberPrinterController.class)
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
