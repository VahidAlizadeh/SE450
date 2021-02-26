package DesignPatterns.Composite.FinancialAppExample;

public abstract class AccountComponent
{
    AccountStatement accStatement;

    public abstract float getBalance();

    public abstract AccountStatement getStatement();
}