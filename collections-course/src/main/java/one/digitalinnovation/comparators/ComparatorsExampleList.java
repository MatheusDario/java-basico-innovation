package one.digitalinnovation.comparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorsExampleList {
    public static void main(String[] args) {

        List<Estudante> estudantes = new ArrayList<>();

        estudantes.add(new Estudante("Pedro", 19));
        estudantes.add(new Estudante("Carlos", 23));
        estudantes.add(new Estudante("Marina", 21));
        estudantes.add(new Estudante("Joao", 18));
        estudantes.add(new Estudante("Thiago", 20));
        estudantes.add(new Estudante("George", 22));
        estudantes.add(new Estudante("Larissa", 21));
        System.out.println("-- Ordem de inserçâo --");
        System.out.println(estudantes);

        estudantes.sort((first, second) -> first.getIdade() - second.getIdade()); //Ordenando com expressão lambda
        System.out.println("-- Ordem natural dos números - idade --");
        System.out.println(estudantes);

        estudantes.sort((first, second) -> second.getIdade() - first.getIdade());
        System.out.println("-- Ordem reversa dos números - idade --");
        System.out.println(estudantes);

        estudantes.sort(Comparator.comparingInt(Estudante::getIdade));
        System.out.println("-- Ordem natural dos números - idade (method reference) --");
        System.out.println(estudantes);

        estudantes.sort(Comparator.comparingInt(Estudante::getIdade).reversed());
        System.out.println("-- Ordem reversa dos números - idade (method reference) --");
        System.out.println(estudantes);

        Collections.sort(estudantes);
        System.out.println("-- Ordem natural dos números - idade (interface Compareble) --");
        System.out.println(estudantes);

        Collections.sort(estudantes, new EstudanteOrdemReversaComparar());
        System.out.println("-- Ordem reversa dos números - idade (interface Comparator) --");
        System.out.println(estudantes);



    }


}
