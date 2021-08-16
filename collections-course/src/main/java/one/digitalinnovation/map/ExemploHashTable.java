package one.digitalinnovation.map;

import java.util.Hashtable;
import java.util.Map;

public class ExemploHashTable {
    public static void main(String[] args) {

        Hashtable<String, Integer> estudantes = new Hashtable<>();

        estudantes.put("Carlos", 21);
        estudantes.put("Marina", 33);
        estudantes.put("Rafaela", 18);
        estudantes.put("Pedro", 44);
        System.out.println(estudantes);

        estudantes.put("pedro", 55);
        System.out.println(estudantes);

        int idadeEstudante = estudantes.get("Marina");
        System.out.println(idadeEstudante);

        System.out.println(estudantes.size());

        for (Map.Entry<String, Integer> entry: estudantes.entrySet()) {
            System.out.println(entry.getKey() + " tem " + entry.getValue() + " Anos");
        }
    }
}
