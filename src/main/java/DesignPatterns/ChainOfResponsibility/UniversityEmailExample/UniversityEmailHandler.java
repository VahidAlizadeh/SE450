/*
 * Copyright (c) 2021.
 * Vahid Alizadeh
 * SE 450
 * DePaul University
 */

package DesignPatterns.ChainOfResponsibility.UniversityEmailExample;

public interface UniversityEmailHandler {

    public void setNextEmailHandler(UniversityEmailHandler emailHandler);

    public void processEmailHandler(String emailText);

}
