/*
 * Copyright (c) 2021.
 * Vahid Alizadeh
 * SE 450
 * DePaul University
 */

package DesignPatterns.ChainOfResponsibility.EmailForwardingExample;

public interface Handler {

    String SPAM_MAIL="SPAM_MAIL";
    String FAN_MAIL="FAN_MAIL";
    String COMPLAINT_MAIL="COMPLAINT_MAIL";
    String NEW_LOC_MAIL="NEW_LOC_MAIL";

    void setNextChain(Handler nextChain);
    void forwardMail(Mail mailObj);
}
