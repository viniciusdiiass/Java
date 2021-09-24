package OO.composicao.exercicio3;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

    final String nome;
    List<Curso> cursos = new ArrayList<>();

    Aluno(String nome) {
        this.nome = nome;
    }

    void adicionarCurso(Curso curso) {
        this.cursos.add(curso);
        curso.alunos.add(this);
    }

    public String toString() {
        return nome;
    }

    Curso obterCursoPorNome() {
        for (Curso curso : this.cursos) {
            if (curso.nome.equalsIgnoreCase("java completo")) {
                return curso;
            }
        }

        return null;
    }
}


