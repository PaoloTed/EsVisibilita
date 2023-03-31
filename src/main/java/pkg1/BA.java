package pkg1;

public class BA extends A{
    public int valBA_Public = valA_Public;
    /*public int vba1 = this.valPublic;*/
    public int valBA_Protected = valA_Protected;
    /*public int vba1 = this.valProtected;*/
    public int valBA_Default = valA_Default;
    /*public int vba1 = this.valDefault;*/

    public void f(){
        A a = new A();
        a.valA_Public = 4;
        a.valA_Protected = 5;
        a.valA_Default = 5;
    }
}