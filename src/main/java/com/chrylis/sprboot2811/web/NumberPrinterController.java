package com.chrylis.sprboot2811.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chrylis.sprboot2811.NumberPrinter;

/**
 * This is here to prevent the Spring Boot context from instantly closing.
 *
 * @author Christopher Smith
 */
@RestController
@RequestMapping("/print")
public class NumberPrinterController {

    private final NumberPrinter printer;

    private final String npts;

    @Autowired
    public NumberPrinterController(NumberPrinter printer, @Qualifier("npts") String numberPrinterToString) {
        this.printer = printer;
        this.npts = numberPrinterToString;
    }

    @RequestMapping("/{number}")
    public String printNumber(@PathVariable Integer number) {
        printer.printNumber(number);
        return "printed " + number;
    }

    @RequestMapping("/printer")
    public String printer() {
        return npts;
    }

}
