package exercicio1;
import java.util.Scanner;

public class VariaveisConstantes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float nota1, nota2, nota3, nota4,  media;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("digite a primeira nota: ");
		nota1 = leia.nextFloat();
		
		System.out.println("digite a segunda nota: ");
		nota2 = leia.nextFloat();
		
		System.out.println("digite a terceira nota: ");
		nota3 = leia.nextFloat();
		
		System.out.println("digite a terceira nota: ");
		nota3 = leia.nextFloat();
		
		System.out.println("digite a quarta nota: ");
		nota4 = leia.nextFloat();
		
        media = (nota1 + nota2 + nota3 + nota4)/4;
		


        System.out.print("Sua média é: ");
        System.out.println(media);
				

	}

}
