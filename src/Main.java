import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição: Curso de java ");
        curso1.setCargaHoraria(12);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descrição: Curso de javascript ");
        curso2.setCargaHoraria(20);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("Mentor fala sobre Java");
        mentoria1.setData(LocalDate.of(2022,12,3));


        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);
    }
}