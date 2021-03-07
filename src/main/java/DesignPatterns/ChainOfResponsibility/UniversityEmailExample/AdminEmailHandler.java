/*
 * Copyright (c) 2021.
 * Vahid Alizadeh
 * SE 450
 * DePaul University
 */

package DesignPatterns.ChainOfResponsibility.UniversityEmailExample;

public class AdminEmailHandler extends MainEmailHandler {

    protected String[] keyWords() {
        // Here it does not matter what the keywords are
        return new String[0];
    }

    protected void processEmailFinal(String emailText) {
        System.out.println("The Admin Team processed the email.");
    }

    @Override
    public void setNextEmailHandler(UniversityEmailHandler emailHandler) {

    }
}