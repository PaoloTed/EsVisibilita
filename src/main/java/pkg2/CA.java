package pkg2;
import pkg1.*;

public class CA extends A {
    public int vca1 = valProtected;
    /*public int vca1 = this.valProtected;*/
    public int vca2 = valPublic;
    /*public int vca2 = this.valPublic;*/

    public void fc(){
        A a = new A();
        a.valPublic = 5;
    }
}
