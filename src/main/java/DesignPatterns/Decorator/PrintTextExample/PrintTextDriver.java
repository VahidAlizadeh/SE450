/*
 * Copyright (c) 2021.
 * Vahid Alizadeh
 * SE 450
 * DePaul University
 */

package DesignPatterns.Decorator.PrintTextExample;

public class PrintTextDriver {
    public static void main (String[] args) {
            final String text = "SE 450 - Winter 2021 - Decorator Pattern Example";
            final PrintText object = new PrintAsciiText();
            final PrintText printer = new PrintTextHexDecorator(object);
            object.print(text);
            printer.print(text);
        }
}
