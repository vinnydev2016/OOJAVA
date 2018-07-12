package javaorientacaoaobjetos.ClassesEObjetos;

public class Caneta {
   //Atributos
   public String modelo;
   public String cor;
   private double ponta;
   protected int carga;
   private boolean tampada;
   
   //Métodos
   
   //VOID = sem retorno
   public void Status(){
       System.out.println("Modelo: " + this.modelo);
       System.out.println("Uma Caneta " + this.cor);
       System.out.println("Ponta: " + this.ponta);
       System.out.println("Carga " + this.carga); 
       System.out.println("Está tampada? " + this.tampada); 
   }
   
   public void Rabiscar(){
       if(this.tampada == true){
           System.out.println("ERRO! Não posso escrever, a CANETA está tampada.");
       } else{
           System.out.println("ESTOU RABISCANDO. CANETA está destampada");
       }
   }
   
   public void Tampar(){
       this.tampada = true;
   }
   
   public void Destampar(){
       this.tampada = false;
   }        
}
