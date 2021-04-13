//TRATAR OBJETOS OPCIONAIS, NULOS, QUE DAO NULLPOINTEREXCEPTION
package main.java;

import java.util.Optional;

public class ExemploOptionals {
    
    public static void main(String[] args){
    Optional<String> optionalString = Optional.of("Valor presente: ");
    
    //optionalString.ifPresentOrElse(System.out::println("Está presente"), () -> System.out.println("Não está presente"));
    
    Optional<String> optionalNull = Optional.ofNullable(null);
    Optional<String> emptyOptional = Optional.empty();
    Optional<String> optionalNullErro = Optional.of(null);
    }
}
