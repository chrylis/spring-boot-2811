package com.chrylis.sprboot2811.autoconfiguration;

import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Profile;

import com.chrylis.sprboot2811.NumberPrinter;

@Configuration
@AutoConfigureBefore(SpringBoot2811AutoConfiguration.class)
@ImportResource("classpath:META-INF/spring/integration/number-printer-integration-plan.xml")
public class SpringBoot2811FirstAutoConfiguration {
    @Bean
    @Profile("javaConfigBean")
    public NumberPrinter anonymousPrinter() {
        return new NumberPrinter() {
            @Override
            public void printNumber(Number number) {
                System.err.println("the number is " + number);
            }
        };
    }
}
