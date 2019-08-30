package pacote;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author fredaum
 */
public class Funcionarios {

    private String nomeFunc;

    public Funcionarios(String nomeFunc) {
        this.nomeFunc = nomeFunc;
    }

   public Funcionarios(){}
    /**
     * @return the nomeFunc
     */
    public String getNomeFunc() {
        return nomeFunc;
    }

    /**
     * @param nomeFunc the nomeFunc to set
     */
    public void setNomeFunc(String nomeFunc) {
        this.nomeFunc = nomeFunc;
    }

    public String leInformacao(String msg, Scanner sc) {
        System.out.println(msg);
        String entrada = sc.nextLine();

        return entrada;
    }

    public void adicionarContato(Scanner sc, ArrayList<Funcionarios> lista) {
        int pos = 0;
        System.out.println("Criando um contato. Entre com as informações: ");
        String nomeFunc = leInformacao("Entre com o nome: ", sc);
        Funcionarios func = new Funcionarios(nomeFunc);
        lista.add(func);
        System.out.println("Contato adicionado com sucesso!");
        System.out.println(func);
    }

    public void excluirFunc(Scanner sc, ArrayList<Funcionarios> lista) {
        int pos = leInformacaoInt("Entre com a posição a ser removida: ", sc);
        try {
            lista.remove(pos);
            System.out.println("Contato excluido!");
        } catch (Exception e) {
            System.out.println("Posição inválida! Tente novamente.");
        }
    }

    public int leInformacaoInt(String msg, Scanner sc) {
        boolean entradaValida = true;
        int num = 0;
        String entrada;
        while (entradaValida) {
            try {
                System.out.println(msg);
                entrada = sc.nextLine();
                entradaValida = false;
                num = Integer.parseInt(entrada);
            } catch (Exception e) {
                System.out.println("Entrada inválida! Tente novamente.");
            }
        }

        return num;
    }

    public void imprimirVetor(ArrayList<Funcionarios> lista) {
        System.out.println(lista);
        System.out.println("Total de funcionários: " + lista.size());
    }

    public int obterMenu(Scanner sc) {
        boolean entradaValida = true;
        int opcao = 0;
        String entrada;
        while (entradaValida) {
            System.out.println("GERENCIADOR DE FUNCIONÁRIOS:");
            System.out.println("[1 - Inserir novo funcionário]");
            System.out.println("[2 - Remove funcionário]");
            System.out.println("[3 - Listar funcionário]");
            System.out.println("[0 - Sair]");
            try {
                entrada = sc.nextLine();
                opcao = Integer.parseInt(entrada);
                if (opcao >= 0 && opcao <= 4) {
                    entradaValida = false;
                } else {
                    System.out.println("Opção inválida! Tente novamente.\n\n");
                }
            } catch (Exception e) {
                System.out.println("Opção inválida! Tente novamente.\n\n");
            }
        }
        return opcao;
    }
    @Override
    public String toString(){
        return "Contato [Nome = " + nomeFunc + "]";
    }
}
