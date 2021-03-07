/*
 * Copyright (c) 2021.
 * Vahid Alizadeh
 * SE 450
 * DePaul University
 */

package DesignPatterns.Adapter.RealEstateExample;

public class AcreageDeterminatorAdapter {

    AcreageDeterminator determinator;
    Estate estate;

    public double determineAcreage(Estate estate) {
        determinator = new AcreageDeterminator();
        this.estate = estate;
        Lot lot = new Lot();

        lot.length = this.estate.length;
        lot.width = this.estate.width;

        return (determinator.determineAcreage(lot) / 43560);
    }
}
