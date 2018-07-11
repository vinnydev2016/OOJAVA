package javaorientacaoaobjetos.ClassesEObjetos;

public class Caneta {
   //Atributos
   String modelo;
   String cor;
   double ponta;
   int carga;
   boolean tampada;
   
   //Métodos
   
   //VOID = sem retorno
   void Status(){
       System.out.println("Modelo: " + this.modelo);
       System.out.println("Uma Caneta " + this.cor);
       System.out.println("Ponta: " + this.ponta);
       System.out.println("Carga " + this.carga); 
       System.out.println("Está tampada? " + this.tampada); 
   }
   
   void Rabiscar(){
       if(this.tampada == true){
           System.out.println("ERRO! Não posso escrever, a CANETA está tampada.");
       } else{
           System.out.println("ESTOU RABISCANDO. CANETA está destampada");
       }
   }
   
   void Tampar(){
       this.tampada = true;
   }
   
   void Destampar(){
       this.tampada = false;
   }        
}
