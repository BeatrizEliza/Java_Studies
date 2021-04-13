public class Lambda {
    public static void main(String[] args) throws Exception {
        

        // InterfaceFuncional nomeVariavel = parametro -> logica;
        Funcao gerarUmaSaida = valor -> "Olá " +valor; //lambda
        System.out.println(gerarUmaSaida.gerar("Isabola"));

        FuncaoVoid gerarUmaSaidaVoid = valor -> System.out.println(valor);
        gerarUmaSaidaVoid.gerar("Beatriz");

        FuncaoChaves gerarUmaSaidaChaves = valor -> {
            System.out.println(valor);
            System.out.println(valor + " Segunda vez");
        };
        gerarUmaSaidaChaves.gerar("Bia");
    }
}

@FunctionalInterface //se nao estiver de acordo com a interface funcional mostra erro
interface Funcao {
    String gerar(String valor); //interface funcional possue apenas um método abstrato
}

@FunctionalInterface
interface FuncaoVoid {
    void gerar(String valor);
}

@FunctionalInterface
interface FuncaoChaves {
    void gerar(String valor);
}

/*Quando a lambda tem só uma estrtura na lógica nao precisa colocar chaves*/
/*Se a função possui mais de uma lógica DEVE usar chave e explicitar o retorno se for diferente de void*/