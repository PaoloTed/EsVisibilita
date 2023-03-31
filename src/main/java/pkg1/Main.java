package pkg1;

import pkg2.CA;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        A a = new A();
        a.valA_Public = 5;
        a.valA_Protected= 5;
        a.valA_Default = 5;

        BA ba = new BA();
        ba.valBA_Public = 5;
        ba.valBA_Protected = 5;
        ba.valBA_Default = 5;

        ba.valA_Public = 5;
        ba.valA_Protected = 5;
        ba.valA_Default = 5;

        E e = new E();
    }
}