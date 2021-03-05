package DesignPatterns.Adapter.RealEstateExample;

public class AcreageDeterminator {

    Lot lot;

    public double determineAcreage(Lot lot) {
        this.lot = lot;
        return this.lot.length * this.lot.width;
    }
}
