package DesignPatterns.Decorator.PrinterExample;

public class ConcretePrinter extends Printer {

    @Override
    public void flushBuffer() {
        System.out.println("Message from Concrete Printer: Printer Buffer Flushed");
    }
}
