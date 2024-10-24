import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("Curso feito para aprender o basico de java");
        curso1.setCargaHoraria(80);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("Curso feito para aprender o basico de js");
        curso2.setCargaHoraria(60);

        System.out.println(curso1);
        System.out.println(curso2);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Java");
        mentoria.setDescricao("Aprendendo java");
        mentoria.setDate(LocalDate.now());

        System.out.println(mentoria);
    }
}