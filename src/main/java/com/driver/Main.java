package com.driver;

class A {
    String meth() {
        return "Invoking method from class A";
    }
}

class B extends A {
    @Override
    String meth() {
        return "Method is overridden in Extended class B";
    }
}

public class Main {
    public static void main(String[] args) {
        A objA = new A();
        B objB = new B();

        System.out.println(objA.meth());  // Step 3: Calling method from class A using object of class A
        System.out.println(objB.meth());  // Step 5: Calling overridden method from object of class B
    }
}
