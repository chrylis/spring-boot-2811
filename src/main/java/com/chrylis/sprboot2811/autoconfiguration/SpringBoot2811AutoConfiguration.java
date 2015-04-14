package com.chrylis.sprboot2811.autoconfiguration;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.chrylis.sprboot2811.NumberPrinter;

@Configuration
@ConditionalOnBean(NumberPrinter.class)
public class SpringBoot2811AutoConfiguration {

    @Bean
    @Qualifier("npts")
    public String numberPrinterToString(NumberPrinter numberPrinter) {
        return numberPrinter.toString();
    }
}
