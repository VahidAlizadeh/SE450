/*
 * Copyright (c) 2021.
 * Vahid Alizadeh
 * SE 450
 * DePaul University
 */

package DesignPatterns.Decorator.PrinterExample;

abstract class AbstractDecorator extends Printer {

    protected Printer printer;

    public void selectPrinterToFlush(Printer ptr) {
        printer = ptr;
    }

    public void flushBuffer() {
        if (printer != null) {
            printer.flushBuffer();
        }
    }
}
