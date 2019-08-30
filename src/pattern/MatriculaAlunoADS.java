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
public class MatriculaAlunoADS extends MatriculaAluno {

    @Override
    void escolheDisciplinas() {
        System.out.println("Você escolheu para esse Semestre:");
        System.out.println("Programação II");
        System.out.println("Programação Para Internet II");
        System.out.println("Engenharia de Software III");
    }

    @Override
    void finalizaMatricula() {
        System.out.println("Parabéns. você se matriculou em ADS");
    }    
}
