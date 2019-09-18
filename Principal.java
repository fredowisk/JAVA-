package pacote;

import java.util.Collections;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author fredaum
 */
public class Principal {

    public static void main(String[] args) {

        Naipes n[] = Naipes.values(); // Cria um array n do enum NAIPES.
        Cartas c[] = Cartas.values(); // Cria um array c do enum CARTAS.
        List naipe = Arrays.asList(n); // Transforma n em uma LIST.
        List carta = Arrays.asList(c); // Transforma c em uma LIST.
        
        int p1 = 0, p2; // Variaveis para trabalhar com posições.
        // p1 para Naipes e p2 para cartas.
        for (p2 = 0; p2 < 13; p2++) { // For para percorrer as LISTS.
            if (p2 == 0) { // Verificando se p2 é igual a 0 para imprimir o nome do naipe.
                System.out.println("\n    - Naipe de: " + naipe.get(p1) + " -\n");
            }
            // imprimindo cada carta e seu respectivo naipe.
            System.out.println(carta.get(p2) + " de " + naipe.get(p1));
            //If para reiniciar o loop e mudar de naipe.
            if (p2 == 12) {
                p1++;
                p2 = -1;
                //If para verificar se todos os naipes ja foram utilizados.
                if (p1 == 4) {
                    p1 = 0;
                    break; // Quebrando o for.
                }
            }
        }
        
        Collections.shuffle(carta); // Embaralhando as cartas...
        //Recriando o for novamente, para mostrar as cartas embaralhadas.
        System.out.println("\n - As cartas foram EMBARALHADAS! - ");
        
            for (p2 = 0; p2 < 13; p2++) { // For para percorrer as LISTS.
            if (p2 == 0) { // Verificando se p2 é igual a 0 para imprimir o nome do naipe.
                System.out.println("\n    - Naipe de: " + naipe.get(p1) + " -\n");
            }
            // imprimindo cada carta e seu respectivo naipe.
            System.out.println(carta.get(p2) + " de " + naipe.get(p1));
            //If para reiniciar o loop e mudar de naipe.
            if (p2 == 12) {
                p1++;
                p2 = -1;
                //If para verificar se todos os naipes ja foram utilizados.
                if (p1 == 4) {
                    break; //Fim do programa.
                }
            }
        }
    }

}
