/* Stream API
FUNCIONALIDADES DE MANIPULAR COLEÇÕES USANDO PARADIGMA FUNCIONAL COM PARALELISMO
FLUXO DE DADOS GRANDE*/
package main.java;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ExemploStreams {
    public static void main(String[] args){
        /*Funcionalidades
        Mapping = retorna uma coleção com mesmo tamanho da origem com os elementos alterados
        Filtering = returna uma coleção igual ou menor que a coleção origem, com os elementos intactos
        ForEach = determinada logica para cada elemento, retornando nada
        Peek = executa uma regra para cada elemento, retorna a propria coleção
        Counting = retorna um inteiro que representa a contagem de elementos
        Grouping = retorna uma coleção agrupada de acordo com a regra definida*/
        
        List<String> estudantes = new ArrayList<>();

        estudantes.add("Pedro");
        estudantes.add("Sarah");
        estudantes.add("Levi");
        estudantes.add("Beatriz");
        estudantes.add("Rafael");
        estudantes.add("Hadassa");

        System.out.println("Contagem: " + estudantes.stream().count()); //retorna um long que representa a contagem de elementos da String
        System.out.println("Maior número de letras: " + estudantes.stream().max(Comparator.comparingInt(String::length))); //max e min recebem um comparator e retorna o menor ou o menor elemento da coleção
        System.out.println("Com a letra R no nome: " + estudantes.stream().filter((estudante) -> 
                    estudante.toLowerCase().contains("r")).collect(Collectors.toList())); //filtrar 
        System.out.println("Retorna uma nova coleção com a quantidade de letras: " + estudantes.stream().map(estudante ->
                    estudante.concat(" - ").concat(String.valueOf(estudante.length()))).collect(Collectors.toList())); //criando nova coleção concatenando a quantidade de letras
        System.out.println("Exibe cada elemento e depois retorna a mesma coleção: " + estudantes.stream().peek(System.out::println).collect(Collectors.toList()));
        System.out.println("Retorna os 3 primeiros: " + estudantes.stream().limit(3).collect(Collectors.toList()));
        System.out.println("Retorna os elementos novamente: ");
        estudantes.stream().forEach(System.out::println);
        System.out.println("Todos tem W? " + estudantes.stream().allMatch((elemento) -> elemento.contains("W"))); 
        System.out.println("Algum tem S? " + estudantes.stream().anyMatch((elemento) -> elemento.contains("S"))); 
        System.out.println("Algum tem h? " + estudantes.stream().noneMatch((elemento) -> elemento.contains("h"))); //se ninguem tem  ai tem
        System.out.println("Acha o primeiro elemento: ");
        estudantes.stream().findFirst().ifPresent(System.out::println);

        System.out.println("Operação encadeada: ");
        System.out.println(estudantes.stream()
                .peek(System.out::println)
                .map(estudante ->
                    estudante.concat(" - ").concat(String.valueOf(estudante.length())))
                .peek(System.out::println)
                .filter((estudante) ->
                    estudante.toLowerCase().contains("r"))
                .collect(Collectors.toList())
        );

    }
}
