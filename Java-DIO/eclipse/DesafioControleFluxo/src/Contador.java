import java.util.Iterator;
import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
		
		Scanner xaxa = new Scanner(System.in);
		int n1, n2;
		
		System.out.println("Digite o primeiro número: ");
		n1 = xaxa.nextInt();
		xaxa.nextLine();

		System.out.println("Digite o segundo número: ");
		n2 = xaxa.nextInt();
		xaxa.nextLine();
		
		try {
			contar(n1, n2);
		} catch (ParametrosInvalidosException e) {
			System.out.println("O segundo parametro deve ser maior que o primeiro");
		}
		
	}

	static void contar(int n1, int n2) throws ParametrosInvalidosException {
		if (n1 > n2) {
			throw new ParametrosInvalidosException();
		} else {
			int contagem = n2 - n1;
			
			for (int i = 1; i <= contagem; i++) {
				System.out.println("Imprimindo o número " + i);
			}
		}
	}
	
}
