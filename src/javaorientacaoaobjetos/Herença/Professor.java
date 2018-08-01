package javaorientacaoaobjetos.Herença;
public class Professor extends Pessoa {
    private String especialidade;
    private double salario;
    
    public void receberAumento(double aum){
        this.setSalario(this.getSalario() + aum);

    }

    public String getEspecialidade() {
        return this.especialidade;
    }

    public void setEspecialidade(String esp) {
        this.especialidade = esp;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double sal) {
        this.salario = sal;
    }
    
    
}
