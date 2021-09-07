package OO.composicao.exercicio3;

public class CursoTeste {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("Vinicius");
        Aluno aluno2 = new Aluno("Francisco");
        Aluno aluno3 = new Aluno("Juan");

        Curso curso1 = new Curso("Java Completo");
        Curso curso2 = new Curso("React Native");
        Curso curso3 = new Curso("Web 2023");

        curso1.adicionarAluno(aluno1);
        curso1.adicionarAluno(aluno2);

        curso2.adicionarAluno(aluno1);
        curso2.adicionarAluno(aluno3);

        aluno1.adicionarCurso(curso3);
        aluno2.adicionarCurso(curso3);
        aluno3.adicionarCurso(curso3);

        for (Aluno aluno:curso1.alunos) {
            System.out.println("Estou matriculado no curso " + curso1.nome +
                    " e o meu nome é " + aluno.nome + "......");}

       System.out.println(aluno1.cursos.get(0).alunos);

        Curso cursoEncontrado = aluno1.obterCursoPorNome("java completo");

        if (cursoEncontrado != null) {
            System.out.println(cursoEncontrado.nome);
            System.out.println(cursoEncontrado.alunos);
        }
    }
}
