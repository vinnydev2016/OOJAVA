package javaorientacaoaobjetos.MetodosEspeciais;

public class NewClass {
    public static void main(String[] args) {
        /*
        Caneta c1 = new Caneta();
        
        c1.setModelo("Bic Cristal"); //acesso ao objeto -> protegido pelo metodo Set
        //c1.modelo = "Bic Cristal"; // acesso ao atributo
        
        c1.setPonta(0.7);
        //c1.ponta = 0.7;
        System.out.println("Tenho uma caneta " + c1.getModelo() 
                + " de ponta " + c1.getPonta());
        */
        
        //Parametros do metodo construtor, que está na classe Caneta
        Caneta c2 = new Caneta("Nic", "Amarelo", 0.4);
        c2.status();
        
        System.out.println("");
        
        Caneta c3 = new Caneta("Sharpie", "Roxa", 1.8);
        c3.status();
        
    }
}
