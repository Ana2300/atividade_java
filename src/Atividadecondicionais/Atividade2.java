package Atividadecondicionais;
import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		String nome;
		int idade;
		Boolean primeiraDoacao;
		
		System.out.println("Digite seus dadosa seguir para verificarse esta apto para doar sangue:");
		System.out.print("digite o nome do doador");
		nome = leia.next();
		
		System.out.println("digite a idade do doador");
		idade = leia.nextInt();
		
		System.out.println("Primeira doação de sangue?");
		primeiraDoacao = leia.nextBoolean();
		
		if(idade < 18) {
			System.out.println();
			else if (idade > 18 && idade < 60) {
				System.out.println("nome + está apto para doar sangue!");
				else if (idade > 60 && idade < 69) {
					if(primeiraDoacao == true) {
						System.out.println("nome + não esta apto para doar sangue");
						else if (primeiraDoacao == false) {
							System.out.println("nome + esta apto para doar sangue");
							else if (idade < 69) {
								System.out.println("checar com o medico se a doacao é possivel");
								else {
									System.out.println("algum erro ocorreu, favor tentar novamente");
								}
							}
						}
					}
				}
			}
		}
		

	}

}
