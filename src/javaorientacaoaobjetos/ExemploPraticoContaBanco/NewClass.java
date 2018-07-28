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
        
        p2.sacar(800);
        
        p1.estadoAtual();
        p2.estadoAtual();
        
        
        ContaBanco p3 = new ContaBanco();
        p3.setNumeroDaConta(3333);
        p3.setDono("KAIO");
        p3.abrirConta("CP");
        
        p3.depositar(200);
        p3.pagarMensalidade();
        
        p3.sacar(280);
        p3.sacar(80);
        p3.estadoAtual();
    }
}
