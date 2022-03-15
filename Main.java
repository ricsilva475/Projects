import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        Aluno user1 = new Aluno("Paulo",23, "Informatica");

        user1.name();
        user1.age();
        user1.curso();

        LinkedList cursos = new LinkedList();

        cursos.add("Informática");
        cursos.add("Gestao");

        System.out.print("Cursos:" + cursos);


    }
}
