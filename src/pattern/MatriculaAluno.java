/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pattern;

/**
 *
 * @author vinicius
 */
public abstract class MatriculaAluno {   
        
    final void realizaMatrícula() {
        escolheDisciplinas();
        finalizaMatricula();
        realizaPagamento();
        System.out.println();
    }
    
    abstract void escolheDisciplinas();
    abstract void finalizaMatricula();
    
    final void realizaPagamento() {
        System.out.println("Você pagou a matrícula - Está matriculado");
    }
}
