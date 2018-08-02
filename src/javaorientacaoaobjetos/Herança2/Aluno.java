/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaorientacaoaobjetos.Herança2;

/**
 *
 * @author Vinnycius
 */
public class Aluno extends Pessoa{ // se incluir o atributo FINAL, esta classe  nao podera ser instanciada. como na classe Bolsista.
    private int matricula;
    private String curso;
    
    public void pagarMensalidade(){ // se incluir o atributo FINAL, este metodo nao podera ser sobreposto. como na classe Bolsista.
        System.out.println("Pagando mensalidade do aluno " + this.getNome());
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
