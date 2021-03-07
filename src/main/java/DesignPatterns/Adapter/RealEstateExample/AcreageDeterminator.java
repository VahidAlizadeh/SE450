/*
 * Copyright (c) 2021.
 * Vahid Alizadeh
 * SE 450
 * DePaul University
 */

package DesignPatterns.Adapter.RealEstateExample;

public class AcreageDeterminator {

    Lot lot;

    public double determineAcreage(Lot lot) {
        this.lot = lot;
        return this.lot.length * this.lot.width;
    }
}
