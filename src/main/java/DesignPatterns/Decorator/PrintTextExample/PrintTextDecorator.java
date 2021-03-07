/*
 * Copyright (c) 2021.
 * Vahid Alizadeh
 * SE 450
 * DePaul University
 */

package DesignPatterns.Decorator.PrintTextExample;

public abstract class PrintTextDecorator implements PrintText {
    protected PrintText inner;
    public PrintTextDecorator(PrintText inner)
    {
        this.inner = inner;
    }
    public abstract void print(String text);
}
