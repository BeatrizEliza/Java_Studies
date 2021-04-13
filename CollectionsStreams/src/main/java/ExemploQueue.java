/*REPRESENTA A ESTRUTURA DE DADOS FILA (FIFO)*/
package main.java;

import java.util.LinkedList;
import java.util.Queue;

public class ExemploQueue {
    public static void main(String[] args){

        Queue<String> filaBanco = new LinkedList<>();

        filaBanco.add("Eduarda");
        filaBanco.add("Juliana");
        filaBanco.add("Pamela");
        filaBanco.add("Ana");
        filaBanco.add("Carolina");

        System.out.println(filaBanco);

        filaBanco.add("Estephany");

        filaBanco.poll(); /*remove da fila*/
        
        System.out.println(filaBanco.peek()); /*retorna e nao tira da fila*/

        System.out.println(filaBanco);

        for (String cliente : filaBanco) {
            System.out.println(cliente);
        }
        
        filaBanco.clear();

        System.out.println(filaBanco.element()); /*retorna o elemento*/ 

    }
}
