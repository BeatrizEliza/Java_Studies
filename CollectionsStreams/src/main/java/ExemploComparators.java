//INTERFACES PARA ORDENAÇÃO DE OBJETOS COMPLEXOS (NAO É STRING NEM PRIMITIVO)
package main.java;

public class ExemploComparators implements Comparable<ExemploComparators>{
    public static void main(String[] args){
        /*COMPARATOR:
        
        public int compare(AlgoUm o, AlgoUm a){
            retorna igual o comparabale

            tem .sort no List que é do Comparator (ordena em ordem natural)
        }*/
        
    }

    @Override
    public int compareTo(ExemploComparators o) {
        // TODO Numero positivo se o objeto atual é maior, negativo se for menor e zero se for igual
        return 0;
    } 
}
