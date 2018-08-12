package javaorientacaoaobjetos.PolimorfismoParte2;

public class Teste {
    public static void main(String[] args) {
        Cachorro c = new Cachorro();
        
        //Polimorfismo de sobreposição
        c.emitirSom();
        
        //Polimorfismo de sobrecarga
        c.reagir("Vai apanhar");
        c.reagir(true);
        c.reagir(2, 18);
        c.reagir(2, 15);
    }
    
}
