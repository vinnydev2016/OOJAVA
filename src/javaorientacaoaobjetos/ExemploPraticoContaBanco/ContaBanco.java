package javaorientacaoaobjetos.ExemploPraticoContaBanco;

public final class ContaBanco {
    
    public int numeroDaCOnta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;
    
    public void estadoAtual(){
        System.out.println("-------------------------------------------");
        System.out.println("Numero da Conta: " + this.getNumeroDaConta());
        System.out.println("Tipo da Conta:" + this.getTipo());
        System.out.println("Dono da conta: " + this.getDono());
        System.out.println("Saldo da conta " + this.getSaldo());
        System.out.println("Status da conta " + this.getStatus());
    }
    
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        
        if (t == "CC"){
            this.saldo = 50;
        } else if(t == "CP"){
            this.saldo = 150;
        }
        System.out.println("Conta criada com sucesso");
    }
    
    public void fecharConta(){
        if (getSaldo() > 0) {
            System.out.println("A conta naão pode ser fechada. Há dinheiro nela.");
            
        } else if (getSaldo() < 0 ) {
            System.out.println("A conta não pode ser fechada. Ela está negativa.");
        } else{
            this.setStatus(false);
            System.out.println("CONTA FECHADA. PEDIMOS DESCULPAS POR EVENTUAIS TRANSTORNOS");
        }
    }
    
    public void depositar(double v){
        //se a conta estiver aberta
        if (this.getStatus()){ 
            // modificar o saldo para o saldo atual + o valor depositado
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Depósito realizado na conta de " + this.getDono());
        } else{
            System.out.println("Impossível fazer depósito. Conta FECHADA!");
        }
    }
    
    public void sacar(double v){
        if(this.getStatus()){
            if(this.getSaldo() >= v){
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado na conta de " + this.getDono());
            } else {
                System.out.println("Saldo insuficiente para saque.");
            }
        } else{
            System.out.println("Impossível sacar de uma conta fechada.");
        }
    
    }
    
    public void pagarMensalidade(){
        int v = 0;
        // tipo da conra
        if (this.getTipo() == "CC") {
            v = 12;
        } else if (this.getTipo() == "CP") {
            v = 20;
        }
        
        // verificar se a conta está aberta
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso por " + this.getDono());
            
        } else {
            System.out.println("IMPOSSIVEL PAGAR MENSALIDADE COM A CONTA FECHADA");
        }
    }
    
    // METODO CONSTRUTOR
    public ContaBanco(){
        this.saldo = 0;
        this.status = false;
    }
    // GETTERS E SETTERS
    
    public void setNumeroDaConta(int n){
        this.numeroDaCOnta = n;
    }
    
    public int getNumeroDaConta(){
        return this.numeroDaCOnta;
    }
    
    public void setTipo(String t){
        this.tipo = t;
    }
    
    public String getTipo(){
        return this.tipo;
    }
    
    public void setDono(String d){
        this.dono = d;
    }
    
    public String getDono(){
        return this.dono;
    }
    
    public void setSaldo(Double s){
        this.saldo = s;
    }
    
    public double getSaldo(){
        return this.saldo;
    }
    
    public void setStatus(boolean st){
        this.status = st;
    }
    
    public boolean getStatus(){
        return this.status;
    }
}
