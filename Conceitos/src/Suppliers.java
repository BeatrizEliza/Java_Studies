import java.util.function.Supplier;

public class Suppliers {
    public static void main(String[] args) throws Exception {
        //nao recebem parametro e retornam algo, supridores
        Supplier<Pessoa> novaPessoa = () -> new Pessoa();
        System.out.println(novaPessoa.get());
    }
}

class Pessoa {
    private String nome;
    private Integer idade;

    public Pessoa(){
        nome = "Beatriz";
        idade = 18;
    }

    @Override
    public String toString(){
        return String.format("nome: %s, idade: %d", nome, idade);
    }
}
