import java.util.function.UnaryOperator;

public class Aula1 { //paradigma imperativo na hora que passa o comando e executado linha por linha
    public static void main(String[] args) {
        /*int valor = 10;
        int resultado = valor * 3;
        System.out.println("O resultado e :: "+resultado);*/

        UnaryOperator<Integer>calcularValorVezesTres = valor -> valor*3; // paradigma funcional so utiliza recurso quando for executado
        System.out.println("O resultado e :: " + calcularValorVezesTres.apply(20));
    }
    interface Funcao {

    }
}


