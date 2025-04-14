package org.example.dependency;

import java.util.logging.Logger;

public class PrinterService {

    public void printReport(Logger logger) {
       // PrinterService depends on Logger

        //But it doesn't own it — just uses it in a method
        //➡️ This is a temporary dependency
    }
}
