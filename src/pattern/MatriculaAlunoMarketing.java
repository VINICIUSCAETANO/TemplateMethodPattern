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
public class MatriculaAlunoMarketing extends MatriculaAluno{

    @Override
    void escolheDisciplinas() {
        System.out.println("Você escolheu para esse Semestre:");
        System.out.println("Segmentação de Mercado");
        System.out.println("Marketing Digital");
    }

    @Override
    void finalizaMatricula() {
        System.out.println("Parabéns. você se matriculou em Marketing");
    }
    
}
