/*
 * Copyright (c) 2021.
 * Vahid Alizadeh
 * SE 450
 * DePaul University
 */

package DesignPatterns.FactoryMethod.mower;

public class ConcreteMowerFactory extends MowerFactory {
    @Override
    public Mower getMowerType(String mowerType) {
        if (mowerType == "Riding") {
            return  new Riding();
        } else if (mowerType == "Push") {
            return new Push();
        } else {
            System.out.println("Invalid mower type selected.");
            return null;
        }
    }
}
