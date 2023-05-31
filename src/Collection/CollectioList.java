package Collection;
import java.ultil.Scanner
public class CollectioList {
	
	 
	    public static void main(String[] args) {
	        ArrayList<String> cores = new ArrayList<String>();
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Digite 5 cores:");

	        for (int i = 0; i < 5; i++) {
	            String cor = scanner.nextLine();
	            cores.add(cor);
	        }

	        System.out.println("Listar todas as cores:");
	        for (String cor : cores) {
	            System.out.println(cor);
	        }

	        System.out.println("\nOrdenar as cores:");
	        Collections.sort(cores);
	        for (String cor : cores) {
	            System.out.println(cor);
	        }

	        scanner.close();
	    }
	
	

}
