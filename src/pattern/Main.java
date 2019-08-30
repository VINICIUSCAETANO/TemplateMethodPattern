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
public class Main {
    public static void main(String[] args) {
        /** Isso não vai funcionar
        MatriculaAluno matriculaAluno;
        matriculaAluno = new MatriculaAluno();
        **/
        
        //declaração
        MatriculaAlunoADS matriculaAlunoADS;
        //criação do objeto (instanciação)
        matriculaAlunoADS = new MatriculaAlunoADS();
        //uso do objeto
        matriculaAlunoADS.realizaMatrícula();
        
        
        //declaração
        MatriculaAlunoMarketing matriculaAlunoMarketing;
        //criação do objeto (instanciação)
        matriculaAlunoMarketing = new MatriculaAlunoMarketing();
        //uso do objeto
        matriculaAlunoMarketing.realizaMatrícula();
    }
}
