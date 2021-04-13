import java.util.function.Predicate;

public class Predicates {
    public static void main(String[] args) throws Exception {
        
        //predicado recebe um parametro e retorna um booleano
        Predicate<String> retornaUmBool = valor -> valor.isEmpty();
        System.out.println(retornaUmBool.test(""));
        System.out.println(retornaUmBool.test("Aqui ta cheio"));
    }
}
