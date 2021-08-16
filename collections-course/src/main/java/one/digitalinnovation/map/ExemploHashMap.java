package one.digitalinnovation.map;

import java.util.HashMap;
import java.util.Map;

public class ExemploHashMap {
    public static void main(String[] args) {

        Map<String, Integer> campeosMundialFifa = new HashMap<>(); // Chave e valor p/ usar o map

        campeosMundialFifa.put("Brasil", 5);
        campeosMundialFifa.put("Alemanha", 4);
        campeosMundialFifa.put("Itália", 4);
        campeosMundialFifa.put("Uruguai", 2);
        campeosMundialFifa.put("Argentina", 2);
        campeosMundialFifa.put("França", 2);
        campeosMundialFifa.put("Inglaterra", 1);
        campeosMundialFifa.put("Espanha", 1);
        System.out.println(campeosMundialFifa);

        campeosMundialFifa.put("Brasil", 6);
        System.out.println(campeosMundialFifa);

        System.out.println(campeosMundialFifa.get("Argentina"));

        System.out.println(campeosMundialFifa.containsKey("França"));

        System.out.println(campeosMundialFifa.containsValue(6));

        System.out.println(campeosMundialFifa.size());

        System.out.println(campeosMundialFifa.remove("França"));
        System.out.println(campeosMundialFifa);

        for (Map.Entry<String, Integer> entry: campeosMundialFifa.entrySet()) {
            System.out.println(entry.getKey() + "-->" + entry.getValue());
        }
    }
}
