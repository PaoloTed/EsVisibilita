package org.example;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        B prova = new B();
        B prova3 = new B();
        A prova2 = new A();
        prova.f();
        prova2.val = 15;
        prova.f();
        prova.val = 10;
        prova.f();
        prova3.f();
    }
}