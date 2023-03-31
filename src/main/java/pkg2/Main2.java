package pkg2;

import pkg1.A;
import pkg1.BA;
import pkg1.E;

public class Main2 {

    public static void main(String[] args) {
        A a = new A();
        a.valA_Public = 5;

        CA ca = new CA();
        ca.valCA_Public = 5;
        ca.valCA_Protected = 5;
        ca.valA_Public = 5;

        D d = new D();
    }
}