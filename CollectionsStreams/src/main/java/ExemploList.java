/*REPRESENTA A ESTRUTURA DE DADOS LISTA*/
package main.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {

    public static void main(String[] args){

        List<String> nomes = new ArrayList<>();

        nomes.add("Beatriz");
        nomes.add("Rafael");
        nomes.add("Gisele");
        nomes.add("Paulo");
        nomes.add("Isabelle");

        System.out.println(nomes);

        nomes.set(3, "Vilma");
        nomes.remove(4);
        nomes.remove("Vilma");
        
        System.out.println(nomes);

        for (String nome : nomes) {
            System.out.println(nome);
        }

        Collections.sort(nomes);/*ORDENA*/

        Iterator<String> iterator = nomes.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        };


    }

}