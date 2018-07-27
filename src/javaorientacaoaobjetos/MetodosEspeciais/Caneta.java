package javaorientacaoaobjetos.MetodosEspeciais;

public final class Caneta {
    private String modelo;
    private double ponta;
    private String cor;
    private boolean tampada;
    
    //Método construtor
    public Caneta(String m, String c, double p ){ //Método construtor. O mesmo nome da classe.
        this.setModelo(m);
        this.setCor(c);
        this.setPonta(p);
        tampar();
    }
    
    void tampar(){
        this.tampada = true;
    }
    
    void destampar(){
        this.tampada = false;
    }
    
    //metodo acessor
    public String getModelo(){
        return this.modelo;
    }
    
    //metodo modificador
    public void setModelo(String m){
        this.modelo = m;
    }
    
    public double getPonta(){
        return this.ponta;
    }
    
    public void setPonta(double p){
        this.ponta = p;
    }
    
    public String getCor(){
        return this.cor;
    }
    
    public void setCor(String c){
        this.cor = c;
    }
    
    public boolean getTampada(){
        return this.tampada;
    }
    
    public void setTampada(boolean t){
        this.tampada = t;
    }
    void status(){
        
        System.out.println("Modelo : " + this.getModelo()); // acesso ao objeto
        //System.out.println("Modelo : " + this.modelo); // acesso ao atributo
        
        System.out.println("Ponta : " + this.getPonta());
        
        System.out.println("Cor: " + this.getCor());
        
        System.out.println("Tampada: " + this.getTampada());
    }
}
