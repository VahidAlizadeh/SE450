/*
 * Copyright (c) 2021.
 * Vahid Alizadeh
 * SE 450
 * DePaul University
 */

package DesignPatterns.FactoryMethod.mower;

public class Riding implements Mower {
    @Override
    public void mow() {
        System.out.println("Riding mowers provide safety and comfort.");
    }
}