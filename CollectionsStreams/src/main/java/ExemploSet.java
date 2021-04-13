/*NÃO GARANTE A ORDEM DE INSERÇÃO E NEM MUDA A ORDENAÇÃO (DÍFICIL) 
NÃO PERMITE ITENS REPETIDOS
ADCIONA E REMOVE MAS NAO BUSCA OU ATUALIZA*/

//HashSet usar quando não é necessario manter uma ordem (PERFORMATICO)
//LinkedHashSet quando é necessario manter a ordem de inserção
//TreeSet quando é necessario alterar a ordem atravez de comparators

package main.java;

import java.util.HashSet;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class ExemploSet {
    public static void main(String[] args){

        Set<Double> notas = new HashSet<>();
        notas.add(5.6);
        notas.add(4.7);
        notas.add(1.2);
        notas.add(3.4);
        System.out.println(notas);
        
        LinkedHashSet<Integer> numeros = new LinkedHashSet<>();
        numeros.add(1);
        numeros.add(3);
        numeros.add(2);
        numeros.add(0);
        System.out.println(numeros);

        TreeSet<String> treeCidades = new TreeSet<>(); //funciona como árvore
        treeCidades.add("Araraquara");
        treeCidades.add("São Paulo");
        treeCidades.add("Bahia");
        treeCidades.add("Jaú");
        System.out.println(treeCidades.first());
        System.out.println(treeCidades.last());
        System.out.println(treeCidades.lower("Jaú")); //qual está embaixo
        System.out.println(treeCidades.higher("Jaú")); //qual está em cima
        System.out.println(treeCidades.pollFirst()); 
        
    }

}
