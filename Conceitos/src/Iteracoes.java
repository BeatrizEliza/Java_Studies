import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Iteracoes {
    public static void main(String[] args) throws Exception {
        String[] nomes = {"Bia", "Beatriz", "Java", "Palavras", "Cansei"};
        Integer[] numeros = {1, 2, 3, 4, 5};

        Stream.of(numeros)
            .forEach(System.out::println);

        String teste = Stream.of(nomes)
            .filter(nome -> nome.equals("Cansei"))
            .collect(Collectors.joining()); //String

        System.out.println(teste);

        Stream.of(numeros)
            .map(numero -> numero*2).forEach(System.out::println);

        //também da pra usar stream em list (nomeDaLista.stream())

    }
}
