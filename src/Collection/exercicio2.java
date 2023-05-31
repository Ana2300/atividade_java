package Collection;
import java.ultil.Scanner;
public class exercicio2 {

	
	public static void main(String[]args) {
		Set<Integer> set = new HashSet<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 10 valores inteiros não repetidos:");

        // Solicita ao usuário que digite 10 valores inteiros não repetidos
        for (int i = 0; i < 10; i++) {
            int value = scanner.nextInt();

            // Verifica se o valor já foi inserido anteriormente
            if (set.contains(value)) {
                System.out.println("Valor repetido. Digite novamente:");
                i--; // Decrementa o contador para repetir a iteração
                continue;
            }

            set.add(value);
        }

        System.out.println("\nListar dados do Set:");
        printSet(set);

        scanner.close();
    }

    // Método para imprimir os elementos do Set usando a classe Iterator
    public static void printSet(Set<Integer> set) {
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

	}
}
