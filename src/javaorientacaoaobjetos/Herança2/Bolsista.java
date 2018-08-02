package javaorientacaoaobjetos.Herança2;

public class Bolsista extends Aluno {
    private double bolsa;
    
    public void renovarBolsa(){
        System.out.println("Renovando bolsa de " + this.getNome());
    }
    
    @Override // metodo sobreposto
    public void pagarMensalidade(){
        System.out.println(this.getNome() + " é bolsista. Pagamento Facilitado");
    }

    public double getBolsa() {
        return bolsa;
    }

    public void setBolsa(double bolsa) {
        this.bolsa = bolsa;
    }
    
    
}
