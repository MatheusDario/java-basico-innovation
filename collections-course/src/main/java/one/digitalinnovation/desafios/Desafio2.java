//Leia um valor inteiro X. Em seguida apresente os 6 valores ímpares consecutivos a partir de X,
// um valor por linha, inclusive o X se for o caso.
//A entrada será um valor inteiro positivo.
//A saída será uma sequência de seis números ímpare
package one.digitalinnovation.desafios;
import java.util.Scanner;

public class Desafio2 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int x = leitor.nextInt();
        int cont = 0;

//continue a solucao de accord com o solicitado no enunciado

        while (cont < 6 ) {
            if ( x % 2  == 1) {
                System.out.println(x);
                cont++   ;
            }
            x++;
        }
    }

}
