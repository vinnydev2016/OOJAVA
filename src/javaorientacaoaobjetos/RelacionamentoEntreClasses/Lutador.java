package javaorientacaoaobjetos.RelacionamentoEntreClasses;

public final class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private double altura;
    private double peso;
    private String categoria;
    private int vitorias, derrotas, empates;
    
    public void apresentar(){
        System.out.println("-------------------Apresentação----------------------");
        System.out.println("Chegou a hora! Apresentamos o Lutador: " + this.getNome());
        System.out.println("Origem: " + this.getNacionalidade());
        System.out.println( this.getIdade() + " Anos");
        System.out.println(this.getAltura() + " Metros de altura");
        System.out.println("Pesando " +this.getPeso() + " Kg");
        System.out.println("Ganhou: " + this.getVitorias());
        System.out.println("Perdeu: " + this.getDerrotas());
        System.out.println("Empatou " + this.getEmpates());
    }
    
    public void status(){
         System.out.println("-------------------Status----------------------");
        System.out.println(this.getNome() + "é um peso " + this.getCategoria());
        System.out.println(this.getVitorias() + " Vitorias");
        System.out.println(this.getDerrotas() + " Derrotas");
        System.out.println(this.getEmpates() + " Empates");   
    }
    
    public void ganharLuta(){
        this.setVitorias(this.getVitorias() + 1);
    }
    
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas() + 1);
    }
    
    public void empatarLuta(){
        this.setEmpates(this.getEmpates() + 1);
    
    }
    
    //construtor

    public Lutador(String no, String na, int id, double al, double pe, int vi, int de, int em) {
        this.setNome(no);
        this.setNacionalidade(na);
        this.setIdade(id);
        this.setAltura(al);
        this.setPeso(pe);
        this.setVitorias(vi);
        this.setDerrotas(de);
        this.setEmpates(em);
    }

    // getters e setters
    public String getNome() {
        return this.nome;
    }

    public void setNome(String no) {
        this.nome = no;
    }

    public String getNacionalidade() {
        return this.nacionalidade;
    }

    public void setNacionalidade(String na) {
        this.nacionalidade = na;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int id) {
        this.idade = id;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double al) {
        this.altura = al;
    }

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double pe) {
        this.peso = pe;
        this.setCategoria();
    }

    public String getCategoria() {
        return this.categoria;
    }

    private void setCategoria() {
        if (this.getPeso() < 52.2) {
            this.categoria = "Invâlido";
        } else if (this.getPeso() <= 70.3) {
            this.categoria = "Leve";
        } else if (this.getPeso() <= 83.9){
            this.categoria = "Médio";
        } else if (this.getPeso() <= 120.2 ){
            this.categoria = "Pesado";
        } else{
            this.categoria = "inválido";
        }
    } 

    public int getVitorias() {
        return this.vitorias;
    }

    public void setVitorias(int vi) {
        this.vitorias = vi;
    }

    public int getDerrotas() {
        return this.derrotas;
    }

    public void setDerrotas(int de) {
        this.derrotas = de;
    }

    public int getEmpates() {
        return this.empates;
    }

    public void setEmpates(int em) {
        this.empates = em;
    }
    
    
    
}
