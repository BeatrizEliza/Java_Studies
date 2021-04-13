import java.util.function.Function;

public class Functions {
    public static void main(String[] args) throws Exception {

        Function<String, String> retornarNomeAoContrario = texto -> new StringBuilder(texto).reverse().toString();
        System.out.println(retornarNomeAoContrario.apply("Beatriz"));

        Function<String, Integer> converterStringParaInteiro = string -> Integer.valueOf(string) * 2;
        System.out.println(converterStringParaInteiro.apply("10"));
    }
}
