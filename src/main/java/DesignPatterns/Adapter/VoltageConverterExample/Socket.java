/*
 * Copyright (c) 2021.
 * Vahid Alizadeh
 * SE 450
 * DePaul University
 */

package DesignPatterns.Adapter.VoltageConverterExample;

public class Socket {

    public Volt getVolt(){
        return new Volt(120);
    }
}
