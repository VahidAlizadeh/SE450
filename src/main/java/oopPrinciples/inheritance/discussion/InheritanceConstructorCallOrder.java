/*
 * Copyright (c) 2021.
 * Vahid Alizadeh
 * SE 450
 * DePaul University
 */

package oopPrinciples.inheritance.discussion;

//Demo to show the order of constructor call
public class InheritanceConstructorCallOrder {}

class ParentClass {
    ParentClass() {
        System.out.println("Inside Parent Constructor.");
    }
}
class ChildClass extends ParentClass {
    ChildClass() {
        System.out.println("Inside Child Constructor.");
    }
}
class GrandchildClass extends ChildClass {
    GrandchildClass() {
        System.out.println("Inside GrandChild Constructor.");
    }
}

class DemoConsOrder {
    public static void main(String[] args) {
        System.out.println("***Demo constructor calling order***");
        GrandchildClass grandChild = new GrandchildClass();
    }
}