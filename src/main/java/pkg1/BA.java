package pkg1;

public class BA extends A{
    public int vba1 = valPublic;
    public int vba2 = valProtected;
    public int vba3 = valDefault;

    public void f(){
        A a = new A();
        a.valProtected = 4;
        a.valDefault = 5;
        a.valPublic = 5;
    }
}