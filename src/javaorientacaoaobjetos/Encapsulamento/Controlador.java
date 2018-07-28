package javaorientacaoaobjetos.Encapsulamento;
public interface Controlador {
    /*
        Interface controladora da classe ControleRemoto
        Na interface, os métodos não são implementados.
    */
    
    public abstract void ligar();
    public abstract void desligar();
    public abstract void abrirMenu();
    public abstract void fecharMenu();
    public abstract void maisVolume();
    public abstract void menosVolume();
    public abstract void ligarMudo();
    public abstract void desligarMudo();
    public abstract void play();
    public abstract void pause();
    
    
}
