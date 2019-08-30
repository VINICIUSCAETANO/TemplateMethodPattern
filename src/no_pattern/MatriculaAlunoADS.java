/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package no_pattern;

/**
 *
 * @author aluno
 */
public class MatriculaAlunoADS {

    public MatriculaAlunoADS() {
        escolheDisciplinas();
        finalizaMatricula();
        realizaPagamento();
        System.out.println();
    }
          
    void escolheDisciplinas() {
        System.out.println("Você escolheu para esse Semestre:");
        System.out.println("Programação II");
        System.out.println("Programação Para Internet II");
        System.out.println("Engenharia de Software III");
    }
    
    void finalizaMatricula() {
        System.out.println("Parabéns. você se matriculou em ADS");
    }
    
    final void realizaPagamento() {
        System.out.println("Você pagou a matrícula - Está matriculado");
    }
}
