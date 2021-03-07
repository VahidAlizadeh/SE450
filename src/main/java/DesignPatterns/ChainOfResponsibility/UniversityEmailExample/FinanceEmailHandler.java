/*
 * Copyright (c) 2021.
 * Vahid Alizadeh
 * SE 450
 * DePaul University
 */

package DesignPatterns.ChainOfResponsibility.UniversityEmailExample;

public class FinanceEmailHandler extends MainEmailHandler {

    protected String[] keyWords() {
        // setup keywords for the receiver team
        return new String[] {"financial", "student aid", "tuition"};
    }

    protected void processEmailFinal(String emailText) {
        System.out.println("The Finance Team processed the email.");
    }

    @Override
    public void setNextEmailHandler(UniversityEmailHandler emailHandler) {

    }
}