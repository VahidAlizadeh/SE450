/*
 * Copyright (c) 2021.
 * Vahid Alizadeh
 * SE 450
 * DePaul University
 */

package DesignPatterns.Composite.FinancialAppExample;

public abstract class AccountComponent
{
    AccountStatement accStatement;

    public abstract float getBalance();

    public abstract AccountStatement getStatement();
}