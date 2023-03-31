package pkg1;
/*Non Sottoclasse di "A" e stesso package di "A"*/
public class E {
    /*Accessibile Senza Riferimento Alla Classe "A" Necessario
    *
    * Niente
    *
    * */


    /*Accessibile Con Riferimento Alla Classe "A" Necessario*/
        public void f(){
            A a = new A();
            a.valA_Public = 5;
            a.valA_Protected = 5;
            a.valA_Default = 5;
        }
}
