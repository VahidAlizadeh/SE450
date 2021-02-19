package DesignPatterns.FactoryMethod.mower;

abstract class MowerFactory {
    public abstract Mower getMowerType(String mowerType);
}