package javaorientacaoaobjetos.ExemploPraticoContaBanco;

public class NewClass {
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNumeroDaConta(1111);
        p1.setDono("Vinnycius");
        p1.abrirConta("CC");
        
        ContaBanco p2 = new ContaBanco();
        p2.setNumeroDaConta(2222);
        p2.setDono("Alessandra");
        p2.abrirConta("CP");
        
        p1.depositar(100);
        p2.depositar(500);
        p2.sacar(1000);
        
        p1.sacar(150);
        p1.fecharConta();
        
        p2.pagarMensalidade();
        
        p1.estadoAtual();
        p2.estadoAtual();
        
        
    }
}
