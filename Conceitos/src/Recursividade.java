/*Não utilizar se tiver muitos dados, fazer for ou while*/
import java.util.HashMap;
import java.util.Map;

public class Recursividade {
    public static void main(String[] args) throws Exception {
        System.out.println(recursividadeFatorial(5));
        //System.out.println(fatorialTA(100000000000000.0)); //stack overflow
        System.out.println(fatorialMemorization(5));
    }

    public static int recursividadeFatorial(int numero){
        if(numero == 1){
            return numero;
        }else{
            return numero * recursividadeFatorial((numero-1)); //aqui a recursividade
        }
    }

    /*Recursividade em cauda: nao há nenhuma linha de código após a chamada do método
        Lança estouro de pilha de execução*/
    public static double fatorialTA(double valor){
        return fatorialEmCauda(valor, 1);
    }

    public static double fatorialEmCauda(double valor, double numero){
        if (valor == 0){
            return numero;
        }
        return fatorialEmCauda(valor-1, numero+valor);
    }

    /*Recursividade com memorization*/
    static Map<Integer, Integer> MAPA_FATORIAL = new HashMap<>();

    public static Integer fatorialMemorization(Integer valor){
        if(valor == 1){
            return valor;
        } else{
            if(MAPA_FATORIAL.containsKey(valor)){
                return MAPA_FATORIAL.get(valor);
            } else{
                Integer resultado = valor * fatorialMemorization(valor-1);
                MAPA_FATORIAL.put(valor, resultado);
                return resultado;
            }
        }
    }
}

