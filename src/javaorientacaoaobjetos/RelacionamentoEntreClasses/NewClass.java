
package javaorientacaoaobjetos.RelacionamentoEntreClasses;


public class NewClass {
    public static void main(String[] args) {
        Lutador l [] = new Lutador[6]; // array
        
        l[0]= new Lutador("Anderson Silva", "Brasil", 34, 1.75, 78.8, 13, 0, 1);
        l[1] = new Lutador("Wanderlei Silva", "Brasil", 41, 1.78, 90, 7, 5, 2);
        
        l[0].apresentar();
        l[0].ganharLuta();
        l[0].status();
    }
}
