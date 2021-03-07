/*
 * Copyright (c) 2021.
 * Vahid Alizadeh
 * SE 450
 * DePaul University
 */

package DesignPatterns.AbstractFactory.MotorHome;

public abstract class MotorHomeAbstractFactory {
    public abstract Frame createFrame();
    public abstract Style createStyle();
    public abstract Engine createEngine();
    public abstract Kitchen createKitchen();
}
