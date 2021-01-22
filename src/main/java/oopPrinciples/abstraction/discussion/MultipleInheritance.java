package oopPrinciples.abstraction.discussion;

public class MultipleInheritance {
}
interface MyInterfaceA {
    void showA();
}
interface MyInterface5B {
    void showB();
}

class MyClassMulti implements MyInterfaceA, MyInterface5B {
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