package DesignPatterns.Singleton.BankAccountUsecase;

public class AccountDriver {
    public static void main(String[] args) {
        System.out.println("\n\nBank Account Number Generation Application using Singleton Design Pattern");
        // create new account
        CreateBankAccount account1 = CreateBankAccount.getNewAccount();
        // create second account
        CreateBankAccount account2 = CreateBankAccount.getNewAccount();
    }
}