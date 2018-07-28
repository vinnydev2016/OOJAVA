package javaorientacaoaobjetos.Encapsulamento;
public class ControleRemoto implements Controlador {
   private int volume;
   private boolean ligado;
   private boolean tocando;
   
   //Metodos especiais
   public ControleRemoto(){
       this.setVolume(50);
       this.setLigado(true);
       this.setTocando(false);
   }
   
   private void setVolume(int v){
       this.volume = v;
   }
   private int getVolume(){
       return this.volume;
   }
   
   private void setLigado(boolean l){
       this.ligado = l;
   }
   
   private boolean getLigado(){
       return this.ligado;
   }
   
   private void setTocando(boolean t){
       this.tocando = t;
   }
   
   private boolean getTocando(){
       return this.tocando; 
   }
   
   //Metodos Abstratos

    @Override // metodo sobrescrito da interface
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        if (this.getLigado()){
            System.out.println("==========MENU==========");
            System.out.println("Está ligado? " + this.getLigado());
            System.out.println("Está tocando? " + this.getTocando());
            System.out.println("Volume: " + this.getVolume());
            for (int i = 1; i <= this.getVolume(); i+=10){
                System.out.print("?");
            }
        } else{
            System.out.println("Impossível mostrar menu. Controle Desligado.");
        }
        
            System.out.println("");
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu.");
    }

    @Override
    public void maisVolume() {
        if (this.getLigado()){
            this.setVolume(this.getVolume() + 10);
        } else{
            System.out.println("Impossível aumentar volume. Controle desligado.");
        }
    }

    @Override
    public void menosVolume() {
        if (this.getLigado()){
            this.setVolume(this.getVolume() - 10);
        } else{
            System.out.println("Impossível diminuir volume. Controle desligado.");
        }
    }

    @Override
    public void ligarMudo() {
        if(this.getLigado() && this.getVolume() > 0 ){
            this.setVolume(0);
        } else{
            System.out.println("Impossivel ligar o mudo. Controle desligado.");
        }
    }

    @Override
    public void desligarMudo() {
        if (this.getLigado() && this.getVolume() == 0 ){
            this.setVolume(50);
        } else{
            System.out.println("Impossível desligar o mudo. Controle desligado.");
        }
    }

    @Override
    public void play() {
        if (this.getLigado() && !(this.getTocando())){
            this.setTocando(true);
        } else {
            System.out.println("Impossível reproduzir. Controle desligado.");
        }
    }

    @Override
    public void pause() {
        if (this.getLigado() && this.getTocando()){
            this.setTocando(false);
        } else {
            System.out.println("Impossível pausar. Controle desligado.");
        }
    }
   
}
