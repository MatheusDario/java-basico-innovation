//Crie um programa que leia 6 valores. Você poderá receber valores negativos e/ou positivos como entrada,
//devendo desconsiderar os valores nulos. Em seguida, apresente a quantidade de valores positivos digitados.
//Na entrada Você receberá seis valores, negativos e/ou positivos.
//Saida Exiba uma mensagem dizendo quantos valores positivos foram lidos assim como é exibido abaixo no exemplo de saída.
// Não esqueça da mensagem "valores positivos" ao final.
package one.digitalinnovation.desafios;
import java.io.IOException;
import java.util.Scanner;

public class Desafio3 {
    public static void main(String[] args) throws IOException {

        Scanner leitor = new Scanner(System.in);
       double i = 1;
       double x;
       int contador = 0;

       for(i=i; i<=6; i++) {
           x = leitor.nextDouble();
           if(x > 0) {
               contador++;
           }
       }
        System.out.println("" + contador + " valores positivos");

        leitor.close();
    }
}
