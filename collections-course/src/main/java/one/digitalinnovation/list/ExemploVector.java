package one.digitalinnovation.list;

import java.util.List;
import java.util.Vector;

public class ExemploVector {
    public static void main(String[] args) {

        List<String> esportes = new Vector<>();

        esportes.add("Futebol");
        esportes.add("Basquete");
        esportes.add("Tenis de mesa");
        esportes.add("Handboll");

        esportes.set(2, "ping pong");
        System.out.println(esportes);

        esportes.remove(2);
        System.out.println(esportes);

        esportes.remove("Tenis de mesa");

        System.out.println(esportes.get(0));

        for(String esporte: esportes) {
            System.out.println(esporte);
        }
    }
}
