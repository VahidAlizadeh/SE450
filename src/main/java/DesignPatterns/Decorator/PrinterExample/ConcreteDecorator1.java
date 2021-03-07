/*
 * Copyright (c) 2021.
 * Vahid Alizadeh
 * SE 450
 * DePaul University
 */

package DesignPatterns.Decorator.PrinterExample;

public class ConcreteDecorator1 extends AbstractDecorator {

    public void flushBuffer() {
        super.flushBuffer();
        System.out.println("Message from Concrete Decorator 1: " +
                "Printer Buffer Flushed");
    }
}
