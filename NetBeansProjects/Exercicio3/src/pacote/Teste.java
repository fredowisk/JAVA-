package pacote;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author fredaum
 */
public class Teste {

    public static void main(String[] args) {
        //Declarando variaveis.
        ArrayList<Funcionarios> lista = new ArrayList<>();
        Funcionarios func = new Funcionarios();
        Scanner sc = new Scanner(System.in);
        //Operacoes.
        int opcao = 1;
        while (opcao != 0) {
            opcao = func.obterMenu(sc);

            switch (opcao) {
                case 1:
                    func.adicionarContato(sc, lista);
                    break;
                case 2:
                    func.excluirFunc(sc, lista);
                    break;
                case 3:
                    func.imprimirVetor(lista);
                    break;
                case 0:
                    opcao = 0;
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        }
        System.out.println("Finalizando...");
    }
}
