import java.util.Scanner;

public class MinhaClasse {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int[] vetor = new int[5];
		int soma = 0;
		int maior = 0;
		int menor = Integer.MAX_VALUE;

		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Digite um número: ");
			vetor[i] = teclado.nextInt();

			soma += vetor[i];

			if (vetor[i] > maior) {
				maior = vetor[i];
			}
			
			if (vetor[i] < menor) {
				menor = vetor[i];
			}
		}

		float media = (soma / vetor.length);

		System.out.println("Soma é : " + soma);
		System.out.println("Média é : " + media);
		System.out.println("Maior valor é : " + maior);
		System.out.println("Menor valor é : " + menor);
	}
}
