import java.util.function.Consumer;

public class ConsumerJavaUtil {
    public static void main(String[] args) throws Exception {

        Consumer<String> imprimirUmaFrase = System.out::println;
        imprimirUmaFrase.accept("Recebendo parâmetro escondido");

        //lambda
        Consumer<String> imprimirOutraFrase = frase -> System.out.println(frase);
        imprimirOutraFrase.accept("Hello World");
    }
}
