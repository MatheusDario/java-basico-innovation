package one.digitalinnovation.queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ExemploLinkedList {
    public static void main(String[] args) {
        Queue<String> filaBanco = new LinkedList<>();
        filaBanco.add("Juliana");
        filaBanco.add("Pedro");
        filaBanco.add("Carlos");
        filaBanco.add("Larissa");
        filaBanco.add("João");
        System.out.println(filaBanco);

        String clienteASerAtendido = filaBanco.poll(); //remove o primeiro elemento da fila
        System.out.println(clienteASerAtendido);
        System.out.println(filaBanco);

        String primeiroCliente = filaBanco.peek(); //mostra o primeiro elemento da fila sem remover
        System.out.println(primeiroCliente);
        System.out.println(filaBanco);

        String primeiroClienteOuErro = filaBanco.element();
        System.out.println(primeiroClienteOuErro);
        System.out.println(filaBanco);

        filaBanco.add("Daniel");
        System.out.println(filaBanco);

        int tamanhoDaFila = filaBanco.size();
        System.out.println(tamanhoDaFila);

        boolean filaVazia = filaBanco.isEmpty();
        System.out.println(filaVazia);

        boolean estaNaFila = filaBanco.contains("Carlos");
        System.out.println(estaNaFila);

        for(String client: filaBanco) {
            System.out.println(client);
        }

        Iterator<String> iteratorFilaBanco = filaBanco.iterator();
        while(iteratorFilaBanco.hasNext()) {
            System.out.println("-->" + iteratorFilaBanco.next());
        }



    }
}
