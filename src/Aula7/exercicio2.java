package Aula7;
import java.util.Scanner;
import java.util.Stack;

public class exercicio2 {
	 public static void main(String[] args) {
	        Stack<String> pilhaDeLivros = new Stack<>();
	        Scanner scanner = new Scanner(System.in);
	        int opcao = -1;

	        while (opcao != 0) {
	            exibirMenu();
	            opcao = scanner.nextInt();
	            scanner.nextLine(); // Limpar o buffer do scanner

	            switch (opcao) {
	                case 1:
	                    System.out.println("\nDigite o nome do livro:");
	                    String nomeLivro = scanner.nextLine();
	                    pilhaDeLivros.push(nomeLivro);
	                    System.out.println("\nLivro adicionado!\n");
	                    break;
	                case 2:
	                    System.out.println("\nLista de Livros na Pilha:");
	                    for (String livro : pilhaDeLivros) {
	                        System.out.println(livro);
	                    }
	                    System.out.println();
	                    break;
	                case 3:
	                    if (pilhaDeLivros.isEmpty()) {
	                        System.out.println("\nA Pilha está vazia!\n");
	                    } else {
	                        String livroRetirado = pilhaDeLivros.pop();
	                        System.out.println("\nUm Livro foi retirado da pilha!\n");
	                    }
	                    break;
	                case 0:
	                    System.out.println("\nPrograma Finalizado!\n");
	                    break;
	                default:
	                    System.out.println("\nOpção inválida! Digite novamente.\n");
	            }
	        }
	    }

	    private static void exibirMenu() {
	        System.out.println("Menu:");
	        System.out.println("1: Adicionar um novo livro na pilha");
	        System.out.println("2: Listar todos os livros da pilha");
	        System.out.println("3: Retirar um livro da pilha");
	        System.out.println("0: O programa deve ser finalizado.");
	        System.out.print("\nDigite uma opção: ");
	    }
	}
	


	