package javaorientacaoaobjetos.PolimorfismoParte1;

public class Teste {
    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        
        m.setPeso(35.3);
        m.setCorDoPelo("Marrom");
        // polimorfismo de sobreposição
        m.locomover();
        
        // polimorfismo de sobreposição
        a.locomover();
        
        // polimorfismo de sobreposição
        p.locomover();

        // polimorfismo de sobreposição
        r.locomover();
        
        Cachorro k = new Cachorro();
        Canguru c = new Canguru();
        Tartaruga t = new Tartaruga();
        
        t.locomover();
        c.locomover();
        k.emitirSom();
    }
}
