package javaorientacaoaobjetos.Herença;

public class Aluno extends Pessoa {
    private int matricula;
    private String curso;
    
    public void cancelarMatricula(){
        System.out.println("Matricula será cancelada. Desculpas por eventuais transtornos.");
    }

    public int getMatricula() {
        return this.matricula;
    }

    public void setMatricula(int mat) {
        this.matricula = mat;
    }

    public String getCurso() {
        return this.curso;
    }

    public void setCurso(String cur) {
        this.curso = cur;
    }
    
    
}
