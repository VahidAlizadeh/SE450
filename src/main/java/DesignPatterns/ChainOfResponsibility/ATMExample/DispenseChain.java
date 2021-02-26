package DesignPatterns.ChainOfResponsibility.ATMExample;

public interface DispenseChain {

    void setNextChain(DispenseChain nextChain);

    void dispense(Currency cur);
}
