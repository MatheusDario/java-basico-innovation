package one.digitalinnovation.set;

import java.util.TreeSet;

public class ExerciciosTreeSet {
    public static void main(String[] args) {
        TreeSet<Integer>sequenciaNumerica = new TreeSet<>();

        sequenciaNumerica.add(3);
        sequenciaNumerica.add(88);
        sequenciaNumerica.add(20);
        sequenciaNumerica.add(44);
        sequenciaNumerica.add(3);
        System.out.println(sequenciaNumerica);

        sequenciaNumerica.remove(3);
        System.out.println(sequenciaNumerica);

        sequenciaNumerica.add(23);
        System.out.println(sequenciaNumerica);

        System.out.println(sequenciaNumerica.size());
        System.out.println(sequenciaNumerica.isEmpty());
    }
}
