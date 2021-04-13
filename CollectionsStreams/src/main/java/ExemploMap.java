/*ENTRADA DE CHAVE E VALOR
PERMITE VALORES REPETIDOS MAS NAO REPETIÇÃO DE CHAVE
PERMITE ADIÇÃO, BUSCA. ATUALIZAÇÃO, REMOÇÃO E NAVEGAÇÃO
PODE SER ORDENADO */

package main.java;

import java.security.Key;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.Hashtable; //metodos que podem ser acessados de mais de uma thread
import java.util.Map;

public class ExemploMap {

    public static void main(String[] args){
        Map<String, Integer> posicao = new HashMap<>();
        posicao.put("Beatriz", 1);
        posicao.put("Bianca", 2);
        posicao.put("Bernardo", 4);
        posicao.put("Bento", 3);
        System.out.println(posicao);
        posicao.get("Bento");
        posicao.containsKey("Bianca");
        posicao.containsValue(1);
        posicao.size();
        
        for(Map.Entry<String, Integer> entry : posicao.entrySet()){
            System.out.println(entry.getKey() + entry.getValue());
        }
        for(String key : posicao.keySet()){
            //faz alguma coisa aqui
        }
    }     
    
}
