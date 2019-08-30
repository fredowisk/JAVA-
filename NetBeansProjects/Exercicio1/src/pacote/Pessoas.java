
package pacote;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author fredaum
 */
public class Pessoas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> lista = new ArrayList<>();
        Iterator i = lista.iterator();
        double mediaIdade = 0;
        int resposta = 0;
        for (int f = 1; f<=10;f++){
            System.out.println("Informe a idade de 10 pessoas: ");
            int idade = sc.nextInt();
            lista.add(idade);
            mediaIdade += idade;
            if (f<3){
            System.out.println("Deseja continuar? [1 - Sim] [0 - Não]");
                resposta = sc.nextInt();
            }
            if (resposta ==0){
                mediaIdade /= lista.size();
                f = 11;
            }
            else if (resposta == 1)
                System.out.println("Continuando...");
            else
                System.out.println("Resposta errada!");
        }
        
        System.out.println("Media das 10 idades: " + mediaIdade + "%");
    }
    
}
