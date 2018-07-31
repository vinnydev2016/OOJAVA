package javaorientacaoaobjetos.ExemploExtraAgregacaoEntreObjetos;

public class NewClass {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];
        
        p[0] = new Pessoa("João", 25, "Masculino");
        p[1] = new Pessoa("Maria", 76, "Feminino");
        
       l[0] = new Livro("Aprendendo POO", "José Bento", 30, p[0]);
       l[1] = new Livro("Java Basico", "Pedro Paulo", 500, p[1]);
       l[2] = new Livro("Java Avançado", "Maria Candido", 800, p[0]);
       
        l[0].abrir();
        l[0].folhear(25);
        l[0].avancarPag();
        l[0].voltarPag();
        l[0].fechar();
        System.out.println(l[0].detalhes());
       
        // System.out.println(l[1].detalhes());
       // System.out.println(l[2].detalhes());
    }
}
