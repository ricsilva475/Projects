import java.util.LinkedList;

    public class Aluno {

        private String nome;
        private long idade;
        private String curso;
        private LinkedList<Curso> cursos;

        public Aluno(String nome, long idade, String curso) {

            this.nome = nome;
            this.idade = idade;
            this.curso = curso;
            this.cursos = new LinkedList<>();
        }

            public void name(){
            System.out.println("Nome:" + this.nome);
            }
            public void age(){
            System.out.println("Idade:" + this.idade);
            }
            public void curso(){
            System.out.println("Curso:" + this.curso);
            }
}
