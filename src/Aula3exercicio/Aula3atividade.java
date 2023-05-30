package Aula3exercicio;
import Java.ultil.scanner;

public class Aula3atividade {

}
public static void main(String[] args)

int totalPares = 0;
int totalImpares = 0;

Scanner scanner = new Scanner(System.in);

for (int i = 1; i <= 10; i++) {
    System.out.print("Digite o " + i + "º número: ");
    int numero = scanner.nextInt();

    if (numero % 2 == 0) {
        totalPares++;
    } else {
        totalImpares++;
    }
}

System.out.println("\nTotal de números pares: " + totalPares);
System.out.println("Total de números ímpares: " + totalImpares);
}
}







