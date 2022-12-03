import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Prepare-se para a jornada");
        curso1.setDescricao("Onboarding");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Princípios do Desenvolvimento de Software");
        curso2.setDescricao("Cursos introdutórios, sobre os desafios, Set up GitHub");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Potência Tech powered by Ifood");
        bootcamp.setDescricao("Java Beginners");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devBruna = new Dev();
        devBruna.setNome("Bruna Quinto Marsiaj");
        devBruna.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Bruna:" + devBruna.getConteudosInscritos());
        devBruna.progredir();
        devBruna.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Bruna:" + devBruna.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Bruna:" + devBruna.getConteudosConcluidos());
        System.out.println("XP:" + devBruna.calcularTotalXp());

        System.out.println("-------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos João:" + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp());

    }

}
