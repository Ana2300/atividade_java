package Aula3;
import Java.ultil.Scanner;
public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int numero;
    int somaPositivos = 0;

    do {
        System.out.print("Digite um número: ");
        numero = scanner.nextInt();

        if (numero > 0) {
            somaPositivos += numero;
        }
    } while (numero != 0);

    System.out.println("A soma dos números positivos é: " + somaPositivos);

    scanner.close();
}
}






