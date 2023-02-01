import br.com.desafio.dominio.Bootcamp;
import br.com.desafio.dominio.Curso;
import br.com.desafio.dominio.Developer;
import br.com.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        Curso curso2 = new Curso();


        curso1.setTitulo("Curso Java");
        curso1.setDescricao("descrição curso Java");
        curso1.setCargaHoraria(8);

        curso2.setTitulo("Curso C#");
        curso2.setDescricao("descrição curso C#");
        curso2.setCargaHoraria(8);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Titulo mentoria java");
        mentoria1.setDescricao("Descrição mentoria Java");
        mentoria1.setData(LocalDate.now());

        Bootcamp bc1 = new Bootcamp();
        bc1.setNome("Bootcamp Java Developer");
        bc1.setDescricao("Descrição do bootcamp Java Developer");
        bc1.getConteudos().add(curso1);
        bc1.getConteudos().add(curso2);
        bc1.getConteudos().add(mentoria1);

        Developer dev1 = new Developer();
        dev1.setNome("Jaime");
        dev1.inscreverBootcamp(bc1);
        System.out.println("Dev 1 " + dev1.getNome() + " Conteudos inscritos " +
                dev1.getConteudosInscritos());
        dev1.progredir();
        dev1.progredir();

        System.out.println("Dev 1 " + dev1.getNome() + " Conteudos concluidos" +
                dev1.getConteudosConcluidos());
        System.out.println(" XP DEV 1:" + dev1.calcularTotalXp());
        System.out.println("----------");

        Developer dev2 = new Developer();
        dev2.setNome("camila");
        dev2.inscreverBootcamp(bc1);
        System.out.println("Dev 2 " + dev2.getNome() + " Conteudos inscritos " +
                dev2.getConteudosInscritos());
        dev2.progredir();
        System.out.println("Dev 2 " + dev2.getNome() + " Conteudos concluidos " +
                dev2.getConteudosConcluidos());
        System.out.println(" XP DEV 2: " + dev2.calcularTotalXp());


    }
}