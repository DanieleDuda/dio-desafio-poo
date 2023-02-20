import java.time.LocalDate;

import br.com.dio.dominio.Curso;
import br.com.dio.dominio.Dev;
import br.com.dio.dominio.Mentoria;
import br.com.dio.dominio.Bootcamp;
import br.com.dio.dominio.Conteudo;

public class Main {
    public static void main(String[] args) throws Exception {
        Curso cursoA = new Curso();
        cursoA.setTitulo("Curso Java");
        cursoA.setDescricao("Descrição curso java");
        cursoA.setCargaHoraria(8);

        Curso cursoB = new Curso();
        cursoB.setTitulo("Curso JS");
        cursoB.setDescricao("Descricao curso JS");
        cursoB.setCargaHoraria(10);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("Descricao mentoria de java");
        mentoria1.setData(LocalDate.now());

        Conteudo cursoC = new Curso();
        cursoC.setTitulo("Curso C - Polimorfismo");
        cursoC.setDescricao("Instanciou um objeto do tipo Conteudo usando a classe Curso");

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição bootcamp java developer");
        bootcamp.getConteudos().add(cursoA);
        bootcamp.getConteudos().add(cursoB);
        bootcamp.getConteudos().add(cursoC);
        bootcamp.getConteudos().add(mentoria1);

        Dev devDaniele = new Dev();
        devDaniele.setNome("Daniele");
        devDaniele.inscreverBootcamp(bootcamp);
        System.out.println("Dev Daniele - Conteudos Inscritos: " + devDaniele.getConteudosInscritos());
        devDaniele.progredir();
        System.out.println("Dev Daniele - Conteudos Inscritos: " + devDaniele.getConteudosInscritos());
        System.out.println("Dev Daniele - Conteudos Concluidos: " + devDaniele.getConteudosConcluidos());
        devDaniele.progredir();
        System.out.println("Dev Daniele - Conteudos Inscritos: " + devDaniele.getConteudosInscritos());
        System.out.println("Dev Daniele - Conteudos Concluidos: " + devDaniele.getConteudosConcluidos());
        System.out.println("XP: " + devDaniele.calcularTotalXp());
        System.out.println("*-----*");
        
        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Dev Joao - Conteudos Inscritos: " + devJoao.getConteudosInscritos());
        devJoao.progredir();
        System.out.println("Dev Joao - Conteudos Inscritos: " + devJoao.getConteudosInscritos());
        System.out.println("Dev Joao - Conteudos Concluidos: " + devJoao.getConteudosConcluidos());
        System.out.println("XP: " + devJoao.calcularTotalXp());
    }

}
