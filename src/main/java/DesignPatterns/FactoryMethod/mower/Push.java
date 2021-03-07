/*
 * Copyright (c) 2021.
 * Vahid Alizadeh
 * SE 450
 * DePaul University
 */

package DesignPatterns.FactoryMethod.mower;

public class Push implements Mower {
    @Override
    public void mow() {
        System.out.println("Push mowers are good for small yards.");
    }
}