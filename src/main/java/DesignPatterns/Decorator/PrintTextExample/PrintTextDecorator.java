package DesignPatterns.Decorator.PrintTextExample;

import java.util.stream.Collectors;

public abstract class PrintTextDecorator implements PrintText {
    private PrintText inner;
    public PrintTextDecorator(PrintText inner)
    {
        this.inner = inner;
    }
    public abstract void print(String text);
}
