package javaorientacaoaobjetos.RelacionamentoEntreClasses;

import java.util.Random;

public class Luta {
    private Lutador desafiado; // tipo abstrato de dado da classe Lutador -> tipo
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    
    public void marcarLuta(Lutador l1, Lutador l2){
        if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        } else{
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }
    
    public void lutar(){
        if(this.getAprovada()){
            System.out.println("*** DESAFIADO ***");
            this.desafiado.apresentar();
            System.out.println("*** DESAFIANTE ***");
            this.desafiante.apresentar();
            
            Random aleatorio = new Random(); // gerador de numeros aleatorios
            int vencedor = aleatorio.nextInt(3);
            
            System.out.println("**** RESULTADO DA LUTA ****");
            switch(vencedor){
                
             
                case 0: // empate
                    System.out.println("EMPATOU");
                    desafiado.empatarLuta();
                    desafiante.empatarLuta();
                    break;
                case 1: // desafiado ganha
                    System.out.println("O vencedor é : " + this.desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2: // desafiante ganha
                    System.out.println("O vencedor é: " + this.desafiante.getNome());
                    this.getDesafiante().ganharLuta();
                    this.getDesafiado().perderLuta();
                    break;
            }
            
            System.out.println("*******************");
        
        } else{
            System.out.println("A LUTA NAO PODE ACONTECER.");
        }
    
    }

    public Lutador getDesafiado() {
        return this.desafiado;
    }

    public void setDesafiado(Lutador dsfd) {
        this.desafiado = dsfd;
    }

    public Lutador getDesafiante() {
        return this.desafiante;
    }

    public void setDesafiante(Lutador dsfnt) {
        this.desafiante = dsfnt;
    }

    public int getRounds() {
        return this.rounds;
    }

    public void setRounds(int r) {
        this.rounds = r;
    }

    public boolean getAprovada() {
        return this.aprovada;
    }

    public void setAprovada(boolean ap) {
        this.aprovada = ap;
    }
    
    
}
