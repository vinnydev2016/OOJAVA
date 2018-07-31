package javaorientacaoaobjetos.ExemploExtraAgregacaoEntreObjetos;

public final class Livro implements Publicacao {
    private String titulo, autor;
    private int totPag, pagAtual;
    private boolean aberto;
    private Pessoa leitor; // agregacao da classe pessoa

    
    public String detalhes() { // to string -> retorna as Strings
        return "Livro{" + "titulo=" + titulo + "\n, autor=" 
                + autor + "\n, totPag=" + totPag + "\n, pagAtual=" + pagAtual + "\n, aberto=" 
                + aberto + "\n, leitor=" + leitor.getNome() +
                "\n, idade=" + leitor.getIdade() +
                "\n, sexo=" + leitor.getSexo() + '}';
    }

    public Livro(String tit, String aut, int tpg, Pessoa ltr) {
        this.titulo = tit;
        this.autor = aut;
        this.totPag = tpg;
        this.setAberto(false);
        this.setPagAtual(0);
        this.leitor = ltr;
    }
    
    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String tit) {
        this.titulo = tit;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String aut) {
        this.autor = aut;
    }

    public int getTotPag() {
        return this.totPag;
    }

    public void setTotPag(int tpg) {
        this.totPag = tpg;
    }

    public int getPagAtual() {
        return this.pagAtual;
    }

    public void setPagAtual(int pgat) {
        this.pagAtual = pgat;
    }

    public boolean getAberto() {
        return this.aberto;
    }

    public void setAberto(boolean abrt) {
        this.aberto = abrt;
    }

    public Pessoa getLeitor() {
        return this.leitor;
    }

    public void setLeitor(Pessoa ltr) {
        this.leitor = ltr;
    }
    
    @Override
    public void abrir() {
        this.setAberto(true);
    }

    @Override
    public void fechar() {
        this.setAberto(false);
    }

    @Override
    public void folhear(int p) {
        if(p > this.getTotPag()){
            this.setPagAtual(0);
        }else{
            this.setPagAtual(p);
        }
        
    }

    @Override
    public void avancarPag() {
        this.setPagAtual(this.getPagAtual() + 1);
    }

    @Override
    public void voltarPag() {
        this.setPagAtual(this.getPagAtual() - 1);
    }
    
    
}
