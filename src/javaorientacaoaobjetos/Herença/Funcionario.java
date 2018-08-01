package javaorientacaoaobjetos.Herença;
public class Funcionario extends Pessoa {
    private String setor;
    private boolean trabalhando;
    
    public void mudarTrabalho(String mdrTrb){
        this.trabalhando = ! this.trabalhando;
        
    }

    public String getSetor() {
        return this.setor;
    }

    public void setSetor(String se) {
        this.setor = se;
    }

    public boolean getTrabalhando() {
        return this.trabalhando;
    }

    public void setTrabalhando(boolean tbl) {
        this.trabalhando = tbl;
    }
    
}
