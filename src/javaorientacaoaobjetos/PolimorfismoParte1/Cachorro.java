package javaorientacaoaobjetos.PolimorfismoParte1;
public class Cachorro extends Mamifero {
    public void enterrarOsso(){
        System.out.println("Osso enterrado");
    }
    
    public void abanarRabo(){
        System.out.println("Abanando rabo");
    }
    
    @Override
    public void emitirSom(){
        System.out.println("AU! AU! AU!");
    }
}
