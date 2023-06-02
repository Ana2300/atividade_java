package Aula7;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
        Queue<String> filaClientes = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            exibirMenu();
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner

            switch (opcao) {
                case 0:
                    System.out.println("Programa Finalizado!");
                    break;
                case 1:
                    adicionarCliente(filaClientes, scanner);
                    break;
                case 2:
                    listarClientes(filaClientes);
                    break;
                case 3:
                    chamarCliente(filaClientes);
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        } while (opcao != 0);
    }

    private static void exibirMenu() {
        System.out.println("\nMenu:");
        System.out.println("1: Adicionar um novo Cliente na fila");
        System.out.println("2: Listar todos os Clientes na fila");
        System.out.println("3: Chamar (retirar) uma pessoa da fila");
        System.out.println("0: Sair");
        System.out.print("Digite uma opção: ");
    }

    private static void adicionarCliente(Queue<String> filaClientes, Scanner scanner) {
        System.out.print("\nDigite o nome: ");
        String nomeCliente = scanner.nextLine();
        filaClientes.add(nomeCliente);
        System.out.println("\nFila:");
        for (String cliente : filaClientes) {
            System.out.println(cliente);
        }
        System.out.println("Cliente Adicionado!");
    }

    private static void listarClientes(Queue<String> filaClientes) {
        System.out.println("\nLista de Clientes na Fila:");
        for (String cliente : filaClientes) {
            System.out.println(cliente);
        }
    }

    private static void chamarCliente(Queue<String> filaClientes) {
        if (filaClientes.isEmpty()) {
            System.out.println("\nA Fila está vazia!");
        } else {
            String clienteChamado = filaClientes.poll();
            System.out.println("\nFila:");
            for (String cliente : filaClientes) {
                System.out.println(cliente);
            }
            System.out.println("O Cliente " + clienteChamado + " foi Chamado!");
        }
    }
}

	
}
