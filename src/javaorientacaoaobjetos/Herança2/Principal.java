package javaorientacaoaobjetos.Herança2;
public class Principal {
    public static void main(String[] args) {
        //Pessoa p1 = new Pessoa();  -> A classe pessoa é abstrata; logo não pode gerar objetos
        
        //Herança de implementação
        Visitante v1 = new Visitante();
        v1.setNome("Jubilut");
        v1.setIdade(35);
        v1.setSexo("M");
        System.out.println(v1.toString());
        
        //Herança para diferença
        Aluno a1 = new Aluno();
        a1.setNome("Ricardo");
        a1.setIdade(20);
        a1.setSexo("M");
        a1.setCurso("Física");
        a1.setMatricula(1111);
        a1.pagarMensalidade();
         // Aluno = especialização -> Pessoa
        // Pessoa = generalização -> Aluno
        
        Bolsista b1 = new Bolsista();
        b1.setMatricula(91111);
        b1.setNome("Kaio");
        b1.setBolsa(100);
        b1.setSexo("M");
        b1.pagarMensalidade(); // dois tipos de pagarMensalidade. para alunos normais e Bolsistas - sobreposto.
        
       
    }
}
