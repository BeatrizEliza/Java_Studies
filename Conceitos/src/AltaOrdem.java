public class AltaOrdem {
    public static void main(String[] args) throws Exception {
        Calculo soma = (a, b) -> a+b;
        Calculo subtrair = (a, b) -> a-b;
        Calculo dividir = (a, b) -> a/b;
        Calculo multiplica = (a, b) -> a*b;
        System.out.println(executarOperacao(soma, 10, 2));
        System.out.println(executarOperacao(subtrair, 10, 2));
        System.out.println(executarOperacao(dividir, 10, 2));
        System.out.println(executarOperacao(multiplica, 10, 2));
    } 

    public static int executarOperacao(Calculo soma, int a, int b){return soma.somar(a, b);}
    //função de alta ordem: recebe outra função como parâmetro ou retorna uma função (o método é a função)
}

@FunctionalInterface
interface Calculo {public int somar(int a, int b);}