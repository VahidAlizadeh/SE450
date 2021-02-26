package DesignPatterns.Decorator.PrintTextExample;

public class PrintTextDriver {
    public static void main (String[] args) throws java.lang.Exception
        {
            final String text = "SE 450 - Winter 2021 - Decorator Pattern Example";
            final PrintText object = new PrintAsciiText();
            final PrintText printer = new PrintTextHexDecorator(object);
            object.print(text);
            printer.print(text);
        }
}
