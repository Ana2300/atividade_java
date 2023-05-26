package Atividade;
import java.util.Scanner;

public class Atividade3 {
	public static void main(String[]args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.print("digite o primeiro numero: ");
		float numero1 = Scanner.nextFloat();
		
		System.out.print("digite o primeiro numero: ");
		float numero2 = Scanner.nextFloat();
		
		System.out.print("digite o codigo da operação (1 a 4) ");
		int codigoOperacao = Scanner.nextInt();
		
		float resultado;
		
		switch (codigoOperacao) {
		case 1;
		resultado = numero1 + numero2;
		System.out.Println("Resultado:" + resultado);
		break;
		
		case 2: resultado = numero1 - numero2;
		System.out.println("resultado:" + resultado);
		break
		case 3:
			resultado = numero1 * numero2;
			System.out.println("resultado" + resultado);
			break;
		case 4 if (numero2 != 0) {
			resultado = numero1 / numero2;
			System.out.println("resultado:" + resultado);
			else {
				System.out.println("erro: divisão por zero!");
				break;
				default:
					System.out.println("operaão inválida!");
					
			}
		}
		}

		
		
		
		
		
		
	}

}
