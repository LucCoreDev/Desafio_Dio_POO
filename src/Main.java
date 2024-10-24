import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
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

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Java");
        mentoria.setDescricao("Aprendendo java");
        mentoria.setDate(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setDescricao("Aprenda tudo sobre java");
        bootcamp.setNome("Bootcamp Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devVicenete = new Dev();
        devVicenete.setNome("Vicente");
        devVicenete.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos " + devVicenete.getContudosInscritos());
        devVicenete.progedir();
        System.out.println("Conteudos Concluidos "+ devVicenete.getConteudosConcluidos());
    }
}