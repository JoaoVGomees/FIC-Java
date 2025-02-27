import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		Scanner xaxa = new Scanner(System.in);
		
		System.err.println("Digite o 1º Nr: ");
		int a = xaxa.nextInt();
		
		System.err.println("Digite o 2º Nr: ");
		int b = xaxa.nextInt();
		
		double resultado = 0;
		try {
			resultado = calculera(a, b);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.err.println(resultado);

	}
	
	public static double calculera(int a, int b) throws Exception{
		return dividir(a, b);
	}
	
	public static double dividir(int a, int b) {
		if(b == 0)
			throw new ArithmeticException("Tem como dividir por 0 né seu jegue!");
		
		return a/b;
	}

}
