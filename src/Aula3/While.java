package Aula3;
import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String continua = "S";
		int numero1, numero2, resultado = 0;
		Scanner leia = new Scanner(System.in);

        while(continua.equals("s")) {
		System.out.println("digite o primeiro valor");
		numero1 = leia.nextInt();
		
		System.out.println("digite o segundo valor");
		numero1 = leia.nextInt();
		
		resultado = numero1 + numero2;
		
		System.out.println("resultado final:" + resultado);
		
		System.out.println("deseja continuar? (s/n");
		numero1 = leia.nextInt();
		
		
		
		
		
		
		
	}

}
