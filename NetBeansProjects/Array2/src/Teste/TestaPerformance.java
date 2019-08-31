
package Teste;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 *
 * @author fredaum
 */
public class TestaPerformance {

    public static void main(String[] args) {
        System.out.println("Iniciando...");
        Collection<Integer> teste = new HashSet<>();
        long inicio = System.currentTimeMillis();
        
        int total = 30000;
                    long teste1 = System.currentTimeMillis();

        for(int i = 0; i<total; i++){
            teste.add(i);
        }
                    long teste2 = System.currentTimeMillis();
                    long resultado = teste2 - teste1;
                    System.out.println(resultado);

        long teste3 = System.currentTimeMillis();
        for(int i = 0; i<total; i++){
            teste.contains(i);
        }
        long teste4 = System.currentTimeMillis();
                    long resultado2 = teste4 - teste3;
                    System.out.println(resultado2);
        
        long fim = System.currentTimeMillis();
        long tempo = fim - inicio;
        System.out.println("Tempo gasto: " + tempo);
        
    }
    
}
