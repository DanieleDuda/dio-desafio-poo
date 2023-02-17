import java.time.LocalDate;

import br.com.dio.dominio.Curso;
import br.com.dio.dominio.Mentoria;

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

        System.out.println(cursoA);
        System.out.println(cursoB);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("Descricao mentoria de java");
        mentoria1.setData(LocalDate.now());

        System.out.println(mentoria1);
    }

}
