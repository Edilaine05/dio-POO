import br.com.dio.desafio.dominio.*;

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
        mentoria1.setDescricao("O mentor fala sobre Java");
        mentoria1.setData(LocalDate.of(2022,12,3));


/*        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescircao("Bootcamp feito para aprender Java.");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev dev1 = new Dev();
        dev1.setNome("Edilaine Martins");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos de " + dev1.getNome() +" :"+ '\n'+ dev1.getConteudosInscitos());
        System.out.println("______________________________________________");
        dev1.progredir();
        dev1.progredir();
        System.out.println("Conteudos Inscritos de " + dev1.getNome() +" :"+ '\n'+ dev1.getConteudosInscitos());
        System.out.println("Conteudos Concluidos de " + dev1.getNome() +" :"+ '\n'+ dev1.getConteudosConcluidos());
        System.out.println("Xp: "+dev1.calcularTotalXp());


        System.out.println("-*-*-*-*-*-*-*-*-*-*--*-*-*-*-*-*-*-*-*-*-");

        Dev dev2 = new Dev();
        dev2.setNome("Emerson Librelato");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos de " + dev2.getNome() +" :"+ '\n' + dev2.getConteudosInscitos());
        System.out.println("______________________________________________");
        dev2.progredir();
        System.out.println("Conteudos Inscritos de " + dev2.getNome() +" :"+ '\n' + dev2.getConteudosInscitos());
        System.out.println("Conteudos Concluidos de " + dev2.getNome() +" :"+ '\n' + dev2.getConteudosConcluidos());
        System.out.println("Xp: "+dev2.calcularTotalXp());


    }
}