package pkg1;

/*Sottoclasse di "A" e stesso package di "A" */
public class BA extends A{
    /*Accessibile Senza Riferimento Alla SuperClasse "A" Necessario*/
        public int valBA_Public = valA_Public;
        /*public int valBA_Public = this.valA_Public;*/
        public int valBA_Protected = valA_Protected;
        /*public int valBA_Protected = this.valA_Protected;*/
        public int valBA_Default = valA_Default;
        /*public int valBA_Default = this.valA_Default;*/

    /*Accessibile Con Riferimento Alla SuperClasse "A" Necessario*/
        public void f(){
            A a = new A();
            a.valA_Public = 4;
            a.valA_Protected = 5;
            a.valA_Default = 5;
        }
}