package src;


import src.br.com.dio.desafio.dominio.Bootcamp;
import src.br.com.dio.desafio.dominio.Curso;
import src.br.com.dio.desafio.dominio.Dev;
import src.br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("POO");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("POO");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Top");
        mentoria.setData(LocalDate.now());



        /*System.out.println(curso2);
        System.out.println(curso1);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Curso rop");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devRapha = new Dev();
        devRapha.setNome("Raphaela");
        devRapha.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Raphaela: " + devRapha.getConteudosIncritos());
        devRapha.progredir();
        System.out.println("Conteúdos concluídos Raphaela: " + devRapha.getConteudosConcluidos());
        System.out.println("XP: " + devRapha.calcularTotalXP());

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos João: " + devJoao.getConteudosIncritos());
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("Conteúdos concluídos João: " + devJoao.getConteudosConcluidos());
        System.out.println("XP: " + devJoao.calcularTotalXP());

          

    }
}
