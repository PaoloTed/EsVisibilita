package pkg2;
import pkg1.A;

public class CA extends A {
    public int valCA_Public = valA_Public;
    public int valCA_Protected = valA_Protected;

    public void fc(){
        A a = new A();
        a.valA_Public = 5;
    }
}
