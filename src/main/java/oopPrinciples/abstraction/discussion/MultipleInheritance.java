/*
 * Copyright (c) 2021.
 * Vahid Alizadeh
 * SE 450
 * DePaul University
 */

package oopPrinciples.abstraction.discussion;

public class MultipleInheritance {
}
interface MyInterfaceA {
    void showA();
}
interface MyInterfaceB {
    void showB();
}

class MyClassMulti implements MyInterfaceA, MyInterfaceB {
    @Override
    public void showA() {
        System.out.println("Inside MyClass5,show5A() is completed.");
    }
    @Override
    public void showB() {
        System.out.println("Inside MyClass5,show5B() is completed.");
    }
}

class DemoMultipleInheritance {
    public static void main(String[] args) {
        System.out.println("***Demo: Implementation of multiple interfaces.***\n");
        MyClassMulti myClassMultiOb = new MyClassMulti();
        myClassMultiOb.showA();
        myClassMultiOb.showB();
    }
}