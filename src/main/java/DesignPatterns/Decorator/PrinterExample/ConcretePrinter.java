/*
 * Copyright (c) 2021.
 * Vahid Alizadeh
 * SE 450
 * DePaul University
 */

package DesignPatterns.Decorator.PrinterExample;

public class ConcretePrinter extends Printer {

    @Override
    public void flushBuffer() {

        System.out.println("Message from Concrete Printer: Printer Buffer Flushed");
    }
}
