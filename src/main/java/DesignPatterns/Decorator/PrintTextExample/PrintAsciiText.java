/*
 * Copyright (c) 2021.
 * Vahid Alizadeh
 * SE 450
 * DePaul University
 */

package DesignPatterns.Decorator.PrintTextExample;

public class PrintAsciiText implements PrintText {
    public void print(String text)
    {
        System.out.println("Print ASCII: " + text);
    }
}