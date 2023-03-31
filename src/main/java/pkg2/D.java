package pkg2;
import pkg1.A;
/*Non Sottoclasse di "A" e diverso package di "A"*/
public class D {
    /*Accessibile Senza Riferimento Alla Classe "A" Necessario
     *
     * Niente
     *
     * */


    /*Accessibile Con Riferimento Alla Classe "A" Necessario*/
        public void f(){
            A a = new A();
            a.valA_Public = 5;
        }
}
