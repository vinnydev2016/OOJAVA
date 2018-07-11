package javaorientacaoaobjetos.ClassesEObjetos;

public class NewClass {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "Compactor";
        c1.cor = "Azul";
        c1.ponta = 0.5;
        c1.carga = 100;
        c1.Destampar();
        c1.Status();
        c1.Rabiscar();
        
        //Pula linha
        System.out.println("");
        
        //Instanciando uma nova caneta
        Caneta c2 = new Caneta();
        c2.modelo = "Bic";
        c2.cor = "Vermelha";
        c2.ponta = 1.0;
        c2.carga = 8;
        c2.Tampar();
        c2.Status();
        c2.Rabiscar();
       
    }
}
