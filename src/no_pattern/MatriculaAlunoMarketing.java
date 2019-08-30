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
public class MatriculaAlunoMarketing {

    public MatriculaAlunoMarketing() {
     escolheDisciplinas();
     finalizaMatricula();
     realizaPagamento();
     System.out.println();
    
    }
    
   
    void escolheDisciplinas() {
        System.out.println("Você escolheu para esse Semestre:");
        System.out.println("Segmentação de Mercado");
        System.out.println("Marketing Digital");
    }

    
    void finalizaMatricula() {
        System.out.println("Parabéns. você se matriculou em Marketing");
   
    }
   
    final void realizaPagamento() {
        System.out.println("Você pagou a matrícula - Está matriculado");
    }
}
