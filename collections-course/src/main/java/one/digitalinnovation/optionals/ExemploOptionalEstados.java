package one.digitalinnovation.optionals;

import java.util.Optional;

public class ExemploOptionalEstados {

    public static void main(String[] args) {

        Optional<String> optionalString = Optional.of("Valor presente");
        System.out.println("Caso que o Valor opcional está presente");
        optionalString.ifPresentOrElse(System.out::println, () -> System.out.println("não está presente"));

        Optional<String> optionalNull = Optional.ofNullable(null);
        System.out.println("Valor opcional que não está presente ou seja nulo");
        optionalNull.ifPresentOrElse(System.out::println, () -> System.out.println("null = o valor não está presente"));

        Optional<String> emptyOptional = Optional.empty();
        System.out.println("Valor opcional que não está presente ou seja vazio");
        emptyOptional.ifPresentOrElse(System.out::println, () -> System.out.println("empty = não está presente"));

        Optional<String> optionalNullErro = Optional.of(null);
        System.out.println("Valor optional que lança o erro nullPointerExecption");
        optionalNullErro.ifPresentOrElse(System.out::println, () -> System.out.println("erro = não está presente"));


    }
}
