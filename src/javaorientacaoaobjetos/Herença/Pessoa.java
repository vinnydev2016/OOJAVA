package javaorientacaoaobjetos.Herença;

public class Pessoa {
    private String nome;
    private int idade;
    private String sexo;
    
    public void fazerAnversario(){
        this.setIdade(this.getIdade() + 1);
    }
    
  /*public Pessoa(String no, int id, String sex){
        this.setNome(no);
        this.setIdade(id);
        this.setSexo(sex);
    }*/ 
     
    public String getNome() {
        return this.nome;
    }

    public void setNome(String no) {
        this.nome = no;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int id) {
        this.idade = id;
    }

    public String getSexo() {
        return this.sexo;
    }

    public void setSexo(String sex) {
        this.sexo = sex;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + '}';
    }
    
    
    
}
