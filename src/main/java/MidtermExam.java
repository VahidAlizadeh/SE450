/*
 * Copyright (c) 2021.
 * Vahid Alizadeh
 * SE 450
 * DePaul University
 */

class First {
    public void method2() {
        System.out.println("First2");
    }

    public void method3() {
        method2();
    }
}

class Second extends First {
    public void method2() {
        System.out.println("Second2");
    }
}

class Third extends Second {
    public void method1() {
        System.out.println("Third1");
        super.method2();
    }

    public void method2() {
        System.out.println("Third2");
    }
}

class Fourth extends First {
    public void method1() {
        System.out.println("Fourth1");
    }

    public void method2() {
        System.out.println("Fourth2");
    }
}

class Demo {
    public static void main(String[] args) {

        First var1 = new Second();
        First var2 = new Third();
        First var3 = new Fourth();
        Second var4 = new Third();

        var1.method2();
        var2.method2();
        var3.method2();
        var4.method2();

        var1.method3();
        var2.method3();
        var3.method3();
        var4.method3();

//        ((Second) var4).method1();
        ((Third) var4).method1();

    }
}