package pkg2;
import pkg1.A;

/*Sottoclasse di "A" e diverso package di "A" */
public class CA extends A {
    /*Accessibile Senza Riferimento Alla Classe "A" Necessario*/
        public int valCA_Public = valA_Public;
        /*public int valCA_Public = this.valA_Public;*/
        public int valCA_Protected = valA_Protected;
        /*public int valCA_Protected = this.valA_Protected;*/

    /*Accessibile Con Riferimento Alla Classe "A" Necessario*/
        public void f(){
            A a = new A();
            a.valA_Public = 5;
        }
}
