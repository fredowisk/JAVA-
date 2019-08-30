
package pacote;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author fredaum
 */
public class Numeros {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Double> lista = new ArrayList<>();
        boolean entra = true;
        while(entra){
            System.out.println("Digite um número: ");
            double num = sc.nextDouble();
            lista.add(num);
            System.out.println("Deseja continuar? [1 - Sim] [0 - Não]");
            int resposta = sc.nextInt();
            if(resposta == 0)
                entra = false;
            else if ( resposta == 1)
                System.out.println("Continuando...");
            else
                System.out.println("Opção inválida! Continuando...");
        }
        Collections.sort(lista);
        Iterator i = lista.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
    
}
