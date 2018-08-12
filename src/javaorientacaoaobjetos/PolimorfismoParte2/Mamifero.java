package javaorientacaoaobjetos.PolimorfismoParte2;

import javaorientacaoaobjetos.PolimorfismoParte2.Animal;

public class Mamifero extends Animal {
    protected String corDoPelo;

    public String getCorDoPelo() {
        return corDoPelo;
    }

    public void setCorDoPelo(String corDoPelo) {
        this.corDoPelo = corDoPelo;
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de mamifero");
    }
    
    
}
