/*
 * Copyright (c) 2021.
 * Vahid Alizadeh
 * SE 450
 * DePaul University
 */

package DesignPatterns.ChainOfResponsibility.ATMExample;

public interface DispenseChain {

    void setNextChain(DispenseChain nextChain);

    void dispense(Currency cur);
}
