/*
 * Copyright (c) 2021.
 * Vahid Alizadeh
 * SE 450
 * DePaul University
 */

package DesignPatterns.FactoryMethod.mower;

abstract class MowerFactory {
    public abstract Mower getMowerType(String mowerType);
}