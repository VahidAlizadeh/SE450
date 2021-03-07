/*
 * Copyright (c) 2021.
 * Vahid Alizadeh
 * SE 450
 * DePaul University
 */

package DesignPatterns.ChainOfResponsibility.EmailForwardingExample;

public class NewLocHandler implements Handler {

    private Handler chain;
    @Override

    public void setNextChain(Handler nextChain) {
        this.chain=nextChain;
    }

    @Override
    public void forwardMail(Mail mailObj) {
        /*
         * Checking a mail subject.
         */
        if(mailObj.getSubject().equalsIgnoreCase(Handler.NEW_LOC_MAIL)){
            System.out.println("Forwarding Mail to Business Development Group.");
        }else{
            this.chain.forwardMail(mailObj);
        }

    }
}